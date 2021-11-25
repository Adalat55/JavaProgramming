package office_hours.practice_11_03_2021;

public class LiveShow extends  Entertainment {

    String location;

    public LiveShow(String company, String location) {
        super("Live Show", company);
        this.location = location;
    }
}
