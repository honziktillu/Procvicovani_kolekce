package com.example;

public class User {

    //1.
    public static int idCounter = 0;
    private int id;
    private String name;
    private String role;
    private String gender;

    //2.
    public User(String name, String role, String gender) {
        //3.
        idCounter++;
        this.id = idCounter;


        this.name = name;
        this.role = role;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
