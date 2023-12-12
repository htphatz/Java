
import java.util.Arrays;

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
        String s = "Xin chào các bạn, tui là Phát!";
        
        // Hàm split(...) -> cắt chuỗi thành mảng dựa theo (...)
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));
        
        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));
       
        // Nếu muốn cắt áp dụng cho nhiều chuỗi ngăn sách, dùng (\\(dấu muốn cắt 1)|\\(dấu muốn cắt 2)|\\(dấu muốn cắt 3)...) 
        String s2 = "Xin chào các bạn, tôi là Tấn Phát. Tôi đến từ Phú Yên, hân hạnh đươc làm quen";
        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));
    }
}
