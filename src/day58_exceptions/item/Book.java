package day58_exceptions.item;

public class Book extends Item {

    public Book(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println("reading book");
    }
}
