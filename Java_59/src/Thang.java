/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author HP
 */
public enum Thang {
    Tháng_1(31),
    Tháng_2(29),
    Tháng_3(31),
    Tháng_4(30),
    Tháng_5(31),
    Tháng_6(30),
    Tháng_7(31),
    Tháng_8(31),
    Tháng_9(30),
    Tháng_10(31),
    Tháng_11(30),
    Tháng_12(31);
    
    private final int soNgay;
    Thang(int soNgay){
        this.soNgay = soNgay;
    }
    
    public int getSoNgay(){
        return this.soNgay;
    }
}
