package big_tasks_from_Saim.Entertainment;

import com.sun.xml.internal.ws.server.ServerRtException;

public class KevinHart extends LiveShow {
    /*
    create a class KevinHart
  -> KevinHart is a child of LiveShow

   instance variables:
    - performer (String)
    - date (String format Ex: mm/dd/yyyy)

   constructor:
    - initialize name, company and location, performer, date
     -> call super constructor
     -> hint: name value will be 'Live Show' for all subclasses

create an object of KevinHart to use the constructors, read the value of each variable to
check if everything is working as expected
     */
    String performer;
    String date;

    public KevinHart(String name, String company, String location, String performer, String date) {
        super(name, company, location);
        this.performer = performer;
        this.date = date;
    }

    @Override
    public String toString() {
        return "KevinHart{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", performer='" + performer + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
