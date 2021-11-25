package big_tasks_from_Saim.Seasons;

public class Season {
    /*
    Create a class Season

 instance variables
  - name (String)
  - highest average temperature
  - lowest average temperature

 constructor:
  - initialize all fields

 methods:
  - activity(), toString()
     */
    String name;
    int highestAveTemp;
    int lowestAveTemp;

    public Season(String name, int highestAveTemp, int lowestAveTemp) {
        this.name = name;
        this.highestAveTemp = highestAveTemp;
        this.lowestAveTemp = lowestAveTemp;
    }
    public void activity(){

    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAveTemp=" + highestAveTemp +
                ", lowestAveTemp=" + lowestAveTemp +
                '}';
    }
}
