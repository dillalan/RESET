package com.reset;

public class Variables {
    public static void main(String[] args) {
        int phone=997252458;
        String name = "Alan"; // String isn't a primitive type, but a class. String must carry DOUBLE QUOTES!!
        float height= (float) 1.85;
        char bloodType= 'A'; // char type variables only hold one character. char type must carry SINGLE QUOTES!!

        System.out.println("User: " + name); // The add sign (+) state a concatenation
        System.out.println("Phone Number: " + phone);
        System.out.println("Height: " + height);
        System.out.println("Blood Type: " + bloodType);
    }
}
