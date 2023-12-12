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
        String s1 = "Xin chào cô chú xin chào các bạn";
        String s2 = "Xin chào";
        String s3 = "Xin chào nè";
      
        // Hàm indexOf() -> tìm vị trí của chuỗi A trong chuỗi B (trả về âm thì không tìm thấy)
        System.out.println("Vị trí s2 nằm trong s1 là: " + s1.indexOf(s2));
        System.out.println("Vị trí s3 nằm trong s1 là: " + s1.indexOf(s3));
        
        // Hàm lastIndexOf() -> tìm kiếm từ phải sang trái
    }
}
