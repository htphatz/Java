
import java.util.ArrayDeque;
import java.util.Deque;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class TestDeque {
    public static void main(String[] args) {
        Deque<String> danhSach = new ArrayDeque<String>();
        
        danhSach.offerLast("Huynh Tan Phat");
        danhSach.offer("Nguyen Van Khoa");
        danhSach.offer("Truong Hoang Thinh");
        danhSach.offerFirst("A");
        danhSach.offerLast("ABC");
        
        
        while (true) {
            String ten = danhSach.poll();
            if (ten == null ){
                break;
            }
            System.out.println(ten);
        }
    }
}
