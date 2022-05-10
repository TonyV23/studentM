package Actors;

import Models.Class;
import Models.Department;
import Models.Faculty;

public class Student extends Person{
    private int inscription_number;
    private Faculty faculty_name;
    private Agent agent_name;

    // the constructor

    public Student(String name, String surname, int age, char sex ,int inscription_number, Faculty faculty_name,Agent agent_name){
        super(name, surname, age, sex);
        this.inscription_number = inscription_number;
        this.faculty_name = faculty_name;
        this.agent_name = agent_name;
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

    public Agent getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(Agent agent_name) {
        this.agent_name = agent_name;
    }
}
