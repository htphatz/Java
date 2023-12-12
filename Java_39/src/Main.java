/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Kiem tra con nguoi");
        ConNguoi cn = new ConNguoi("Huynh Tan Phat", 2003);
        cn.an();
        cn.ngu();
        cn.uong();
        System.out.println("Kiem tra hoc sinh ke thua con nugoi");
        HocSinh hs = new HocSinh("CT06N", "KMP", "Nguyen Van A", 2001);
        hs.an();
        hs.ngu();
        hs.uong();
        hs.lamBaiTap();
    }
}
