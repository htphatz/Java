/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void printDay(){
        System.out.println("Day: " + this.day);
    }
    
    public void printMonth(){
        System.out.println("Month: " + this.month);
    }
    
    public void printYear(){
        System.out.println("Year: " + this.year);
    }
    
    public void printDate(){
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
    }
}
