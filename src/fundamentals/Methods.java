package fundamentals;

public class Methods {


    public static void main(String[] args) {
        student();
        System.out.println(addition(5, 5));
    }

    public static void student() {
        System.out.println("student method");
    }

    public static int addition(int val1, int val2) {
        return val1 + val2;
    }
}
