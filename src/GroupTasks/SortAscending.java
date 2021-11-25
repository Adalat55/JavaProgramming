package GroupTasks;

import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        /*
          Q11: Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

Ex:
       int[] arr = {10, 9, 8, 7};
       arr = Sort(arr);  ==>   { 7, 8, 9, 10};
         */

        int[] arr = {10, 9, 8, 7, 5,5,-3, 15};
        int []arr2= new int[arr.length];
        int temp=0;

        for(int i =0; i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                   temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
