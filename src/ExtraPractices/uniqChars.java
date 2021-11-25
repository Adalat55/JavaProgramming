package ExtraPractices;

import java.util.ArrayList;
import java.util.Arrays;



public class uniqChars {
    public static ArrayList<Character> uniqChars(String str){

        ArrayList<Character> list = new ArrayList<>();

        char [] arr = str.toCharArray();

        for(int i =0; i<arr.length;i++){

            int counter=0;

            for(int j =0; j<arr.length; j++){


                if(arr[i]==arr[j]){

                    counter++;
                }
            }
            if(counter==1){
               list.add(arr[i]);
            }
        }

        return list;


    }

    public static void main(String[] args) {
        System.out.println(uniqChars("string"));
    }
}
