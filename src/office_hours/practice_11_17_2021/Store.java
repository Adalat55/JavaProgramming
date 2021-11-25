package office_hours.practice_11_17_2021;

import day53_inheritance.rules.A;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        TShirt shirt1= new TShirt();
        shirt1.wear();

        Clothes shirt2= new TShirt();
        shirt2.wear();

        Object shirt3= new TShirt();

        JacKet jacket1= new JacKet();
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2= new JacKet();
        jacket2.wear();
        ((JacKet)jacket2).putOnHood();

        JacKet jacKet2_5= (JacKet)jacket2;
        jacKet2_5.putOnHood();



        HasHood jacket3= new JacKet();
        ((JacKet)jacket3).wear();
        jacket3.putOnHood();


        ArrayList<Clothes> list = new ArrayList<>();
        list.add(shirt1);
        list.add(shirt2);
        list.add((JacKet)shirt3);
        list.add(jacket1);
        list.add(jacket2);



        for (Clothes each: list){
            each.wear();
        }





    }

    public static void buy(Clothes obj) {



    }
}
