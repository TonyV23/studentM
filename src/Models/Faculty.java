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
        if (All_faculties_list.size()>0){
            displayAllFaculties();
            All_faculties_list.remove(Io.setINT("Number of faculty to remove :")-1);
            System.err.print("\n ******* Updated of All faculties list *******\n");
            displayAllFaculties();
        }else
            System.err.print("\n******* Error faculties' list is empty for now please save some Faculties and try again this operation *******\n");
    }


    public static void updateFaculty(){
        if (All_faculties_list.size()>0){
            displayAllFaculties();
            All_faculties_list.set(Io.setINT("Number of faculty to update :")-1,new Faculty(Io.setString("New faculty name :"),Io.setString("Add Faculty about :")));
            System.err.print("\n ******* Updated All faculties list *******\n");
            All_faculties_list.remove(All_faculties_list.size()-1);
            displayAllFaculties();
        }else
            System.err.print("\n******* Error faculties' list is empty for now please save some Faculties and try again this operation *******\n");
    }

    public static void displayAllFaculties(){
        if ( All_faculties_list.size()> 0){
            for (int i=0; i< All_faculties_list.size(); ++i){
                System.out.print(
                        i+1+">>>>>Faculty name :"+All_faculties_list.get(i).getFaculty_name()+"\t"+
                                "About Faculty :"+All_faculties_list.get(i).getFaculty_about()+"\n"
                );
            }
        }else
            System.err.print("\n******* Error faculties' list is empty for now please save some Faculties and try again this operation *******\n");
    }
}
