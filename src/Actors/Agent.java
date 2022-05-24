package Actors;

import InputOutput.Io;
import Utils.GiveMe;

import java.util.ArrayList;

public class Agent extends Person{
    private String username_agent;
    private String password_agent;
    private int id_agent;

    // the constructor

    public Agent(String name, String surname, int age, String sex , String username_agent, String password_agent, int id_agent){
        super(name, surname, age, sex);
        this.username_agent = username_agent;
        this.password_agent = password_agent;
        this.id_agent = id_agent;
    }

    // the empty constructor

    public Agent(){}

    // Getters and Setters


    public String getUsername_agent() {
        return username_agent;
    }

    public void setUsername_agent(String username_agent) {
        this.username_agent = username_agent;
    }

    public String getPassword_agent() {
        return password_agent;
    }

    public void setPassword_agent(String password_agent) {
        this.password_agent = password_agent;
    }

    public int getId_agent() {
        return id_agent;
    }

    public void setId_agent(int id_agent) {
        this.id_agent = id_agent;
    }

    // Student new_student = new Student(Io.setString("Student name :"),Io.setString("Student surname :"),Io.setINT("Year of Birth :"),Io.setString("Gender"),GiveMe.random_integer(),,);

}
