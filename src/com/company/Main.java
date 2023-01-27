package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        start();
    }

    static int getInput(){
        System.out.println("Zadejte cislo");
        return scanner.nextInt();
    }

    static int loopCount(){
        System.out.println("Zadej kolik cisel chcete zadat");
        return scanner.nextInt();
    }

    static void start(){
        int a = loopCount();
        for (int i = 0; i < a; i++) {
            numbers.add(getInput());
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);
    }
}
