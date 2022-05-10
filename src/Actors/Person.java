package Actors;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String sex;

    // the person's constructor

    public Person(String name, String surname, int age, String sex){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    // the empty constructor

    public Person(){}

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
