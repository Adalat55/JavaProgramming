package ExtraPractices;

public class UseSport {
    public static void main(String[] args) {

        Sport team1 = new Sport("Barca",11, true);

        System.out.println(team1.getName());
        System.out.println(team1.getNumOfPlayers());
        System.out.println(team1.isTeamBased());

        team1.setName("RealMadrid");
        team1.setNumOfPlayers(15);
        team1.setTeamBased(false);

        System.out.println(team1.getName());
        System.out.println(team1.getNumOfPlayers());
        System.out.println(team1.isTeamBased());






    }
}
