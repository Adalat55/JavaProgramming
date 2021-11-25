package recall_practices.string;

public class SMSParts {
    /*
    Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and
problem solving}”
Separate these parts and print them separately:
Sender: actualSender
Number: actualNumber
Message: actualMessage”
     */
    public static void smsParts(String str){

        String sender="Sender: ";
        String number="Number: ";                   //
        String message="Message: ";                //

        int indexOfSenderOp= str.indexOf('<');
        int indexOfSenderCl= str.indexOf('>');

        int indexOfNumberOp=str.indexOf('[');
        int indexOfNumberCl= str.indexOf(']');

        int indexOfMessageOp= str.indexOf('{');
        int indexOfMessageCl= str.indexOf('}');

        sender+= str.substring(indexOfSenderOp+1,indexOfSenderCl);
        number+= str.substring(indexOfNumberOp+1, indexOfNumberCl);
        message+=str.substring(indexOfMessageOp+1,indexOfMessageCl);

        System.out.println(sender);
        System.out.println(number);
        System.out.println(message);

    }

    public static void main(String[] args) {
        smsParts("Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming}");


    }
}
