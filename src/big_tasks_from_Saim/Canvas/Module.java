package big_tasks_from_Saim.Canvas;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.nio.file.Files;
import java.util.ArrayList;

public class Module {
    /*
    create a class Module

  instance variables:
   - files (ArrayList of File objects)

  constructor:
   - no parameter -> create empty ArrayList object
   - initialize with given ArrayList of Files
    -> Use chaining

  methods:
   - toString: print all the module information
   - addFile(File): accept a File object and add the given File to the ArrayList
of Files of that module
Unit 5 - Problem Set

   - removeFile(File): accepts a File object and remove the given File from
the ArrayList of Files of that module
     */
    ArrayList<File> files;

    public Module()
    {
        files=new ArrayList<>();
    }

    public Module(ArrayList<File> files) {
        this();
        this.files.addAll(files);

    }

    @Override
    public String toString() {
        return "Module{" +
                "files=" + files +
                '}';
    }
    public void addFile(File newFile){
        files.add(newFile);
    }
    public void removeFile(File removedFile){

        files.remove(removedFile);
    }

    public static void main(String[] args) {
        Module module1 = new Module();

        //File notes = new File("Nadirs Pdf", 0.3);
       // module1.addFile(notes);
        File file = new File("Adalats files", 2.3);
        File file2 = new File("Hamids files",2.4);
        file.openFile();


        module1.addFile(new File("Saims notes", 0.5));
        module1.addFile(new File("Nadirs pdf", 1.2));
        module1.addFile(file2);
        module1.addFile(file);

        System.out.println(module1);

        module1.removeFile(file);
       // module1.removeFile();
        System.out.println(module1);
       // module1.adFile();

    }

}
