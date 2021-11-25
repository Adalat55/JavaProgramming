package day54_abstraction.hiding;

public class Parent {

    public static void hello(){
        System.out.println(" Hello from Parent");
    }
}

class Child extends  Parent{


}

class Main {
    public static void main(String[] args) {

        Parent.hello();
        Child.hello();
    }
}
