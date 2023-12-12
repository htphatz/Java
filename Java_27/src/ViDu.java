
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ViDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            System.out.print("Nhap vao so nguyen n: ");
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Nhap vao khong dung du lieu");
        }
        System.out.println("Gia tri nhap vao la " + n);
        System.out.println("Kert thuc chuong trinh!");
    }
}
