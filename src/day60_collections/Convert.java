package day60_collections;

import java.util.*;

public class Convert {
    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(4,3,1,4,34,3,1,4,5,6,2,1,3));

        //remove all duplicates

        Set<Integer> unique = new HashSet<>(nums);
        System.out.println(unique);
        ArrayList<Integer> nums2= new ArrayList<>(unique);
        System.out.println(nums2);

        Set<String> obj = new HashSet<>();
        obj.add(null);
        obj.add("hello");
        obj.add("$4.0");
        obj.add("100");
        obj.add("hello");
        obj.add("%");


        Set<String> obj2 = new LinkedHashSet<>();
        obj2.add(null);
        obj2.add("hello");
        obj2.add("$4.0");
        obj2.add("100");
        obj2.add("hello");
        obj2.add("%");




        Set<String> obj3 = new TreeSet<>();
       // obj3.add(null);
        obj3.add("hello");
        obj3.add("$4.0");
        obj3.add("100");
        obj3.add("hello");
        obj3.add("%");

        System.out.println("HashSet: "+obj);
        System.out.println("LinkedHashSet: "+obj2);
        System.out.println("TreeSet: "+obj3);


    }
}
