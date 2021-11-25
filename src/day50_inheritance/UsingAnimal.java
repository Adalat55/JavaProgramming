package day50_inheritance;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.age = 10;

        Dog dog = new Dog();
        dog.age=10;
        dog.hasTail=true;

        Lion lion=new Lion();
        lion.numberOfClaws=5;
        lion.roar();
    }
}
