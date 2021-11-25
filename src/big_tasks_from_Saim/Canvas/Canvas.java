package big_tasks_from_Saim.Canvas;

import java.util.ArrayList;

public class Canvas {
    /*
    create a class Canvas

  instance variables:
   - topic (String)
   - quizzes (ArrayList of Quiz objects)
   - modules (ArrayList of Module objects)

  constructor:
   - initialize topic
    -> create empty ArrayList objects for quizzes and modules
   - overload to accept the ArrayList of Quizzes and ArrayList of Module
    + chain the constructors
     */

    String topic;
    ArrayList<Quiz> quizzes ;
    ArrayList<Module> modules;


    public Canvas(String topic) {
        this.topic = topic;
        quizzes= new ArrayList<>();
        modules= new ArrayList<>();
    }
    public Canvas(String topic,ArrayList<Quiz> quiz, ArrayList<Module> module){
        this(topic);
        quizzes.addAll(quiz);
        modules.addAll(module);

    }

    @Override
    public String toString() {
        return "Canvas{" +
                "topic='" + topic + '\'' +
                ", quizzes=" + quizzes +
                ", modules=" + modules +
                '}';
    }

    public static void main(String[] args) {
        Quiz quiz1 = new Quiz("java",23,4.5 );
        ArrayList<Quiz>arrForQuizzes = new ArrayList<>();
        arrForQuizzes.add(quiz1);

        File file1 = new File("Nadirs pdf",3.4);
        ArrayList<File> arrForFiles= new ArrayList<>();
        arrForFiles.add(file1);
        Module module1 = new Module(arrForFiles);




        System.out.println(arrForQuizzes);
        System.out.println(arrForFiles);

//Canvas can=new Canvas("test",arrForQuizzes,module1);

      //  System.out.println(can);

    }
}
