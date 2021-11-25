package GroupTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingAscendingAndDescending {
    /*
    Write a method that can sort the ArrayList in Ascending order without using the sort method.

     */

    public static void sortAscending(ArrayList <Integer> nums) {   // [5,2,3,7,9,6,1]

      for(int i=0;i< nums.size();i++){

          for(int j = nums.size()-1; j>i; j--){

              if(nums.get(j)<nums.get(i)){

                  Integer temp= nums.get(i);  //nums.get(0)= nums.get(j)  nums[j]=nums[j]
                  nums.set(i,nums.get(j));
                  nums.set(j,temp);
              }
          }
      }

        System.out.println(nums);
    }



    public static void sortDescending(ArrayList <Integer> nums) {   // [5,2,3,7,9,6,1]

        for(int i=0;i< nums.size();i++){

            for(int j = nums.size()-1; j>i; j--){

                if(nums.get(j)>nums.get(i)){

                    Integer temp= nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j,temp);
                }
            }
        }

        System.out.println(nums);
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(7);
        nums.add(9);
        nums.add(100);
        nums.add(6);
        sortAscending(nums);
        sortDescending(nums);


        testMethod(1);
    }


    public static void testMethod(int numr){
        System.out.println("print");
    }
}
