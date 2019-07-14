package adapter;

public class Client {
    public static void main(String[] args){
        ChinaPower chinaPower = new ChinaPower();
        JapanPower japanPower = new JapanPower();
        USPower usPower = new USPower();

        PowerAdapter powerAdapter = new ChinaAdapter(chinaPower);
        powerAdapter.charge();
    }

}
