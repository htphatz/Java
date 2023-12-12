/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public MayBay(String loaiNhienLieu,HangSanXuat hangSanXuat) {
        super("May bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc(){
        return 1500;
    }
}
