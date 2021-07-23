/**
 * Author: Prashanth Sams
 * enum is a data type which is more like a class, where you can set the value unchanged - it has a fixed set of constants
 * enums can have variables, constructors, and methods
 **/
package enumeration;

public class Enum1 {

    enum Transport {
        PLANE, TRAIN, CAR
    }

    public static void main(String[] args) {

        Transport transport = Transport.PLANE;
        if (transport == Transport.PLANE) System.out.println("PLANE");

        Transport transport1 = Transport.valueOf("CAR");
        System.out.println(transport1);
    }
}
