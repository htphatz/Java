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
        String s1 = "titv.vn";
        String s2 = "TITV.VN";
        String s3 = "titv.vn";
        
        // Hàm equals() -> so sánh 2 chuỗi giống nhau hay không, phân biệt hoa thường (boolean)
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s2 equals s3: " + s2.equals(s3));
        
        // Hàm equalsIgnoreCase() -> so sánh 2 chuỗi giống nhau hay không, không phân biệt hoa thường (boolean)
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
        System.out.println("s2 equalsIgnoreCase s3: " + s2.equalsIgnoreCase(s3));
        
        /* Hàm comepareTo() -> so sánh chuỗi phân biệt hoa thường ( thường dùng trong bài toán sắp xếp) 
        (trả về số nguyên: dương (lớn hơn), âm (bé hơn) và bằng nhau) */
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van A";
        System.out.println("sv1 comepareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv1 comepareTo sv3: " + sv1.compareTo(sv3));
        System.out.println("sv2 comepareTo sv3: " + sv2.compareTo(sv3));
        
        // Hàm compareToIgnoreCase() -> tương tự hàm compareTo() nhưng không phân biệt hoa thường
        /* Hàm regionMatches() -> so sánh một đoạn của chuỗi này với chuỗi kia
        (thường dùng trong bài toán kiểm tra chuỗi A có nằm trong chuối B không) */ 
        // Hàm starWith(...) -> kiểm tra chuỗi có bắt đầu ... không (boolean)
        // Hàm endWith(...) -> kiểm tra chuỗi có kết thúc ... không (boolean)
    }
}
