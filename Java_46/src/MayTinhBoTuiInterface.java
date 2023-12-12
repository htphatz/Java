/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author HP
 */
/*
    - Mot interface trong Java la mot ban thiet ke cua 1 lop
    - Chi chua cac "Phuong thuc truu tuong" va "Hang so"
    - Tat ca cac hang so mac dinh la o dang "public static final"
    - Tat ca cac phuong thuc o dang "Public"
    - Tuong tu nhu lop abtract, no khong the khoi tao thanh "doi tuong"
    ======> Dung interface de thu "tinh truu tuong hoan toan" va "da ke thua trong Java"
*/

public interface MayTinhBoTuiInterface {
    public abstract double cong(double a, double b);
    public abstract double tru(double a, double b);
    public abstract double nhan(double a, double b);
    public abstract double chia(double a, double b);
}
