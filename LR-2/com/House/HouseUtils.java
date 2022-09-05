package com.house;

import java.util.Scanner;

public class HouseUtils {
    public static void printApartments(House[] objects) {
        System.out.println("\n All apartments:");
        printTable();

        for (int i = 0, n = 1; i < objects.length; i++)
            System.out.println("    " + n++ + objects[i]);

        System.out.println("_________________________________________________________________________________");
    }

    public static void printApartmentsByRooms(House[] objects) {
        int rooms;
        boolean flag = false;
        Scanner sc;
        do {
            System.out.print("\n [printApartmentsByRooms] How many rooms should there be in the apartment >>> ");
            try {
                sc = new Scanner(System.in);
                rooms = sc.nextInt();
                if (rooms <= 0)
                    System.out.println("\n Wrong value!");
                else
                    break;
            } catch (Exception e) {
                System.out.println(" value must be a number!");
            }
        } while (true);

        printTable();

        for (int i = 0, n = 1; i < objects.length; i++) {
            if (objects[i].getRooms() >= rooms) {
                System.out.println("   " + n++ + objects[i]);
                flag = true;
            }
        }

        if (!flag)
            System.out.println("\n There are no apartments with this number of rooms!\n");

        System.out.println("_________________________________________________________________________________");

    }

    public static void printApartmentsBySquare(House[] objects) {
        double square;
        boolean flag = false;
        Scanner sc;
        do {
            System.out.print("\n[printApartmentsBySquare] Enter the square of the apartment >>> ");
            try {
                sc = new Scanner(System.in);
                square = sc.nextDouble();
                if (square <= 0)
                    System.out.println("\n Wrong value!");
                else
                    break;
            } catch (Exception e) {
                System.out.println(" value must be a number!");
            }
        } while (true);

        printTable();

        for (int i = 0, n = 1; i < objects.length; i++) {
            if (objects[i].getSquare() > square) {
                System.out.println("   " + n++ + objects[i]);
                flag = true;
            }
        }

        if (!flag)
            System.out.println("\n There are no apartments with this square!\n");

        System.out.println("_________________________________________________________________________________");

    }

    public static void printApartmentsByRoomsAndFloor(House[] objects) {
        int l1, l2;
        int rooms;
        boolean flag = false;
        Scanner sc;

        do {
            try {
                System.out.print("\n [printApartmentsByRoomsAndFloor] Enter the number of rooms in the apartment >>> ");
                sc = new Scanner(System.in);
                rooms = sc.nextInt();

                System.out.print("\n [printApartmentsByRoomsAndFloor] Enter the boundaries of the floors to be displayed\n l1 >>> ");
                l1 = sc.nextInt();

                System.out.print(" l2 >>> ");
                l2 = sc.nextInt();

                if (rooms <= 0 || l1 <= 0 || l2 <= 0 || l1 == l2)
                    System.out.println("\n Wrong value!");
                else
                    break;
            } catch (Exception e) {
                System.out.println(" value must be a number!");
            }
        } while (true);

        printTable();

        for (int i = 0, n = 1; i < objects.length; i++) {
            if (objects[i].getRooms() == rooms && l1 <= objects[i].getFloor() && objects[i].getFloor() <= l2) {
                System.out.println("   " + n++ + objects[i]);
                flag = true;
            }
        }

        if (!flag)
            System.out.println("\n There are no apartments with this number of rooms and floors!\n");

        System.out.println("_________________________________________________________________________________");
    }

    private static void printTable() {
        System.out.println("_________________________________________________________________________________");
        System.out.println("|   №   |   id   |   number   |   floor   |   rooms   |   square   |   street   |");
        System.out.println("_________________________________________________________________________________");
    }
}
