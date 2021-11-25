package office_hours.practice_11_10_2021;

public class EncryptingString {
    public static String returnEncrypted(String str){  //apple
      String returnString="";
      char each;

        for(int i=0;i<str.length();i++){
          //  each=(char) str.charAt(i)+2;
            returnString+=str.charAt(i);
        }




        return returnString;
    }

    public static void main(String[] args) {
        System.out.println(returnEncrypted("Apple"));
    }
}
