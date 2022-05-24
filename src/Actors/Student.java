package Actors;

import InputOutput.Io;
import Models.Department;
import Utils.GiveMe;

import java.util.ArrayList;

import static Models.Department.*;
import static Models.Faculty.*;

public class Student extends Person{
    private int inscription_number;
    private String faculty_name;
    private String department_name;
    private String class_name;

    // the constructor

    public Student(String name, String surname, int age, String sex ,
                   int inscription_number, String faculty_name, String department_name, String class_name){
        super(name, surname, age, sex);
        this.inscription_number = inscription_number;
        this.faculty_name = faculty_name;
        this.department_name = department_name;
        this.class_name = class_name;
        All_students_list.add(this);
    }

    static ArrayList<Student> All_students_list = new ArrayList<>();

    //the empty constructor

    public Student(){}

    // Getter and Setter


    public int getInscription_number() {
        return inscription_number;
    }

    public void setInscription_number(int inscription_number) {
        this.inscription_number = inscription_number;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    // method for handling Student

    public static void createNewStudent(){
        if (!All_faculties_list.isEmpty() && !All_departments_list.isEmpty()){
            System.err.print("\n LIST OF ALL FACULTIES\n");
            displayAllFaculties();
            System.err.print("\n LIST OF ALL DEPARTMENT\n");
            displayAllDepartments();
            new Student(Io.setString("Student name :"),Io.setString("Student surname :"),
                    Io.setINT("Age of birth :"),Io.setString("Sex :"), GiveMe.random_integer(),
                    Io.setString("Faculty name"),Io.setString("Department name"),Io.setString("Class name"));
        }else
            System.err.print("\n******* Error no faculty and department registered *******\n");
    }

    public static void removeStudent(){
        if (!All_students_list.isEmpty()){
            displayAllStudents();
            All_students_list.remove(Io.setINT("Number of faculty to remove :")-1);
            System.err.print("\n ******* Updated of All students list *******\n");
            displayAllStudents();
        }else
            System.err.print("\n******* Error no Student registered *******\n");
    }

    public static void updateStudent(){
        if (!All_students_list.isEmpty()){
            System.err.print("\nLIST OF ALL STUDENTS\n");
            displayAllStudents();
            All_students_list.set(Io.setINT("Student's number to update :")-1,
                    new Student(Io.setString("New Student name :"),Io.setString("New Student surname :"),
                            Io.setINT("New Age of birth :"),Io.setString("Sex :"), GiveMe.random_integer(),
                            Io.setString("New Faculty name :"),Io.setString("New Department name :"),
                            Io.setString("New Class name :"))
            );
            System.err.print("\n ******* Updated of All students list *******\n");
            All_students_list.remove(All_students_list.size()-1);
            displayAllDepartments();
        }else
            System.err.print("\n******* Error no student registered *******\n");
    }

    public static void displayAllStudents(){
        if (!All_students_list.isEmpty()){
            for (int i = 0; i < All_students_list.size(); i++) {
                System.out.print("\n"+i+1+
                        ">>>Student_name :"+All_students_list.get(i).getName()+
                        "\tStudent_surname :"+All_students_list.get(i).getSurname()+
                        "\tAge_of_birth :"+All_students_list.get(i).getAge()+
                        "\tSex :"+All_students_list.get(i).getSex()+
                        "\tInscription_number :"+All_students_list.get(i).getInscription_number()+
                        "\tFaculty :"+All_students_list.get(i).getFaculty_name()+
                        "\tDepartment :"+All_students_list.get(i).getDepartment_name()+
                        "\tClass :"+All_students_list.get(i).getClass_name()+"\n"
                );
            }
        }else
            System.err.print("\n Error no student registered \n");
    }
}
