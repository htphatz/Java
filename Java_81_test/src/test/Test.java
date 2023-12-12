/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import javax.swing.UIManager;
import model.CounterModel;
import view.CounterView;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
//        CounterModel counterModel = new CounterModel();
//        counterModel.increment();
//        counterModel.increment();
//        counterModel.increment();
//        System.out.println(counterModel.getValue());
//        counterModel.decrement();
//        System.out.println(counterModel.getValue());
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new CounterView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
