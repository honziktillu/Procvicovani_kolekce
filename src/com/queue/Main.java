package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Queue<Integer> queue = new LinkedList<>();

    public static int counter = 0;

    public static void main(String[] args) {
        menu();
    }

    public static void addToQueue() {
        counter++;
        queue.add(counter);
        System.out.println("Cislo vasi objednavky je: " + counter);
        menu();
    }

    public static void removeFromQueue() {
        System.out.println("Zadejte cislo vasi objednavky: ");
        int order = scanner.nextInt();
        try {
            if (queue.peek() == order){
                System.out.println("Vydavame objednavku " + queue.poll());
                System.out.println(queue);
            } else {
                System.out.println("Objednavka neni na rade");
            }
        } catch (Exception e){
            System.out.println("Nejsou objednavky");
        }
        menu();
    }

    public static void menu() {
        System.out.println("Zadane objednavky: " + queue);
        System.out.println("1) Zadat objednavku \n2) Vyzvednout objednavku \n3) Vypnout");
        int usrIn = scanner.nextInt();
        switch (usrIn) {
            case 1 -> addToQueue();
            case 2 -> removeFromQueue();
            case 3 -> System.exit(-1);
            default -> menu();
        }
    }
}
