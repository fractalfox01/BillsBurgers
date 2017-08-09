import java.util.Scanner;

public class Hamburger {
    private String roleType;
    private String mymeat;
    private double price;
    private Toppings toppings;

//    roll type, meat, and price.


    public Hamburger(String roleType,String mymeat, double price) {
        this.roleType = roleType;
        this.mymeat = mymeat;
        this.price = price;
        System.out.println("Hamburger --> Basic Hamburger Created");
        boolean[] tops = new boolean[4];
        tops = chooseTopping();
        Toppings mytoppings = new Toppings(tops[0],tops[1],tops[2],tops[3]);

    }
    public static boolean[] chooseTopping(){
        boolean[] ret = new boolean[4];
        int chosen = 0;
        Scanner scan = new Scanner(System.in);
        while(chosen != 4) {

            System.out.println("Toppings chosen so far: " + chosen);
            System.out.println("Choose Toppings (Maximum is 4)");
            System.out.println("\t1 for\tLettuce\n");
            System.out.println("\t2 for\tKetchup\n");
            System.out.println("\t3 for\tMustard\n");
            System.out.println("\t4 for\tGuacamole\n");
            System.out.println("\t5 for\tPickle\n");
            int topping = scan.nextInt();
            switch (topping){
                case 1:
                    chosen++;
                    ret[0] = true;
                    break;
                case 2:
                    chosen++;
                    ret[1] = true;
                    break;
                case 3:
                    chosen++;
                    ret[2] = true;
                    break;
                case 4:
                    chosen++;
                    ret[3] = true;
                    break;
                case -1:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Try again");
                    topping = scan.nextInt();

            }
        }
        for (boolean i:ret){
            System.out.println("value is" + i);
        }
        return ret;

    }
}

