package adapter;

public class JapanAdapter implements PowerAdapter{

    private JapanPower japanPower;

    public JapanAdapter(JapanPower japanPower) {
        this.japanPower = japanPower;
    }

    @Override
    public void charge() {
        japanPower.charge110V();
    }
}
