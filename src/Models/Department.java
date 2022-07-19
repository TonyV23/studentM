package Models;

import InputOutput.Io;

import java.util.ArrayList;

import static Models.Faculty.All_faculties_list;
import static Models.Faculty.displayAllFaculties;

public class Department {
    private String department_name;
    private Faculty faculty_department_name;

    // le constructeur de la classe département

    public Department(String department_name, Faculty faculty_department_name){
        this.department_name = department_name;
        this.faculty_department_name = faculty_department_name;
        All_departments_list.add(this);
    }

    // la liste qui va contenir la liste de tous les départements
    public static ArrayList<Department> All_departments_list = new ArrayList<>();

    // le constructeur vide de la classe département

    public Department(){}

    // les Getters et les Setters


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

    public static void createNewDepartment() {
        if (!All_faculties_list.isEmpty()){
            displayAllFaculties();
            new Department(Io.setString("Nom du département :"),All_faculties_list.get(Io.setINT("Numero de la faculté :")-1));
        }else
            System.err.print("\n******* Erreur aucune faculté n'a été enregistré *******\n");

    }

    public static void updateDepartment(){
        if (!All_departments_list.isEmpty()){
            System.err.print("\nLISTE DE TOUTES LES FACULTES\n");
            displayAllFaculties();
            System.err.print("\nLISTE DE TOUS LES DEPARTEMENTS\n");
            displayAllDepartments();
            All_departments_list.set(Io.setINT("Numero du département à modifier :")-1,
                    new Department(Io.setString("Nom du département :"),
                            All_faculties_list.get(Io.setINT("numero de la faculté :")-1)));
            System.err.print("\n ******* LISTE DE TOUS LES DEPARTEMENTS MISE A JOUR *******\n");
            All_departments_list.remove(All_departments_list.size()-1);
            displayAllDepartments();
        }else
            System.err.print("\n******* Erreur aucun département n'a été enregistré *******\n");

    }

    public static void removeDepartment(){
        if (!All_departments_list.isEmpty()){
            displayAllDepartments();
            All_departments_list.remove(Io.setINT("Numero du département à supprimer :")-1);
            System.err.print("\n ******* LISTE DE TOUS LES DEPARTEMENTS MISE A JOUR *******\n");
            displayAllDepartments();
        }else
            System.err.print("\n******* Erreur aucun département n'a été enregistré *******\n");
    }

    public static void displayAllDepartments(){
        if ( !All_departments_list.isEmpty()){
            for (int i=0; i< All_departments_list.size(); ++i){
                System.out.print(
                        i+1+">>>>>Nom du Department :"+All_departments_list.get(i).getDepartment_name()+"\t"+
                                "de la Faculté :"+All_faculties_list.get(i).getFaculty_name()+"\n"
                );
            }
        }else
            System.err.print("\n******* Erreur aucun département n'a été enregistré *******\n");
    }
}
