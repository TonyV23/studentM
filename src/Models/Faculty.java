package Models;

import InputOutput.Io;

import java.util.ArrayList;

public class Faculty {
    private String faculty_name;
    private String faculty_about;

    // the Faculty's constructor

    public Faculty(String faculty_name, String faculty_about){
        this.faculty_name = faculty_name;
        this.faculty_about = faculty_about;
        All_faculties_list.add(this);
    }

    static ArrayList<Faculty> All_faculties_list = new ArrayList<>();

    // the empty constructor

    public Faculty(){}

    // Getters and Setters


    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public String getFaculty_about() {
        return faculty_about;
    }

    public void setFaculty_about(String faculty_about) {
        this.faculty_about = faculty_about;
    }

    // method about handling faculties

    public static void createNewFaculty(){
         new Faculty(Io.setString("Faculty name :"),Io.setString("Faculty about :"));
    }

    public static void removeFaculty(){
        displayAllFaculties();
        All_faculties_list.remove(Io.setINT("Number of faculty to remove :")-1);
        System.out.print("Updated List :" +All_faculties_list);
    }


    public void updateFaculty(){
        displayAllFaculties();
        All_faculties_list.set(Io.setINT("Number of faculty to update :"),new Faculty(Io.setString("New faculty name :"),Io.setString("Add Faculty about :")));
    }


    public static void displayAllFaculties(){
        System.out.print("All faculties list :" +All_faculties_list);
    }
}
