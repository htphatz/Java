/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class MenuModel {
    private String luaChonMonChinh;
    private String luaChonMonPhu;
    private double tongTien;

    public MenuModel() {
        this.luaChonMonChinh = "";
        this.luaChonMonPhu = "";
        this.tongTien = 0;
    }

    public String getLuaChonMonChinh() {
        return luaChonMonChinh;
    }

    public void setLuaChonMonChinh(String luaChonMonChinh) {
        this.luaChonMonChinh = luaChonMonChinh;
    }

    public String getLuaChonMonPhu() {
        return luaChonMonPhu;
    }

    public void setLuaChonMonPhu(String luaChonMonPhu) {
        this.luaChonMonPhu = luaChonMonPhu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void tinhTongTien(){
        this.tongTien = 0;
        if (this.luaChonMonChinh.equals("COM")){
            this.tongTien += 25000;
        } 
        else if (this.luaChonMonChinh.equals("BUN")){
            this.tongTien += 35000;
        }
        else if (this.luaChonMonChinh.equals("PHO")){
            this.tongTien += 40000;
        }
        
        // Xu li cat chuoi co dau ;
        StringTokenizer stk = new StringTokenizer(this.luaChonMonPhu, ";");
	while(stk.hasMoreElements()) {
            String monPhu = stk.nextToken();
            // Xoa khoang trang cuoi va dau chuoi
            monPhu = monPhu.trim();
            if (monPhu.equals("TTA SUA")) {
		tongTien+= 5000;
            } else if(monPhu.equals("COCACOLA")) {
		tongTien+= 10000;
            } else if(monPhu.equals("NEM")) {
		tongTien+= 15000;
            } else if(monPhu.equals("CA VIEN")) {
		tongTien+= 20000;
            }
	}
    }
    
}
