package day57_polymorphism.driver;

public class Input implements WebElement{
    @Override
    public void sendKeys(String txt) {
        System.out.println("sending  "+txt);
    }

    @Override
    public void click() {
        System.out.println("waiting for text");

    }

    @Override
    public String getText() {
        return "inputs name";
    }
}
