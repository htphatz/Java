/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Test {
     public static void main(String[] args) {
        System.out.println("Test animal");
        Animal animal = new Animal("Ga");
        animal.eat();
        animal.makeSound();
        System.out.println("Test dog");
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();
        System.out.println("Test cat");
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
    }
}
