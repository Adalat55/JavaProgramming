package office_hours.practice_11_03_2021;

public class GetEntertained {

    public static void main(String[] args) {


        NetflixShow netflix = new NetflixShow(60, "Breaking Bad", 5, 2);

        System.out.println(netflix);
        System.out.println(netflix.name);
        System.out.println(netflix.showName);

        KevinHart kevin = new KevinHart("Chicago","special name", "11/4/21");

        System.out.println(kevin.location);
        System.out.println(kevin.company);
        System.out.println(kevin.name);
        System.out.println(kevin.date);
        System.out.println(kevin.special);

    }
}
