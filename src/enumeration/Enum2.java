package enumeration;

import java.util.Arrays;

public class Enum2 {

    enum Transport {
        PLANE, TRAIN, CAR
    }

    public static void main(String[] args) {

        Transport tp[] = Transport.values();

        for (Transport t : tp) {
            System.out.println(t);
        }

        System.out.println(Arrays.toString(Transport.values()));

    }
}
