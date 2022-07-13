package Main;

import Actors.Student;
import InputOutput.Io;
import Models.Class;
import Models.Department;
import Models.Faculty;

public class Run {
    private static void getIN(){
            switch (Io.setINT("\n1.Operation sur les Etudiants\t2.Operation sur Les Facultés\t" +
                    "3.Operation sur les Departements\t4.Operation les Classes\t5.Quitter et Fermer l'application" +
                    "\n*** Choisir une action *** :")){
                case 1:
                    switch (Io.setINT("\n1.Enregistrer un nouveau Etudiant\n2.Modifier un Etudiant\n" +
                            "3.Supprimer un Etudiant\n4.Afficher la Liste de tous les Etudiants\t5.Quitter et Fermer l'application\t6.Retour au Menu" +
                            "\n*** Choisir une action *** :")) {
                        case 1 -> Student.createNewStudent();
                        case 2 -> Student.updateStudent();
                        case 3 -> Student.removeStudent();
                        case 4 -> Student.displayAllStudents();
                        case 5 -> System.exit(0);
                        case 6 -> getIN();
                        default -> System.err.print("\n **** Saisie Incorrecte veuillez reessayer ****\n");
                    }
                    break;
                case 2:
                    switch (Io.setINT("\n1.Créer une nouvelle Faculté.\n2.Modifier une Faculté\n" +
                            "3.Supprimer une Faculté\n4.Afficher la Liste de toutes les facultés\t5.Quitter et Fermer l'application\t6.Retour au Menu" +
                            "\n*** Choisir une action *** :")) {
                        case 1 -> Faculty.createNewFaculty();
                        case 2 -> Faculty.updateFaculty();
                        case 3 -> Faculty.removeFaculty();
                        case 4 -> Faculty.displayAllFaculties();
                        case 5 -> System.exit(0);
                        case 6 -> getIN();
                        default -> System.err.print("\n **** Saisie Incorrecte veuillez reessayer ****\n");
                    }
                    break;
                case 3:
                    switch (Io.setINT("\n1Créer un nouveau Departement.\n2.Modifier un Departement\n" +
                            "3.Supprimer un Departement\n4.Afficher la Liste de tous les Departements\t5.Quitter et Fermer l'application\t6.Retour au Menu" +
                            "\n*** Choisir une action *** :")) {
                        case 1 -> Department.createNewDepartment();
                        case 2 -> Department.updateDepartment();
                        case 3 -> Department.removeDepartment();
                        case 4 -> Department.displayAllDepartments();
                        case 5 -> System.exit(0);
                        case 6 -> getIN();
                        default -> System.err.print("\n **** Saisie Incorrecte veuillez reessayer ****\n");
                    }
                    break;
                case 4:
                    switch (Io.setINT("\n1Créer une nouvelle Classe.\n2.Modifier une Classe\n" +
                            "3.Supprimer une Classe\n4.Afficher la Liste de toutes les Classes\t5.Quitter et Fermer l'application\t6.Retour au Menu" +
                            "\n*** Choisir une action *** :")) {
                        case 1 -> Class.createNewClass();
                        case 2 -> Class.updateClass();
                        case 3 -> Class.removeClass();
                        case 4 -> Class.displayAllClass();
                        case 5 -> System.exit(0);
                        case 6 -> getIN();
                        default -> System.err.print("\n **** Saisie Incorrecte veuillez reessayer ****\n");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.print("\n **** Saisie Incorrecte veuillez reessayer ****\n");

            }
    }

    public static void main(String[] args) {
        System.out.print("\t\tCONNEXION\t\t");
        String user_name = Io.setString("\nVOTRE NOM UTILISATEUR :");
        String user_password = Io.setString("\nVOTRE MOT DE PASSE :");
        while (true){
            if (user_name.contentEquals("ULT") && user_password.contentEquals("123")){
                System.out.print("\n **** BIENVENU A NOTRE APPLICATION ****\n");
                getIN();
            }else
                System.err.print("\n **** Oops NOM UTILISATEUR OU MOT DE PASSE INCORRECT VEUILLEZ REESSAYER ****\n");
        }
    }
}
