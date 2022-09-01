package com.House;

import java.util.Scanner;

public class House {
    private int id;
    private int number;
    private int floor;
    private int rooms;
    private double square;
    private String street;

    public House(int id, int number, int floor, int rooms, double square, String street) {
        this.id = id;
        this.number = number;
        this.floor = floor;
        this.rooms = rooms;
        this.square = square;
        this.street = street;
    }

    public House() {
        Scanner sc;
        do {
            try {
                sc = new Scanner(System.in);

                System.out.print("\n Id >>> ");
                id = sc.nextInt();

                System.out.print(" Number >>> ");
                number = sc.nextInt();

                System.out.print(" Floor >>> ");
                floor = sc.nextInt();

                System.out.print(" Rooms >>> ");
                rooms = sc.nextInt();

                System.out.print(" Square >>> ");
                square = sc.nextDouble();

                System.out.print(" Street >>> ");
                street = sc.nextLine();

                if (id < 0 || number < 0 || floor < 0 || rooms < 0 || square < 0)
                    System.out.println("\n Invalid input!\n");
                else
                    break;
            } catch (Exception e) {
                System.out.println("incorrect value");
            }

        } while (true);
    }

    public static void printApartments(House[] objects) {
        System.out.println("\n All apartments:");
        printTable();

        for (int i = 0, n = 1; i < objects.length; i++)
            System.out.println("    " + n++ + objects[i].toString());

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
            if (objects[i].rooms >= rooms) {
                System.out.println("   " + n++ + objects[i].toString());
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
            if (objects[i].square > square) {
                System.out.println("   " + n++ + objects[i].toString());
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
            if (objects[i].rooms == rooms && l1 <= objects[i].floor && objects[i].floor <= l2) {
                System.out.println("   " + n++ + objects[i].toString());
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

    @Override
    public String toString() {
        return "\t\t" + id + "\t\t   " + number + "\t\t\t" + floor + "\t\t\t" + rooms + "\t\t\t" + square + "\t" + street;
    }


    public int getId() { return id; }
    public int getNumber() { return number; }
    public int getFloor() { return floor; }
    public int getRooms() { return rooms; }
    public double getSquare() { return square; }
    public String getStreet() { return street; }


    public void setId(int id) { this.id = id; }
    public void setNumber(int number) { this.number = number; }
    public void setFloor(int floor) { this.floor = floor; }
    public void setRooms(int rooms) { this.rooms = rooms; }
    public void setSquare(double square) { this.square = square; }
    public void setStreet(String street) { this.street = street; }
}
