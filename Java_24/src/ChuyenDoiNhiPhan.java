
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ChuyenDoiNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen n: ");
        int n = scanner.nextInt();
        int x = n;
        String ketQua = "";
        
        while(n > 0) {
            ketQua = (n % 2) + ketQua;
            n /= 2;
        }
        System.out.println(x + " trong he nhi phan la: " + ketQua);
    }
}
