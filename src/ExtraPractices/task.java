package ExtraPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task {

    public static ArrayList<Integer> returnList(int[] arr) {


        ArrayList<Integer> list =new ArrayList<>();

        for(int each:arr){
            list.add(each);
        }

        for (int i = 0; i < list.size(); i++){

            if (list.get(i) == 0){
                list.add(list.remove(i));
            }

        }
return list;
    }
    public static void main(String[] args) {

        int [] arr = {1,0,4,0,5,4,0,9};

        System.out.println(returnList(arr));

    }
}