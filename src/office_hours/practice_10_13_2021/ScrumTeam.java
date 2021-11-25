package office_hours.practice_10_13_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    String productOwner;
    String scrumTeam;
    int sprintNumber;
    ArrayList<Developer> allDevelopers;
    ArrayList<Tester> allTesters;

    static String companyName;
    static String ceo;

    public ScrumTeam(int sprintNumber) {
        this.sprintNumber = sprintNumber;
        allDevelopers= new ArrayList<>();
        allTesters = new ArrayList<>();

    }

    public ScrumTeam(String productOwner, String scrumTeam, int sprintNumber) {
        this(sprintNumber);
        this.productOwner = productOwner;
        this.scrumTeam = scrumTeam;


    }

    public void addDeveloper(Developer developer){
        allDevelopers.add(developer);
    }

    public void addDeveloper(Developer [] developers){
        allDevelopers.addAll(Arrays.asList(developers));
    }
    public void addTester(Tester tester){
        allTesters.add(tester);
    }
    public void addTester(Tester [] tester){
        allTesters.addAll(Arrays.asList(tester));
    }
    public void removeTester(int employeeId){
        allTesters.removeIf(each -> each.employeeId==employeeId);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", scrumTeam='" + scrumTeam + '\'' +
                ", sprintNumber=" + sprintNumber +
                ", \nallDevelopers=" + allDevelopers +
                ", \nallTesters=" + allTesters +
                '}';
    }
}
