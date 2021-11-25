package day57_polymorphism.driver;

public class Web {
    public static void main(String[] args) {

        Link link1= new Link();
        link1.click();
        link1.sendKeys("hello");
        System.out.println(link1.getText());
        System.out.println(link1.getUrl());

        WebElement link2= new Link();
        link2.click();
        link2.sendKeys("hello");
        System.out.println(link2.getText());
       // System.out.println(link2.getUrl());

        WebElement [] alllinks= new Link[3];
        alllinks[0]=link1;
        alllinks[1]=link2;

        WebElement [] elements= new WebElement[3];







    }
}
