package recall_practices.string;

public class BadName {
    /*
    Given a String variable with a message. You will check if the message contains
any of these bad words: “idiot, dumb, heck”
 If the message contains any of those words print: “Message not sent”.
      If the message is bad word free print “Message sent”
     */

    public static void badName(String name){
        if(name.contains("idiot")||name.contains("dumb")||name.contains("heck")){
            System.out.println("Message not sent");
        }else{
            System.out.println("Message sent");
        }

    }
    public static void main(String[] args) {
        badName("are you ok?");
    }
}
