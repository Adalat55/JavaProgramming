package recall_practices.string;

import java.util.Locale;

public class CreatingEmail {
    /*
    Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter
than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and
combine them with the last three characters of the second string. At the end of your combined
string add “” and print the final string as your created email. The final email
should be in all lowercase.
     */
    public static void createEmail(String str1, String str2){

        String firstPart="";
        String secondPart="";
        if(str1.length()>=6&&str2.length()>=6){

           firstPart=str1.substring(0,4);
           secondPart=str2.substring(str2.length()-3);

            System.out.println((firstPart+secondPart+"@cybertek.com").toLowerCase());

        }else{
            System.out.println("Invalid data");
        }


    }

    public static void main(String[] args) {
        createEmail("JamesBond", "secret");
    }
}
