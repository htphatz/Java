
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
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap vao ho ten: ");
        String hoTen = input.nextLine();
        
        System.out.print("Nhap vao so bat ki: ");
        int n = input.nextInt();
        
        System.out.println("So nhap tu ban phim la: " + n);
        System.out.println("Ho ten nhap tu ban phim la: " + hoTen);
    }
}
