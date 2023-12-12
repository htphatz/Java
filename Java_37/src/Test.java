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
        Lop lopA = new Lop("Lop A", "Khoa A");
        Lop lopB = new Lop("Lop B", "Khoa B");
        Lop lopC = new Lop("Lop C", "Khoa C");
        
        NgaySinh ns1 = new NgaySinh(1, 12, 2003);
        NgaySinh ns2 = new NgaySinh(12, 12, 2003);
        NgaySinh ns3 = new NgaySinh(1, 12, 2003);
        
        SinhVien sv1 = new SinhVien("CT01", "Huynh Tan Phat", ns1, 7.8, lopA);
        SinhVien sv2 = new SinhVien("CT02", "Nguyen Van An", ns2, 2.6, lopB);
        SinhVien sv3 = new SinhVien("CT03", "Tran Phuc Khang", ns3, 5, lopC);
        
        // In ten khoa
        System.out.println("Khoa cua sinh vien 1 la: " + sv1.inTenKhoa());
        System.out.println("Khoa cua sinh vien 2 la: " + sv2.inTenKhoa());
        System.out.println("Khoa cua sinh vien 1 la: " + sv3.inTenKhoa());
        // Kiem tra tung sinh vien co dau tot nghiep hay khong
        System.out.println("Sinh vien 1 dau tot nghiep: " + sv1.kiemTraDauHayKhong());
        System.out.println("Sinh vien 2 dau tot nghiep: " + sv2.kiemTraDauHayKhong());
        System.out.println("Sinh vien 3 dau tot nghiep: " + sv3.kiemTraDauHayKhong());
        // Kiem tra cac sinh vien cung ngay sinh
        System.out.println("Sinh vien 1 cung ngay sinh voi sinh vien 2: " + sv1.kiemTraSinhVienCungNgaySinh(sv2));
        System.out.println("Sinh vien 1 cung ngay sinh voi sinh vien 3: " + sv1.kiemTraSinhVienCungNgaySinh(sv3));
        System.out.println("Sinh vien 2 cung ngay sinh voi sinh vien 3: " + sv2.kiemTraSinhVienCungNgaySinh(sv3));
    }
}
