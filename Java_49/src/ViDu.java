
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
        System.out.print("Nhap vao chuoi: ");
        String s = scanner.nextLine();
        System.out.println("-----------------");
        
        // Hàm length() -> trả về độ dài chuỗi (số)
        System.out.println("s.length() = " + s.length());
        
        // Hàm charAt(viTri) -> trả về kí tự ở vị trí viTri (kí tự)
        for(int i = 0; i < s.length(); i++){
            System.out.println("charAt[" + i + "]: " + s.charAt(i));
        }
        
        // Hàm getChars(vị trí bắt đầu, vị trí kết thúc, mảng lưu trữ, vị trí bắt đầu lưu trữ
        char[] arrChars = new char[100];
        s.getChars(0, 4, arrChars, 0);
        System.out.println(arrChars);
        
        // Hàm getBytes() -> trả về mảng chứa các giá trị quy đổi thành số của từng kí tự
        byte[] arrBytes = s.getBytes();
        for(byte b : arrBytes){
            System.out.println(b);
        }
    }
}
