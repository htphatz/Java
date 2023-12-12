/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
        Box box1 = new Box(12);
        System.out.println(box1.getValue());
        
        // Box box2 = new Box(12.6); -> Loi!
        // Box box3 = new Box("ABC); -> Loi!
        Box2<String> box2 = new Box2<String>("ABC");
        System.out.println(box2.getValue());
        
        Box2<Double> box3 = new Box2<Double>(15.6);
        System.out.println(box3.getValue());
    }
}
