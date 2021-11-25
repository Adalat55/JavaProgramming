package day48_Static;

public class Song {

    int name;
    String length;
    String author;
    String publisher;
    String genre;

    public Song(int name){
        this.name=name;

    }
    public Song(String name,String length){
        this(5);
        this.length=length;

    }
    public Song(String name,String length, String author){
        this(name,length);
        this.author=author;
    }
    public Song(String name, String length, String author, String publisher){
        this(name, length,author);
        this.publisher=publisher;

    }
    public Song(String name, String length, String author, String publisher,String genre){
        this(name, length, author, publisher);
        this.genre=genre;
    }




}
