package fundamentals;

public class Switch {


    public static void main(String[] args) {

        int k = 30;

        switch (k) {
            case 10: System.out.println("value is 10"); break;
            case 20: System.out.println("value is 20"); break;
            case 30: System.out.println("value is 30"); break;
            case 40: System.out.println("value is 40"); break;
            case 50: System.out.println("value is 50"); break;
            default:
                System.out.println("this is a default case");
                break;
        }

    }
}
