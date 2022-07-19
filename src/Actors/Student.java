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

    // le constructeur de la classe Student

    public Student(String name, String surname, int age, String sex ,
                   int inscription_number, String faculty_name, String department_name, String class_name){
        super(name, surname, age, sex);
        this.inscription_number = inscription_number;
        this.faculty_name = faculty_name;
        this.department_name = department_name;
        this.class_name = class_name;
        All_students_list.add(this);
    }

    // la liste qui va contenir tous les etudiants
    static ArrayList<Student> All_students_list = new ArrayList<>();

    // le constructeur vide de la classe Student

    public Student(){}

    // les Getters et les Setters


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
                    Io.setString("Faculty name :"),Io.setString("Department name :"),Io.setString("Class name :"));
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
            System.err.print("\nLISTE DE TOUS LES ETUDIANTS\n");
            displayAllStudents();
            All_students_list.set(Io.setINT("Numero de l'étudiant à modifier :")-1,
                    new Student(Io.setString("Nouveau nom de l'étudiant :"),Io.setString("Nouveau prenom de l'étudiant :"),
                            Io.setINT("Année de naissance :"),Io.setString("Sexe :"), GiveMe.random_integer(),
                            Io.setString("Nom de la Faculté :"),Io.setString("Nom du département :"),
                            Io.setString("Nom de la classe :"))
            );
            System.err.print("\n ******* LISTE DE TOUS LES ETUDIANTS MISE A JOUR *******\n");
            All_students_list.remove(All_students_list.size()-1);
            displayAllDepartments();
        }else
            System.err.print("\n******* ERREUR AUCUN ETUDIANT N'A ETE ENREGISTRE *******\n");
    }

    public static void displayAllStudents(){
        if (!All_students_list.isEmpty()){
            for (int i = 0; i < All_students_list.size(); i++) {
                System.out.print("\n"+i+1+
                        ">>>  Nom de l'étudiant :"+All_students_list.get(i).getName()+
                        "\tPrenom de l'étudiant :"+All_students_list.get(i).getSurname()+
                        "\tAnnée de naissance :"+All_students_list.get(i).getAge()+
                        "\tSexe :"+All_students_list.get(i).getSex()+
                        "\tNumero de l'inscription :"+All_students_list.get(i).getInscription_number()+
                        "\tFaculté :"+All_students_list.get(i).getFaculty_name()+
                        "\tDépartement :"+All_students_list.get(i).getDepartment_name()+
                        "\tClasse :"+All_students_list.get(i).getClass_name()+"\n"+"\n"
                );
            }
        }else
            System.err.print("\n******* ERREUR AUCUN ETUDIANT N'A ETE ENREGISTRE *******\n");
    }
}
