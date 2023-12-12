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
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        int a[] = {0, 1, 6, -2, 15, 9, 12, 4, 3};
        System.out.println("2 + 5 = " + pmmt.cong(2, 5));
        System.out.println("2 - 5 = " + pmmt.tru(2, 5));
        System.out.println("2 * 5 = " + pmmt.nhan(2, 5));
        System.out.println("2 / 5 = " + pmmt.chia(2, 5));
        pmmt.sapXepTang(a.length, a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        pmmt.sapXepGiam(a.length, a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
