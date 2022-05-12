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
        displayAllFaculties();
        new Class(Io.setString("Class name :"),All_faculties_list.get(Io.setINT("Number of faculty :")));
    }

    public static void updateClass(){
        displayAllClass();
        All_class_list.set(Io.setINT("Number of department to update :")-1,new Class(Io.setString("class name :"),All_faculties_list.get(Io.setINT("Number of faculty :"))));
    }

    public static void removeClass(){
        displayAllClass();
        All_class_list.remove(Io.setINT("Number of department to remove :")-1);
        System.out.print("Updated List :" +All_class_list);
    }

    public static void displayAllClass(){
        System.out.print("All class list :"+All_class_list);
    }

}
