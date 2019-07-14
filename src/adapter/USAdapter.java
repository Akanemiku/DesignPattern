package adapter;

public class USAdapter implements PowerAdapter{

    private USPower usPower;

    public USAdapter(USPower usPower) {
        this.usPower = usPower;
    }

    @Override
    public void charge() {
        usPower.charge120V();
    }
}
