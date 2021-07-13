package fundamentals;

public class NestedForLoop {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println(j);
            }

            System.out.println("========");
            if (i == 3) break;
        }

    }
}
