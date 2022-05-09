package Models;

public class Department {
    private String department_name;
    Faculty faculty_department_name;

    // the Department constructor

    public Department(String department_name, Faculty faculty_department_name){
        this.department_name = department_name;
        this.faculty_department_name = faculty_department_name;
    }

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
}
