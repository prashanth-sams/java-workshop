package fundamentals;

public class NestedIfElse {


    public static void main(String[] args) {

        int k = 8;

        if (k > 10) {
            System.out.println(k + " greater than 10");
        } else {
            if (k == 10) System.out.println(k + " is equal to 10");
            else {
                System.out.println(k + " lesser than 10");
            }
        }
    }
}
