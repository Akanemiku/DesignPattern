package visitor;

public class ChaiLang implements Visitor {

    public ChaiLang() {
        System.out.println("豺狼来了");
    }

    @Override
    public void visitGuNiang(GuNiang g) {
        g.useGun();
    }

    @Override
    public void visitXiaoHuo(XiaoHuo x) {
        x.useKnife();
    }

    @Override
    public void visitShaoGong(ShaoGong s) {
        s.useHarpoon();
    }
}
