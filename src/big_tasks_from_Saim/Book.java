package big_tasks_from_Saim;

import day53_inheritance.rules.B;

public class Book {
    static String author= "J.K. Rowling";

    static {
        author="stefen king";

    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.author="Christofor Paolini";

        Book b2 = new Book();
        System.out.println(b1.author+ " "+b2.author);
    }
}
