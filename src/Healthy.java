public class Healthy extends Hamburger {
    private boolean extra;

    public Healthy(String roleType, String mymeat, double price, boolean extra) {
        super(roleType, mymeat, price);
        this.extra = extra;
    }
}
