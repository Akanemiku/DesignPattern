package adapter;

public class ChinaAdapter implements PowerAdapter{

    private ChinaPower chinaPower;

    public ChinaAdapter(ChinaPower chinaPower) {
        this.chinaPower = chinaPower;
    }

    @Override
    public void charge() {
        chinaPower.charge220V();
    }
}
