/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ThoiKhoaBieu {
    private Thu thu;
    private String monHoc;

    public ThoiKhoaBieu() {
    }

    public ThoiKhoaBieu(Thu thu, String monHoc) {
        this.thu = thu;
        this.monHoc = monHoc;
    }

    public Thu getThu() {
        return thu;
    }

    public void setThu(Thu thu) {
        this.thu = thu;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu{" + "thu=" + thu + ", monHoc=" + monHoc + '}';
    }
}
