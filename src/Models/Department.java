package Models;

import InputOutput.Io;

import java.util.ArrayList;

import static Models.Faculty.All_faculties_list;
import static Models.Faculty.displayAllFaculties;

public class Department {
    private String department_name;
    private Faculty faculty_department_name;

    // the Department constructor

    public Department(String department_name, Faculty faculty_department_name){
        this.department_name = department_name;
        this.faculty_department_name = faculty_department_name;
        All_departments_list.add(this);
    }

    static ArrayList<Department> All_departments_list = new ArrayList<>();

    // the empty Constructor

    public Department(){}

    // Getters and Setters


    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Faculty getFaculty_department_name() {
        return faculty_department_name;
    }

    public void setFaculty_department_name(Faculty faculty_department_name) {
        this.faculty_department_name = faculty_department_name;
    }

    // methods about handling departments

    public static void createNewDepartment(){
        displayAllFaculties();
        new Department(Io.setString("Department name :"),All_faculties_list.get(Io.setINT("Number of faculty :")));
    }

    public static void updateDepartment(){
        displayAllDepartments();
        All_departments_list.set(Io.setINT("Number of department to update :")-1,new Department(Io.setString("Department name :"),All_faculties_list.get(Io.setINT("Number of faculty :"))));
    }

    public static void removeDepartment(){
        displayAllDepartments();
        All_departments_list.remove(Io.setINT("Number of department to remove :")-1);
        System.out.print("Updated List :" +All_departments_list);
    }

    public static void displayAllDepartments(){
        System.out.print("All departments list :"+All_departments_list);
    }
}
