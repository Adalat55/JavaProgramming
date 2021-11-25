package recall_practices.string;

public class MiddleChar {
    /*
    Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters. b) If the length of the
string is odd there will be one middle character.
     */

    public static void printMiddle(String word){   //table  adalat

        if(word.length()%2==1){
            System.out.println(word.charAt(word.length()/2));
        }else{
            System.out.println(word.substring(word.length()/2-1, word.length()/2+1));
        }

    }

    public static void main(String[] args) {
        printMiddle("redir");
    }
}
