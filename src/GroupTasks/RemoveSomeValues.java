package GroupTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValues {
    /*
    . ArrayList -- Remove some values
- Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static ArrayList<Integer> removeSomeValues( ArrayList<Integer> numbers){

        numbers.removeIf(n-> n>100);
        return numbers;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,120, 400,5,39, 40,500, 150));
        System.out.println(removeSomeValues(list));
    }
}
