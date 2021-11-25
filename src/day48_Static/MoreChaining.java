package day48_Static;

public class MoreChaining {

    public MoreChaining(){
        System.out.println("First");
    }

    public MoreChaining(int i ){
        this();
    }

    public MoreChaining(String s, int i  ){
        this(i);
        System.out.println("String one");
     //   this(i)     -> any this() call has to be the first line always

        //we can call only one constructor
    }
    public MoreChaining(char c){
       // this(i);  constructor cant call itself
    }
    public MoreChaining(short a){

    }
    public MoreChaining(byte b){

    }

}
