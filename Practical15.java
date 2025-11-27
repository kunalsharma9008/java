// Write a program to implement ArrayList and perform add, remove, and search operations

// Aim:
// To write a JAVA program to implement an ArrayList and perform add, remove, and search operations

// Objective:
// - To introduce the concept and usage of ArrayList
// - To learn how to add, remove, and search elements in an ArrayList

import java.util.*;

class Practical15 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Saket");
        names.add("Prathamesh");
        names.add("Kunal");
        names.add("Ketan");
        names.add("Tanmay");

        // Remove an element
        names.remove("Tanmay");
        System.out.println(names);

        // Search for an element
        if (names.contains("Splendor")) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
