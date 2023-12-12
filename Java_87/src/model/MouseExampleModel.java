/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class MouseExampleModel {
    private int x;
    private int y;
    private int numberOfClicks;
    private String checkIn;

    public MouseExampleModel() {
        this.x = 0;
        this.y = y;
        this.numberOfClicks = 0;
        this.checkIn = "no";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNumberOfClicks() {
        return numberOfClicks;
    }

    public void setNumberOfClicks(int numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    
    public void addClick(){
        this.numberOfClicks++;
    }
    
    public void enter(){
        this.checkIn = "yes";
    }
    
    public void exit(){
        this.checkIn = "no";
    }
}
