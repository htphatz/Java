
import java.util.Arrays;

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
        int[] arr = {1, 200 ,30};
        
        // Copy bảng cách 1, có thể thay đổi cả bảng ban đầu
        int[] arr_1 = arr;
        arr_1[0] = 50;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr_1));
        
        // Copy bằng hàm clone, không làm thay đổi bảng ban đầu
        int[] arr_2 = arr.clone();
        arr_2[0] = 12;
        System.out.println(Arrays.toString(arr_2));
        
        // Copy bằng System.arraycopy(), không làm thay đổi mảng ban đầu
        int[] arr_3 = new int[arr.length];
        System.arraycopy(arr, 0, arr_3, 0, arr.length);
        arr_3[0] = 15;
        System.out.println(Arrays.toString(arr_3));
    }
}
