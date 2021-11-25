package GroupTasks;

public class ReverseNegativeNumber {

    public static int reverseNum(int num){

        String numString= num+"";
        String reversed = "";
        int reversedInt=0;

        for(int i =numString.length()-1; i >=1;i--){   //  "- 152"
           reversed+=numString.charAt(i);
        }

        reversedInt=Integer.parseInt(reversed);

        return reversedInt*(-1);
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(-125));
    }

}
