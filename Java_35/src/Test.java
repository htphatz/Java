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
        Ngay ngay1 = new Ngay(1, 12, 2003);
        Ngay ngay2 = new Ngay(1, 1, 2003);
        Ngay ngay3 = new Ngay(1, 12, 2003);
        
        TacGia tg1 = new TacGia("An", ngay1);
        TacGia tg2 = new TacGia("Phu", ngay2);
        TacGia tg3 = new TacGia("Ngan", ngay3);
        
        Sach sach1 = new Sach("Sach A", 1000000, 1998, tg1);
        Sach sach2 = new Sach("Sach B", 2000000, 1997, tg2);
        Sach sach3 = new Sach("Sach C", 3000000, 1998, tg3);
        
        // In ten sach
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();
        // Kiem tra co cung nam san xuat hay khong?
        System.out.println("Sach 1 cung nam san xuat Sach 2: " + sach1.kiemTraCungNam(sach2));
        System.out.println("Sach 1 cung nam san xuat Sach 3: " + sach1.kiemTraCungNam(sach3));
        System.out.println("Sach 2 cung nam san xuat Sach 3: " + sach2.kiemTraCungNam(sach3));
        // Kiem tra so tien sau khi giam gia x%
        System.out.println("Sach 1 sau khi giam gia 15% la " + sach1.giaSauKhiGiam(15));
        System.out.println("Sach 2 sau khi giam gia 35% la " + sach2.giaSauKhiGiam(35));
        System.out.println("Sach 3 sau khi giam gia 5% la " + sach3.giaSauKhiGiam(5));
    }
}
