package visitor;

import java.util.ArrayList;
import java.util.List;

public class MotherLand implements ElementVisitor {

    private List<ElementVisitor> list = new ArrayList<>();

    public void addNode(ElementVisitor e) {
        list.add(e);
    }

    @Override
    public void accept(Visitor v) {
        for (int i = 0; i < list.size(); i++) {
            ElementVisitor e = list.get(i);
            e.accept(v);
        }
    }
}
