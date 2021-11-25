package replit_practices.Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEveryOther {

    public static ArrayList<String> removeEveryOther(ArrayList<String> words){

        for(int i=0; i<words.size();i++){

            words.remove(i);

        }

return words;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeEveryOther(list));

    }

//    public static void main(String[] args) {
//        ArrayList<String> words =new ArrayList<>();
//        words.add("hi");
//        words.add("yo");
//        words.add("sup");
//        words.add("yolo");
//        words.add("book");
//        words.add("door");
//        words.add("window");
//        System.out.println(removeEverOther(words));
//    }

}
