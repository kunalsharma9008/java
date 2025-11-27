// Write a JAVA program to convert a string to uppercase or lowercase

// Aim:
// To write a JAVA program to convert a given string to uppercase or lowercase

// Objective:
// - To understand string manipulation and built-in string method in JAVA
// - To take user input as a string and display the result to be in uppercase or lowercase

class Practical14 {
    public static void main(String[] args) {
        String name = "Kunal";
        String surname = "Sharma";

        // Convert to uppercase
        String name1 = name.toUpperCase();
        String surname1 = surname.toUpperCase();

        System.out.println(name1 + " " + surname1);

        // To convert to lowercase:
        // String nameLower = name.toLowerCase();
        // String surnameLower = surname.toLowerCase();
        // System.out.println(nameLower + " " + surnameLower);
    }
}

