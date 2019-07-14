package visitor;

public class GuNiang implements ElementVisitor{
    public void useTea(){
        System.out.println("用茶");
    }
    public void useGun(){
        System.out.println("用枪");
    }

    @Override
    public void accept(Visitor v) {
        v.visitGuNiang(this);
    }
}
