package recall_practices.string;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestWithA {
    /*
    Given three String variables of some text find and print the longest word that also
contains 'a'
    Ex:
        "java"
        "mouse"
        "computer"
        Output: java
    Ex:
        "java"
        "mouse"
        "apples"
        Output: apples
Challenge: Instead of just checking for 'a' add another variable that can be used to
check for any character.

     */

    public static String longestWithChar (String word1, String word2, String word3, String givenLetter){

        if(word1.contains(givenLetter)||word2.contains(givenLetter)||word3.contains(givenLetter)) {

            ArrayList<String> words = new ArrayList<>(Arrays.asList(word1, word2, word3));

            words.removeIf(n -> !n.contains(givenLetter));

            String longest = words.get(0);
            for (String eachWord : words) {
                if (eachWord.length() > longest.length()) {
                    longest = eachWord;
                }
            }

            return longest;

        }else {

            return "None of the words contains the given letter";
        }
}
    public static void main(String[] args) {

        System.out.println(longestWithChar("java","mouse","apples","m"));
    }
}
