/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class MouseClickModel {
    private int x;
    private int y;
    private int numberOfClick;
    private String checkIn;

    public MouseClickModel() {
        this.x = 0;
        this.y = 0;
        this.numberOfClick = 0;
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

    public int getNumberOfClick() {
        return numberOfClick;
    }

    public void setNumberOfClick(int numberOfClick) {
        this.numberOfClick = numberOfClick;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    
    public void addClick(){
        this.numberOfClick++;
    }
    
    public void  inSite(){
        this.checkIn = "yes";
    }
    
    public void outSite(){
        this.checkIn = "no";
    }
}
