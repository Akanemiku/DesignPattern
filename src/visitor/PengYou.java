package visitor;

public class PengYou implements Visitor {
    public PengYou() {
        System.out.println("朋友来了");
    }

    @Override
    public void visitGuNiang(GuNiang g) {
        g.useTea();
    }

    @Override
    public void visitXiaoHuo(XiaoHuo x) {
        x.useAlcohol();
    }

    @Override
    public void visitShaoGong(ShaoGong s) {
        s.useFish();
    }
}
