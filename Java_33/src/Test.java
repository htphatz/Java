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
        MyDate md1 = new MyDate(1, 12, 2003);
        MyDate md2 = new MyDate(5, 11, 2016);
        MyDate md3 = new MyDate(5, 11, 2016);
        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);
        System.out.println("md1 giong md2: " + md1.equals(md2));
        System.out.println("md2 giong md3: " + md2.equals(md3));
    }
}
