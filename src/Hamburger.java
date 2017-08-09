public class Hamburger {
    private String roleType;
    private String mymeat;
    private Meat meat;
    private double price;
    private Toppings toppings;

//    roll type, meat, and price.


    public Hamburger(String roleType,String mymeat, double price) {
        this.roleType = roleType;
        this.mymeat = mymeat;
        this.price = price;
        System.out.println("Hamburger --> Basic Hamburger Created");

    }
}
class Meat {
    public Meat(){
        System.out.println("Hello!!");
    }
}
