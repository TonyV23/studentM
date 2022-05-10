package Models;

import java.util.ArrayList;

public class Class {
    private String class_name;
    private Faculty faculty_name;


    // the constructor

    public Class(String class_name, Faculty faculty_name){
        this.class_name = class_name;
        this.faculty_name = faculty_name;
        All_class_list.add(this);
    }

    ArrayList<Class> All_class_list = new ArrayList<>();

    // the empty constructor

    public Class(){}

    // Getters and Setters


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

}
