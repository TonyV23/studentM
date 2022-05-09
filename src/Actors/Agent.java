package Actors;

public class Agent extends Person{
    private String username_agent;
    private String password_agent;
    private int id_agent;

    // the constructor

    public Agent(String username_agent, String password_agent, int id_agent){
        super();
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
}
