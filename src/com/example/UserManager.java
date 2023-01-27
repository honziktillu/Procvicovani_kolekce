package com.example;

import java.util.ArrayList;

public class UserManager {

    public static ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added");
    }

    public void printUserById(int id) {
        for (User user : users) {
            if (id == user.getId()) {
                System.out.println(user);
                break;
            }
        }
    }

    public void removeUser(User user) {
        users.remove(user);
        System.out.println("User removed");
    }

    public void printAllUsers() {
        users.forEach(System.out::println);
    }

}
