package com.house;

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

    @Override
    public String toString() {
        return "\t\t" + getId() + "\t\t   " + getNumber() + "\t\t\t" + getFloor() + "\t\t\t" + getRooms() + "\t\t\t" + getSquare() + "\t" + getStreet();
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
