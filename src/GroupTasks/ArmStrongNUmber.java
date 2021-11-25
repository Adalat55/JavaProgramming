package GroupTasks;

public class ArmStrongNUmber {   //370    3^3+7^3+0^3==370    8 2 0 8   8^4+2^4+0^4+8^4==8208

    public static void armstrongNumber(int num){

        String [] digits = (num+"").split("");  //String.pars    5+""   {"3","7","0"}  '3'
        int sumOfDigits=0;

        for(String eachDigit: digits){              //3
            sumOfDigits+=Math.pow(Integer.parseInt(eachDigit),digits.length);  //Math.pow(0,3)
        }
        if(sumOfDigits==num){
            System.out.println("Number is Armstrong!");
        }else{
            System.out.println("Not Armstrong!");
        }

    }
    public static void main(String[] args) {
        armstrongNumber(8208);   // num* num * num    //8^4+2^4+0^4+8^4=8208
    }
}
