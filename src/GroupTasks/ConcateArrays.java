package GroupTasks;

import java.util.Arrays;

public class ConcateArrays {

    public static int [] concatArrays( int[] arr1, int [] arr2){

        int[] mergedArray = new int[arr1.length+arr2.length];
        int index=0;

        for(int i =0; i<arr1.length;i++){
            mergedArray[index++]= arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            mergedArray[index++]=arr2[j];
        }


       return mergedArray;

    }

    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        int[] arr2= {4,5,6};
        System.out.println(Arrays.toString(concatArrays(arr1,arr2)));
    }
}
