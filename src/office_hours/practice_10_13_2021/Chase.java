package office_hours.practice_10_13_2021;

public class Chase {
    public static void main(String[] args) {

        ScrumTeam.companyName="Chase";
        ScrumTeam.ceo="James Dimon";

        ScrumTeam team = new ScrumTeam("Rashid", "Mykata", 4);

        System.out.println(team);

        Developer dev1= new Developer("Sydea", 10, "Senior Dev", 200000);

        team.addDeveloper(dev1);

        Developer dev2= new Developer("Irina", 11, "Senior Dev", 200000);

        team.addDeveloper(dev2);

        Tester test1= new Tester("James", 7, "SDET", 150000);

        team.addTester(test1);

        System.out.println(team);


    }
}
