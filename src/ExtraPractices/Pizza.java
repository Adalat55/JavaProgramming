package ExtraPractices;

public class Pizza {
    /*
    create a custom class for Pizza that should contain the following:variables:size (either small, medium, large)number of cheese toppingnumber of veggie toppingtipconstructormethods:customizeOrder(): allows user to set the size and toppings of PizzacalcCost(): returns the total cost  as double
toString(): get the full information and total cost of PizzaPizza cost is determined by:Small: $10 + $1.5 per pepperoni topping + 1$ per cheese toppingMedium: $12 + $1.5 per pepperoni topping + 1$ per cheese toppingLarge: $14 + $1.5 per pepperoni topping + 1$ per cheese topping
     */

    String size;
    int cheeseNumber, veggieNumber;
    double totalPrice;

    public Pizza(String size, int cheeseNumber, int veggieNumber){
        this.size=size;
        this.cheeseNumber=cheeseNumber;
        this.veggieNumber=veggieNumber;
    }
    public void customizeOrder(){

        System.out.println("You chose pizza size " +size+ ", with "+ cheeseNumber+" cheese and "+ veggieNumber+ " veggies");
    }
    public double calcCost(){

       if(size.equalsIgnoreCase("small")){
           totalPrice+=10;
       }else if(size.equalsIgnoreCase("medium")){
           totalPrice+=12;
       }else if(size.equalsIgnoreCase("large")){
           totalPrice+=14;
       }
       totalPrice+=cheeseNumber * 1;
       totalPrice+=veggieNumber * 1.5;

       return  totalPrice;
    }

    @Override
    public String toString() {
        return "Pizza: \n" +
                "size: " + size  +
                ", cheeseNumber: " + cheeseNumber +
                ", veggieNumber: " + veggieNumber +
                ", totalPrice: $" + totalPrice;
    }

    public static void main(String[] args) {

        Pizza pizzaOne= new Pizza("large", 3, 4);


        pizzaOne.customizeOrder();

        pizzaOne.calcCost();

        System.out.println(pizzaOne);

    }
}
