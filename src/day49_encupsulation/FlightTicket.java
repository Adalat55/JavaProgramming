package day49_encupsulation;

public class FlightTicket {

    private String type;
    private String location;
    private String arrivalLoc;

    public FlightTicket(String type, String location, String arrivalLoc) {
        setType(type);
        this.location = location;
        this.arrivalLoc = arrivalLoc;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {

        switch (type){
            case "first":
            case "business":
            case "economy":
                this.type = type;
        }
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArrivalLoc() {
        return arrivalLoc;
    }
    public void setArrivalLoc(String arrivalLoc) {
        this.arrivalLoc = arrivalLoc;

    }

    public static void main(String[] args) {
        FlightTicket ticket = new FlightTicket("A","B","C");

        System.out.println(ticket.getArrivalLoc());
    }
}
