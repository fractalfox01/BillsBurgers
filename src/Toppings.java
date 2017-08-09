public class Toppings {
    private boolean ketchup;
    private double ketchuoPrice = 0.10d;
    private boolean mustard;
    private double mustardPrice = 0.15d;
    private boolean lettuce;
    private double lettucePrice = 0.55d;
    private boolean guacamole;
    private double guacamolePrice = 1.10d;
    private boolean tomato;
    private double tomatoPrice;


    public Toppings(boolean ketchup, boolean mustard, boolean lettuce, boolean guacamole) {
        this.ketchup = ketchup;
        this.mustard = mustard;
        this.lettuce = lettuce;
        this.guacamole = guacamole;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public boolean isMustard() {
        return mustard;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isGuacamole() {
        return guacamole;
    }
}
