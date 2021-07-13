package fundamentals;

import java.util.Iterator;
import java.util.List;

public class ForEachLoop {


    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "orange", "banana", "cherry");

        for (Iterator<String> i = fruits.iterator(); i.hasNext();) {
            String item = i.next();
            System.out.println(item);
        }
    }
}
