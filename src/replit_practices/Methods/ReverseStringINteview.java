package replit_practices.Methods;

import java.util.Scanner;

public class ReverseStringINteview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str= input.nextLine();
        String reverse="";

        for(int i=str.length()-1;i>=0;i--){

            reverse+=str.charAt(i);

        }
        System.out.println("this is the original word: "+str);
        System.out.println("this is the reverse version: "+reverse);

    }
}
