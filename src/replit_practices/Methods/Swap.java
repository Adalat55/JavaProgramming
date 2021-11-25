package replit_practices.Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap {
    /*
    In this assignment you will swap a position in an array list with another.

swap() gets 3 arguments, an Arraylist, a position, and another position to swap with.

swap(["one","two","three"],0,2)

returns:["three","two","one"]
     */

    public static ArrayList<String> swap(ArrayList<String> list, int posFrom, int posTo){

        ArrayList<String > list2= new ArrayList<>(3);

       // Collections.copy(list,list2);

        list2.add(posTo,list.remove(posFrom));
        list2.add(list.get(1));
        list2.add(posFrom,list.remove(posTo));



        return list2;
    }

    public static void main(String[] args) {
        ArrayList<String >arrList= new ArrayList<>();
        arrList.add("one");
        arrList.add("two");
        arrList.add("three");


        System.out.println(swap(arrList,0,2));
    }
}
