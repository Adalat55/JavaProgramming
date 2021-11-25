package office_hours.practice_10_13_2021;

public class Tester {

    String name;
    int employeeId;
    String jobTitle;
    double salary;

    public Tester(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Tester(String name, int employeeId, String jobTitle, double salary) {
        this(name, employeeId);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void smokeTesting(){
        System.out.println(name+ " is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+ " is creating a ticket");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
