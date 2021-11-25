package day60_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListVsSet {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add(null);
        System.out.println(list);

        HashSet<String> set= new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        set.add(null);
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }

    }
}
