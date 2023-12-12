
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
        System.out.print("Nhap vao n(tu 2 den 8): ");
        int n = scanner.nextInt();
        
        switch (n) {
            case 2:
                System.out.println("Hom nay la thu 2");
                break;
            case 3:
                System.out.println("Hom nay la thu 3");
                break;
            case 4:
                System.out.println("Hom nay la thu 4");
                break;
            case 5:
                System.out.println("Hom nay la thu 5");
                break;
            case 6:
                System.out.println("Hom nay la thu 6");
                break;
            case 7:
                System.out.println("Hom nay la thu 7");
                break;
            case 8:
                System.out.println("Hom nay la chu nhat");
                break;
            default:
                System.out.println("Nhap du lieu bi sai!");
        }
    }
}
