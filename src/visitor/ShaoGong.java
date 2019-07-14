package visitor;

public class ShaoGong implements ElementVisitor{
    public void useFish(){
        System.out.println("用鱼");
    }
    public void useHarpoon(){
        System.out.println("用三叉戟");
    }

    @Override
    public void accept(Visitor v) {
        v.visitShaoGong(this);
    }
}
