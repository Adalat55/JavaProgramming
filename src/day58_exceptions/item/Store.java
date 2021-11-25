package day58_exceptions.item;

public class Store {
    public static void main(String[] args) {

        Eragon obj1=new Eragon();  //itself

        Book obj2= new Eragon();  //parent

        Item obj3= new Eragon();  //parent

        obj1.sell();
        ((Eragon)obj2).sell();
        ((Eragon)obj3).sell();

        purchase(new Item("wooden spoon"));
        purchase(obj1);
        purchase(new Book("Harry Poter"));



        //  new Book("").use(); execution happens from right side/object side

    }

    public static void purchase(Item item){

        System.out.println("Perchasing the "+item.name);


    }



}
