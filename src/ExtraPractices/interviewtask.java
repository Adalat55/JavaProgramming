package ExtraPractices;

public class interviewtask {

    public static boolean stringCompare(String str1, String str2){
        if(str1.length()>=3&&str2.length()>=3){
            if(str1.substring(str1.length()-2).equals(str2.substring(str2.length()-2)))
            {
                return true;}
        } return false;
    }

    public static void main(String[] args) {
        System.out.println(stringCompare("nadir","ir"));
    }
}
