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
        QuocGia qg1 = new QuocGia("45176", "Vietnam");
        QuocGia qg2 = new QuocGia("56239", "Thailand");
        QuocGia qg3 = new QuocGia("23786", "Cambodia");
        
        HangSanXuat hangSX1 = new HangSanXuat("Hang A", qg1);
        HangSanXuat hangSX2 = new HangSanXuat("Hang B", qg2);
        HangSanXuat hangSX3 = new HangSanXuat("Hang C", qg3);
        
        NgaySanXuat ngaySX1 = new NgaySanXuat(1, 12, 2023);
        NgaySanXuat ngaySX2 = new NgaySanXuat(12, 12, 2019);
        NgaySanXuat ngaySX3 = new NgaySanXuat(1, 12, 2013);
        
        MayTinh mt1 = new MayTinh(hangSX1, ngaySX1, 23000000, 12);
        MayTinh mt2 = new MayTinh(hangSX2, ngaySX2, 19000000, 9);
        MayTinh mt3 = new MayTinh(hangSX3, ngaySX3, 15000000, 6);
        
        // Kiem tra may tinh co gia thap hon may tinh khac khong
        System.out.println("May tinh 1 co gia thap hon may tinh 2: " + mt1.kiemTraGiaBanThapHon(mt2));
        System.out.println("May tinh 1 co gia thap hon may tinh 3: " + mt1.kiemTraGiaBanThapHon(mt3));
        System.out.println("May tinh 3 co gia thap hon may tinh 2: " + mt3.kiemTraGiaBanThapHon(mt2));
        // In ten quoc gia san xuat may tinh
        System.out.println("Quoc gia san xuat may tinh 1: " + mt1.inTenQuocGia());
        System.out.println("Quoc gia san xuat may tinh 2: " + mt2.inTenQuocGia());
        System.out.println("Quoc gia san xuat may tinh 3: " + mt3.inTenQuocGia());
    }
}
