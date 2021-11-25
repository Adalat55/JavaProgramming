package day54_abstraction.workplace;

import day54_abstraction.workplace.Tester;

public class WorkPlace {
    public static void main(String[] args) {


        Tester tester = new Tester("QA");
        tester.jobTitle="SDET";
        tester.work();
        tester.sleep(30);


        Developer developer = new Developer("SD");
        developer.jobTitle="Senior Developer";
        developer.work();
        developer.sleep(60);


        Chef chef= new Chef("Senior Chef");
        chef.sleep(65);
        chef.work();

        Server server = new Server("Waiter");
        server.work();
        server.sleep(45);

    }
}
