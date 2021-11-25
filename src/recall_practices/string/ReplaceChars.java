package recall_practices.string;

public class ReplaceChars {
    /*
    Given a String message with some text and a number (1-3) replace certain characters from the
String message.
When the number is:
        1: replace 'a' with 'e'
        2: replace 's' with 'r'
        3: replace 'o' with 'z'
     */
    public static void replaceChars(String  str, int num){

        for(int i =0; i<str.length();i++){

            if(num==1){
                    str=str.replace('a','e');
            }
            else if(num==2){
                    str=str.replace('s','r');
            }
            else if(num==3){
                    str=str.replace('o','z');
            }

        }
        System.out.println(str);

    }

    public static void main(String[] args) {
        replaceChars("java class is fun",3);
    }
}
