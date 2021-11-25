package day49_encupsulation;

public class UseSport {
    public static void main(String[] args) {

        Sport team1 = new Sport("Galatasaray",11, true);

        System.out.println(team1.getName());
        System.out.println(team1.getNumOfPlayers());
        System.out.println(team1.isTeamBased());

        team1.setName("Fenerbahce");
        team1.setNumOfPlayers(12);
        team1.setTeamBased(false);

        System.out.println(team1.getName());
        System.out.println(team1.getNumOfPlayers());
        System.out.println(team1.isTeamBased());


    }
}
