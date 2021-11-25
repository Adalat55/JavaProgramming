package GroupTasks;

public class Divisibleby3_5_15 {
    /*
    . Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

     */
    public static void printNumbers(){
        String  divisibleBy15="";
        String divisibleBY3="";
        String divisibleBy5="";
        for(int i =1; i<=100;i++) {

            if (i % 15 == 0) {
                divisibleBy15 += i + " ";
            } else if (i % 3 == 0) {
                divisibleBY3 += i + " ";
            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            }
        }

            System.out.println("divisibleBy15: "+divisibleBy15);
            System.out.println("divisibleBY3: "+divisibleBY3);
            System.out.println("divisibleBy5: "+divisibleBy5);

    }

    public static void main(String[] args) {
        printNumbers();
    }
}
