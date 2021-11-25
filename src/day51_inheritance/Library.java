package day51_inheritance;

public class Library {
    public static void main(String[] args) {

        Book bookOne = new Book();
        bookOne.title = "James Bond";

        EBook bookTwo= new EBook();
        bookTwo.title="Mindset";
        bookTwo.size=50;

        bookTwo.read();

        AudioBook bookThree= new AudioBook();
        bookThree.title="Leaders eat last";
        bookThree.narrator="James Bond";
        bookThree.duration= 25;
        bookThree.listen();


    }
}
