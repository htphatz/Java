
import java.util.Scanner;
import java.util.Stack;

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
        Scanner scanner = new Scanner(System.in);
       
        Stack<String> stackString = new Stack<String>();
        // stackString.push("giaTri") => đưa giaTri vào stack
        // stackString.pop() => lấy giá trị ra, xóa giá trị đó khỏi stack
        // stackString.peek() => lấy giá trị ra nhưng không xóa giá trị đó khỏi stack
        // stackString.clear() => xóa tất cả phần tử trong stack
        // stackString.contains("giaTri") => kiểm tra giaTri có tồn tại trong stack không (boolean)
        // stackString.size() => lấy ra độ lớn của stack
        
        System.out.print("Nhập vào chuỗi: ");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++){
            stackString.push(s.charAt(i)+"");
        }
        System.out.println("Chuỗi đảo ngược:");
        for (int i = 0; i < s.length(); i++){
            System.out.print(stackString.pop());
        }
        
        // Làm bài toán chuyển từ số thập phân sang nhị phân
        System.out.print("Nhập vào số nguyên dương: ");
        Stack<Integer> stackSoDu = new Stack<Integer>();
        int n = scanner.nextInt();
        while (n > 0){
            int soDu = n % 2;
            stackSoDu.push(soDu);
            n /= 2;
        }
        int sizeStack = stackSoDu.size();
        for(int i =0; i< sizeStack; i++){
            System.out.print(stackSoDu.pop());
        }
    }
}
