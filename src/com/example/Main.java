package com.example;

public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        User user1 = new User( "Radek", "Basic", "Man");
        User user2 = new User( "Petr", "Very basic", "Man");
        User user3 = new User( "Tomas", "Not found", "NPC");
        User user4 = new User( "Rosta", "Admin", "Man");
        User user5 = new User( "Stepan", "Owner", "Man");
        userManager.addUser(user1);
        userManager.addUser(user2);
        userManager.addUser(user3);
        userManager.addUser(user4);
        userManager.addUser(user5);
        userManager.printAllUsers();
        userManager.printUserById(2);
        userManager.printUserById(4);
    }

}
