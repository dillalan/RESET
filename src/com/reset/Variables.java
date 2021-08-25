package com.reset;

public class Variables {
    public static void main(String[] args) {
        int phone=997252458;
        String name = "Alan"; // String isn't a primitive type, but a class. String must carry DOUBLE QUOTES!!
        float height = 1.85f; // float type requires an 'f' when assigning the value
        double heightInCentimeters = 185.3; // Double is a float type, but do not need anything but the value itself
        char bloodType = 'A'; // char type variables can hold the equivalent unicode, ascii character table. char type
        // must carry SINGLE QUOTES!!

        System.out.println("User: " + name); // The add sign (+) state a concatenation
        System.out.println("Phone Number: " + phone);
        System.out.println("Height: " + height);
        System.out.println("Blood Type: " + bloodType);
    }
}
