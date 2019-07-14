package visitor;

public class XiaoHuo implements ElementVisitor{
    public void useAlcohol(){
        System.out.println("用酒");
    }
    public void useKnife(){
        System.out.println("用刀");
    }

    @Override
    public void accept(Visitor v) {
        v.visitXiaoHuo(this);
    }
}
