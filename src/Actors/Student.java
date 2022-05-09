package Actors;

import Models.Class;
import Models.Department;
import Models.Faculty;

public class Student extends Person{
    private int inscription_number;
    private Faculty faculty_name;
    private Department department_name;
    private Class class_name;

    // the constructor

    public Student(String name, String surname, int age, char sex ,int inscription_number, Faculty faculty_name, Department department_name, Class class_name){
        super(name, surname, age, sex);
        this.inscription_number = inscription_number;
        this.faculty_name = faculty_name;
        this.department_name = department_name;
        this.class_name = class_name;
    }

    //the empty constructor

    public Student(){}

    // Getter and Setter


    public int getInscription_number() {
        return inscription_number;
    }

    public void setInscription_number(int inscription_number) {
        this.inscription_number = inscription_number;
    }

    public Faculty getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(Faculty faculty_name) {
        this.faculty_name = faculty_name;
    }

    public Department getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(Department department_name) {
        this.department_name = department_name;
    }

    public Class getClass_name() {
        return class_name;
    }

    public void setClass_name(Class class_name) {
        this.class_name = class_name;
    }
}
