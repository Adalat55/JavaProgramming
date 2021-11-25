package big_tasks_from_Saim.Seasons;

public class CheckSeason {
    public static void main(String[] args) {

        Winter winter = new Winter("Winter", 60,20);
        Summer summer = new Summer("Summer",105, 60);
        Fall fall = new Fall("Fall", 90, 50);
        Spring spring = new Spring("Spring", 100, 55);


        System.out.println(winter);
        winter.activity();
        System.out.println(summer);
        summer.activity();
        System.out.println(fall);
        fall.activity();
        System.out.println(spring);
        spring.activity();



    }
}
