package GroupTasks;

public class PrintConsecutiveNumbers {

    /*
    Numbers -- print consecutive numbers:
- Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders
     */

    public static void printNumbers(int n){

        if(n>0){
            String result="";

            for(int i=1;i<=n;i++){

                boolean divBy2=i%2==0;
                boolean divBy3=i%3==0;
                boolean divBy5=i%5==0;

                result=i+"";

                if(divBy2||divBy3||divBy5){
                    result="";
                }
                if(divBy2){
                    result+="Codility";
                }
                if(divBy3){
                    result+="Test";
                }
                if(divBy5){
                    result+="Coders";
                }
                System.out.println(result);
            }

        }else{
            System.out.println("Not Valid Number!");
        }
    }
    public static void main(String[] args) {
        printNumbers(35);
    }

}
