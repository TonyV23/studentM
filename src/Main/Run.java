package Main;

import Actors.Student;
import InputOutput.Io;
import Models.Class;
import Models.Department;
import Models.Faculty;

public class Run {
    private static void getIN(){
            switch (Io.setINT("\n1.Operation on Student\t2.Operation on Faculties\t" +
                    "3.Operation on Department\t4.Operation on Class\t5.Quit application" +
                    "\n*** Choose An action *** :")){
                case 1:
                    switch (Io.setINT("\n1Create A New Student.\n2.Update Student\n" +
                            "3.Remove A student\n4.Display All student\t5.Quit application\t6.Back To Menu" +
                            "\n*** Choose An action *** :")) {
                        case 1 -> Student.createNewStudent();
                        case 2 -> Student.updateStudent();
                        case 3 -> Student.removeStudent();
                        case 4 -> Student.displayAllStudents();
                        case 5 -> System.exit(0);
                        case 6 -> getIN();
                        default -> System.err.print("\n **** WRONG INPUT please try again****\n");
                    }
                    break;
                case 2:
                    switch (Io.setINT("\n1Create A New Faculty.\n2.Update Faculty\n" +
                            "3.Remove A Faculty\n4.Display All faculties\t5.Quit application\t6.Back To Menu" +
                            "\n*** Choose An action *** :")) {
                        case 1 -> Faculty.createNewFaculty();
                        case 2 -> Faculty.updateFaculty();
                        case 3 -> Faculty.removeFaculty();
                        case 4 -> Faculty.displayAllFaculties();
                        case 5 -> System.exit(0);
                        case 6 -> getIN();
                        default -> System.err.print("\n **** WRONG INPUT please try again****\n");
                    }
                    break;
                case 3:
                    switch (Io.setINT("\n1Create A New Department.\n2.Update Department\n" +
                            "3.Remove A Department\n4.Display All Departments\t5.Quit application\t6.Back To Menu" +
                            "\n*** Choose An action *** :")) {
                        case 1 -> Department.createNewDepartment();
                        case 2 -> Department.updateDepartment();
                        case 3 -> Department.removeDepartment();
                        case 4 -> Department.displayAllDepartments();
                        case 5 -> System.exit(0);
                        case 6 -> getIN();
                        default -> System.err.print("\n **** WRONG INPUT please try again****\n");
                    }
                    break;
                case 4:
                    switch (Io.setINT("\n1Create A New Class.\n2.Update Class\n" +
                            "3.Remove A Class\n4.Display All Class\t5.Quit application\t6.Back To Menu" +
                            "\n*** Choose An action *** :")) {
                        case 1 -> Class.createNewClass();
                        case 2 -> Class.updateClass();
                        case 3 -> Class.removeClass();
                        case 4 -> Class.displayAllClass();
                        case 5 -> System.exit(0);
                        case 6 -> getIN();
                        default -> System.err.print("\n **** WRONG INPUT please try again****\n");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.print("\n **** WRONG INPUT please try again****\n");

            }
    }

    public static void main(String[] args) {
        while (true){
            System.out.print("\t\tLOGIN\t\t");
            String user_name = Io.setString("\nUsername :");
            String user_password = Io.setString("\nPassword :");
            if (user_name.contentEquals("ULT") && user_password.contentEquals("123")){
                System.out.print("\n **** WELCOME TO OUR APPLICATION ****\n");
                getIN();
            }else
                System.err.print("\n **** Oops credentials not matched please try again****\n");
        }
    }
}
