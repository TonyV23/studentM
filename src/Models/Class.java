package Models;

import InputOutput.Io;

import java.util.ArrayList;

import static Models.Faculty.All_faculties_list;
import static Models.Faculty.displayAllFaculties;

public class Class {
    private String class_name;
    private Faculty faculty_name;


    // the constructor

    public Class(String class_name, Faculty faculty_name){
        this.class_name = class_name;
        this.faculty_name = faculty_name;
        All_class_list.add(this);
    }

    static ArrayList<Class> All_class_list = new ArrayList<>();

    // the empty constructor

    public Class(){}

    // Getters and Setters


    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public Faculty getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(Faculty faculty_name) {
        this.faculty_name = faculty_name;
    }

    // methods about handling departments

    public static void createNewClass(){
        if (!All_faculties_list.isEmpty()){
            displayAllFaculties();
            new Class(Io.setString("Class name :"),All_faculties_list.get(Io.setINT("Number of faculty :")));
        }else
            System.err.print("\n******* Error no faculty registered *******\n");
    }

    public static void updateClass(){
        if (!All_class_list.isEmpty()){
            System.err.print("\nLIST OF ALL FACULTIES\n");
            displayAllFaculties();
            System.err.print("\nLIST OF ALL CLASS\n");
            displayAllClass();
            All_class_list.set(Io.setINT("Number of class to update :")-1,
                    new Class(Io.setString("class name :"),All_faculties_list.get(Io.setINT("Number of faculty :")-1)));
            All_class_list.remove(All_class_list.size()-1);
            System.out.print("\n******* UPDATED LIST OF CLASS *******\n");
            displayAllClass();
        }else
            System.err.print("\n ******* Error no class registered ******* \n");
    }

    public static void removeClass(){
        if (!All_class_list.isEmpty()){
            displayAllClass();
            All_class_list.remove(Io.setINT("Number of class to remove :")-1);
            System.out.print("\n******* UPDATED LIST OF CLASS *******\n");
            displayAllClass();
        }else
            System.err.print("\n ******* Error no class registered ******* \n");

    }

    public static void displayAllClass(){
        if ( !All_class_list.isEmpty()){
            for (int i=0; i< All_class_list.size(); ++i){
                System.out.print(
                        i+1+">>>>>Class name :"+All_class_list.get(i).getClass_name()+"\t"+
                                "Faculty name :"+All_faculties_list.get(i).getFaculty_name()+"\n"
                );
            }
        }else
            System.err.print("\n ******* Error no class registered ******* \n");
    }
}
