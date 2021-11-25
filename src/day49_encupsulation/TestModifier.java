package day49_encupsulation;

public class TestModifier {
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
//        obj.a=1;
//        obj.b=2;
      //  obj.c=3; --> c is private so we cannot accecc is outside of the class

        AccessModifier acc= new AccessModifier();
        acc.method1(100);

    }
}
