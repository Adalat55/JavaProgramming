package GroupTasks;

public class DivideWithoutOperator {
    /*
    and 3. Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.

     */

    public static double divWithoutDivision(int dividend, int divisor){


        int count=0;                                 // -3    10/3=3.3333  10/3= 1
        int temp1=dividend;
        int temp2=divisor;
        int remainder=0;

            if(dividend<0||divisor<0){
               dividend=Math.abs(dividend);   // num<0? -num : num   -9   -3   =3
               divisor=Math.abs(divisor);
            }
            while(dividend>=divisor) {   //9   3
                dividend -= divisor;
                count++;
                if(divisor>dividend){
                    remainder=divisor;
                }
                //3

              
            }
            if(temp1<0){
                count*=(-1);} //-3            }
            if(temp2<0){
                count*=(-1); // 3
            }

        return  count;

    }
    public static void main(String[] args) {
        System.out.println(divWithoutDivision(100,3));
    }
}
/*if (num1<0||num2<0){
        if(num1<0){
        num1=num1*(-1)}
        if(num2<0){
        num2=num2*(-1)}
        }
        */
