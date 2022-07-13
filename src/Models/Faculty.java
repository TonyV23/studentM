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

    public static ArrayList<Faculty> All_faculties_list = new ArrayList<>();

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
         new Faculty(Io.setString("Nom de la Faculty :"),Io.setString("A propos de la Faculté:"));
    }

    public static void removeFaculty(){
        if (!All_faculties_list.isEmpty()){
            displayAllFaculties();
            All_faculties_list.remove(Io.setINT("Numero de la faculté à supprimer :")-1);
            System.err.print("\n ******* LISTE DE TOUTES LES FACULTES MISE A JOUR *******\n");
            displayAllFaculties();
        }else
            System.err.print("\n******* Erreur aucune faculté n'a été enregisté *******\n");
    }


    public static void updateFaculty(){
        if (!All_faculties_list.isEmpty()){
            displayAllFaculties();
            All_faculties_list.set(Io.setINT("Numero de la faculté à modifier :")-1,new Faculty(Io.setString("Nouveau nom de la faculté :"),Io.setString("A propos de la faculté :")));
            System.err.print("\n ******* LISTE DE TOUTES LES FACULTES MISE A JOUR *******\n");
            All_faculties_list.remove(All_faculties_list.size()-1);
            displayAllFaculties();
        }else
            System.err.print("\n******* Erreur aucune faculté n'a été enregisté *******\n");
    }

    public static void displayAllFaculties(){
        if ( !All_faculties_list.isEmpty()){
            for (int i=0; i< All_faculties_list.size(); ++i){
                System.out.print(
                        i+1+">>>>>NOM DE LA FACULTE :"+All_faculties_list.get(i).getFaculty_name()+"\t"+
                                "A propos de la Faculté :"+All_faculties_list.get(i).getFaculty_about()+"\n"
                );
            }
        }else
            System.err.print("\n******* Erreur aucune faculté n'a été enregisté *******\n");
    }
}
