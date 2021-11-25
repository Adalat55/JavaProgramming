package recall_practices.string;

public class RelativeCheck {
    /*
    Given two full names check if the two people are related. They will be considered to be related
if they have the same last name

Input:
          James Bond
          Jamie Bond
Output:
Related

Input:
          James Bond
          Alex Benji
Output:
Not Related

     */

    public static void checkRelated( String fullName1, String fullName2){

        String lastforFirst="";
        String lastforSecond="";

        for (int i =0; i<fullName1.length();i++){
            if(fullName1.charAt(i)==' '){
               lastforFirst=fullName1.substring(i+1);
            }
        }
        for(int i =0;i<fullName2.length();i++){
            if(fullName2.charAt(i)==' '){
                lastforSecond=fullName2.substring(i+1);
            }
        }
        if(lastforFirst.equals(lastforSecond)){
            System.out.println("They are relative");
        }else{
            System.out.println("Not Relative");
        }


    }


    public static void main(String[] args) {
        checkRelated("James Omar","Jamie Bond");
    }
}
