/*
Charles Lett Jr.
February 3, 2022 (Happy B-Day Me!)
Desc: custom ArrayList data structure
 */

import java.io.FileNotFoundException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        INTBearArray test_array = new INTBearArray();

        test_array.demo();
        // test_array.replace(1, 419);
        // test_array.print();
        test_array.stats();

    }
}
