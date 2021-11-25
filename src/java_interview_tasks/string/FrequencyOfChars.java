package java_interview_tasks.string;

import java.util.Arrays;

public class FrequencyOfChars {
    /*
    Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("ABADBACD") ==> A3B2C1D2
     */

    public static String frequencyOfChars(String str){
        String result="";
        String newStr="";
        int count=0;
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (char each: arr){
           newStr+=each;
        }
        newStr=newStr+" ";
        char[]arr2 = newStr.toCharArray();

        for(int i=0;i<arr2.length-1;i++){
            count++;
            if(arr2[i]!=arr2[i+1]){
                result+=arr2[i]+""+count;
                count=0;
            }
        }


       return  result;
    }

    public static void main(String[] args) {

        System.out.println(frequencyOfChars2("ABADABCD"));
    }

    public static String frequencyOfChars2(String str){
        // FrequencyOfChars("ABADBACD") ==> A3B2C1D2

        String uniqChars="";
        String result="";
        for(int i =0;i<str.length();i++){
           if(!uniqChars.contains(str.charAt(i)+"")){
               uniqChars+=str.charAt(i)+"";
            }
        }

        for (int i =0; i<uniqChars.length();i++){
            int count = 0;
            for(int j =0; j<str.length();j++){

                if(uniqChars.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result+=uniqChars.charAt(i)+""+count;
        }




       return result;
    }

}
