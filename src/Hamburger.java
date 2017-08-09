public class Hamburger {
    private String roleType;
    private String mymeat;
    private Meat meat;
    private double price;
    private Toppings toppings;

//    roll type, meat, and price.


    public Hamburger(String roleType, Meat meat, double price) {
        this.roleType = roleType;
        this.meat = meat;
        this.price = price;

    }
}
class Meat {
    public Meat(){
        System.out.println("Hello!!");
    }
}
