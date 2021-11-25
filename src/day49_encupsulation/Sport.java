package day49_encupsulation;

public class Sport {

    /*
    Create a class called Sport
- instance variables: name, number of players, team based (boolean)

- Create a constructor to initialize the three fields

- Encapsulate the variables

- Bonus: pervent negative number of players to assigned and null or empty space to be assigned to name
     */

    private String name;
    private int numOfPlayers;
    private  boolean isTeamBased;

    public Sport(String name, int numOfPlayers, boolean isTeamBased) {
        setName(name);
        setNumOfPlayers(numOfPlayers);
        this.isTeamBased = isTeamBased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null&&!name.contains(" ")){
        this.name = name;
        }
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        if(numOfPlayers>=0){
        this.numOfPlayers = numOfPlayers;}
    }

    public boolean isTeamBased() {
        return isTeamBased;
    }

    public void setTeamBased(boolean teamBased) {
        isTeamBased = teamBased;
    }
}
