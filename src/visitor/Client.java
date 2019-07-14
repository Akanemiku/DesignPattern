package visitor;

public class Client {
    public static void main(String[] args){
        GuNiang g = new GuNiang();
        XiaoHuo x = new XiaoHuo();
        ShaoGong s = new ShaoGong();
        MotherLand motherLand = new MotherLand();
        motherLand.addNode(g);
        motherLand.addNode(x);
        motherLand.addNode(s);

        Visitor v = new PengYou();
        motherLand.accept(v);

        v = new ChaiLang();
        motherLand.accept(v);
    }
}
