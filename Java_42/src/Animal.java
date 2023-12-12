/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void eat(){
        System.out.println("Toi dang an");
    }
    
    public void makeSound(){
        System.out.println("...........");
    }
    
    public void sleep(){
        System.out.println("Toi dang ngu");
    }
}
