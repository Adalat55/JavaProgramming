package recall_practices.string;

public class MOveFirstWord {
    /*
    Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
Input: "Java is a fun language"
Output: is a fun language Java
Hint: Use indexOf and substring
     */

    public static void moveFirstWord(String str){  //"Java is a fun language"

        String firstWord="";
        String remainingBody="";


        for(int i=0; i<str.length();i++) {
            if (str.charAt(i) == ' ') {

                firstWord = str.substring(0, i);

                remainingBody = str.substring(i + 1);

                break;
            }
        }
        System.out.println(remainingBody+" "+firstWord);

    }

    public static void main(String[] args) {
        moveFirstWord("Java is a fun language");
    }
}
