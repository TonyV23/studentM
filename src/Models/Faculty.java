package Models;

public class Faculty {
    private String faculty_name;
    private String faculty_about;

    // the Faculty's constructor

    public Faculty(String faculty_name, String faculty_about){
        this.faculty_name = faculty_name;
        this.faculty_about = faculty_about;
    }

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
}
