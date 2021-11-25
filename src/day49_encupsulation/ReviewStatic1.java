package day49_encupsulation;

public class ReviewStatic1 {

    public static void main(String[] args) {

        System.out.println("A");
    }

    public ReviewStatic1(){
        System.out.println("B");
    }

    static {
        System.out.println("C");
    }

    public void method1(){
        System.out.println("D");
    }
}
