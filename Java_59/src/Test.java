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
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Thu.Thứ_2, "Toán - Lý - Hóa");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Thu.Thứ_3, "Văn - Sử - Địa");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Thu.Thứ_4, "Công nghệ - Tin - Thể dục");
        System.out.println(tkb_t2);
        System.out.println(tkb_t3);
        System.out.println(tkb_t4);
        
        System.out.println("Tháng 1 có " + Thang.Tháng_1.getSoNgay() + " ngày");
    }
}
