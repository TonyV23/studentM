package Models;

import InputOutput.Io;

import java.util.ArrayList;

import static Models.Faculty.All_faculties_list;
import static Models.Faculty.displayAllFaculties;

public class Class {
    private String class_name;
    private Faculty faculty_name;


    // le constructeur de la classe Class

    public Class(String class_name, Faculty faculty_name){
        this.class_name = class_name;
        this.faculty_name = faculty_name;
        All_class_list.add(this);
    }

    // la liste qui va contenir toutes les classes
    static ArrayList<Class> All_class_list = new ArrayList<>();

    // le constructeur vide

    public Class(){}

    // les Getters et les Setters


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
            new Class(Io.setString("Nom de la classe :"),All_faculties_list.get(Io.setINT("Numero de la faculté :")));
        }else
            System.err.print("\n******* Erreur aucune faculté n'a été enregistré *******\n");
    }

    public static void updateClass(){
        if (!All_class_list.isEmpty()){
            System.err.print("\nLISTE DE TOUTES LES FACULTES\n");
            displayAllFaculties();
            System.err.print("\nLISTE DE TOUTES LES CLASSES\n");
            displayAllClass();
            All_class_list.set(Io.setINT("Numero de la classe à modifier :")-1,
                    new Class(Io.setString("nom de la classe :"),All_faculties_list.get(Io.setINT("Numero de la faculté :")-1)));
            All_class_list.remove(All_class_list.size()-1);
            System.out.print("\n******* LISTE DE TOUTES LES CLASSES MISE A JOUR *******\n");
            displayAllClass();
        }else
            System.err.print("\n ******* Erreur aucun département n'a été enregistré ******* \n");
    }

    public static void removeClass(){
        if (!All_class_list.isEmpty()){
            displayAllClass();
            All_class_list.remove(Io.setINT("Numero de la classe à supprimer :")-1);
            System.out.print("\n******* LISTE DE TOUTES LES CLASSES MISE A JOUR *******\n");
            displayAllClass();
        }else
            System.err.print("\n ******* Erreur aucune classe n'a été enregistré ******* \n");

    }

    public static void displayAllClass(){
        if ( !All_class_list.isEmpty()){
            for (int i=0; i< All_class_list.size(); ++i){
                System.out.print(
                        i+1+">>>>>Nom de la classe :"+All_class_list.get(i).getClass_name()+"\t"+
                                "Nom de la faculté :"+All_faculties_list.get(i).getFaculty_name()+"\n"
                );
            }
        }else
            System.err.print("\n ******* Erreur aucune classe n'a été enregistré ******* \n");
    }
}
