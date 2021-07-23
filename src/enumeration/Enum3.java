package enumeration;

public class Enum3 {

    enum Transport {
        PLANE(600), TRAIN(180), CAR(100);

        private int speed;

        private Transport(int s) {
            speed = s;
        }

        public int getValue() {
            return speed;
        }
    }

    public static void main(String[] args) {
        System.out.println(Transport.PLANE.speed);
        System.out.println(Transport.PLANE.ordinal());
        System.out.println(Transport.PLANE.getValue());

        // get index of the enum value
        Transport tp = Transport.CAR;
        System.out.println(tp.ordinal());

        if (tp.ordinal() < 2) {
            System.out.println("less than 2");
        } else {
            System.out.println("greater than 2");
        }

    }
}
