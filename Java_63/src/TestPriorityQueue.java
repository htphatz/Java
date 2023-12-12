
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class TestPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSach = new PriorityQueue<String>();
        
        danhSach.offer("Huynh Tan Phat");
        danhSach.offer("Nguyen Van Khoa");
        danhSach.offer("Truong Hoang Thinh");
        danhSach.offer("A");
        danhSach.offer("ABC");
        
        
        while (true) {
            String ten = danhSach.poll();
            if (ten == null ){
                break;
            }
            System.out.println(ten);
        }
    }
}
