/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Dog extends Animal{

    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }

    @Override
    public void eat() {
        System.out.println("Toi an xuong");
    }
    
}
