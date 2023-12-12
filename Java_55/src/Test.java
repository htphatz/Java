
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
        int[] arr_a = {1, -6 , 7, 10, 9, 100};
        
        // Hàm xuất ra mảng
        System.out.println("Mảng A ban đầu là: " + Arrays.toString(arr_a));
        
        // Hàm sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(arr_a);
        System.out.println("Mảng A sau khi được sắp xếp là: " + Arrays.toString(arr_a));
        
        // Hàm tìm kiếm nhị phân trong mảng (chỉ áp dụng với mảng đã sắp xếp theo thứ tự tăng dần)
        System.out.println("Vị trí của 10 trong mảng A là: " + Arrays.binarySearch(arr_a, 10));
        System.out.println("Vị trí của 2 trong mảng A là: " + Arrays.binarySearch(arr_a, 2));
    }
}
