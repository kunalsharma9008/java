// Create an interface named Animal with the following methods: void makeSound(), void eat()
// Create two classes, Dog and Cat, that implement the Animal interface. 
// Implement the makeSound() and eat() method for each class to represent behaviours of dogs and cats.

// Aim:
// To implement interfaces in Java and demonstrate interface-based polymorphism with classes that represent animals.

// Objective:
// - Create an interface named Animal with two methods: makeSound() and eat()
// - Create Dog and Cat classes that implement Animal interface
// - Implement specific versions of makeSound() and eat() for each class

interface Animal {
    void makeSound();
    void eat();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
    public void eat() {
        System.out.println("Dog eats: Bones");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
    public void eat() {
        System.out.println("Cat eats: Fish");
    }
}

public class Practical19 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}
