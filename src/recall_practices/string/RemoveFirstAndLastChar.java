package recall_practices.string;

public class RemoveFirstAndLastChar {
    /*
    Given two words. Print the first word without its first character then print the second word
without its last character.
     */

    public static void printWithout(String word1, String word2){

        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0, word2.length()-1));
    }

    public static void main(String[] args) {
        printWithout("java", "apple");
    }
}
