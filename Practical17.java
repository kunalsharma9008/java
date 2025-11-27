// Define a class Animal with attributes name and sound. 
// Create objects of different animal classes that inherit from Animal and demonstrate polymorphism
// by calling their specific makeSound() method.

// Aim:
// To define a class Animal with attributes name and sound, create objects of different animal classes that inherit from Animal, 
// and demonstrate polymorphism by calling their specific makeSound() method

// Objective:
// - To understand inheritance, method overriding
// - To implement polymorphism using a superclass and its subclasses

class Animal {
    String name;
    String sound;

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void makeSound() {
        System.out.println(name + " makes sound " + sound);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name, "Woof woof");
    }

    void makeSound() {
        System.out.println(name + " says: Woof woof");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name, "Meow");
    }

    void makeSound() {
        System.out.println(name + " says: meow meow");
    }
}

public class Practical17 {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        myDog.makeSound();
        myCat.makeSound();
    }
}
