/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class QLSVModel {
    private ArrayList<SinhVien> dsSinhVien;
    private String luaChon;

    public QLSVModel() {
        this.dsSinhVien = new ArrayList<SinhVien>();
        this.luaChon = "";
    }

    public ArrayList<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    public String getLuaChon() {
        return luaChon;
    }

    public void setLuaChon(String luaChon) {
        this.luaChon = luaChon;
    }
    
    public void insert(SinhVien sv){
        this.dsSinhVien.add(sv);
    }
    
    public void delete(SinhVien sv){
        this.dsSinhVien.remove(sv);
    }
}
