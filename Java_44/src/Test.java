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
        ToaDo td1 = new ToaDo(1, 2);
        ToaDo td2 = new ToaDo(3, 4);
        ToaDo td3 = new ToaDo(5, 6);
        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(12, td2);
        Hinh h3 = new HinhChuNhat(2, 4, td3);
        System.out.println("Dien tich hinh 1: " + h1.tinhDienTich());
        System.out.println("Dien tich hinh 2: " + h2.tinhDienTich());
        System.out.println("Dien tich hinh 3: " + h3.tinhDienTich());
    }
}
