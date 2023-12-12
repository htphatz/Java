package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
    - Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền <= số tiền họ đang có
    - Luật chơi: 
    + Có 3 viên xúc xắc, mỗi viên xúc xắc có 6 mặt giá trị từ 1 -> 6
    + Mỗi lần lắc sẽ có kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá trị xx3
    1. Nếu tổng = 3 hoặc 18 => Nhà cái ăn hết, người chơi thua
    2. Nếu 4 <= tổng <= 10 => XỈU => Nếu người chơi đặt xíu thì ăn, ngược lại thì thua
    3. Nếu 11 <= tổng <= 17 => TÀI => Nếu người chơi đặt tài thì ăn, ngược lại thì thua

*/

public class TaiXiu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taiKhoanNguoiChoi = 5000000;
        
        Locale lc = new Locale("vi", "VN");
        NumberFormat numf = NumberFormat.getInstance(lc); 
                
        int luaChonPhim = 0;
        do{
            System.out.println("--------------- Mời bạn lựa chọn ---------------");
            System.out.println("Chọn phím (1) để bắt đầu trò chơi");
            System.out.println("Chọn phím bất kì để kết thúc trò chơi");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChonPhim = scanner.nextInt();
            if(luaChonPhim == 1){
                System.out.println("***** BẮT ĐẦU CHƠI");
                System.out.println("***** Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi));
                System.out.println("***** Mời bạn đặt cược (số tiền cược phải bé hơn hoặc bằng " + numf.format(taiKhoanNguoiChoi));
                double tienDatCuoc = 0;
                do{
                    System.out.print("***** Nhập số tiền muốn cược: ");
                    tienDatCuoc = scanner.nextDouble();
                } while (tienDatCuoc <=0 || tienDatCuoc > taiKhoanNguoiChoi);
                int luaChonTaiXiu = 0;
                do{
                    System.out.print("***** Nhập lựa chọn của bạn (1. XỈU - 2. TÀI): ");
                    luaChonTaiXiu = scanner.nextInt();
                } while(luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
                
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();
                
                int giaTri1 = xucXac1.nextInt(5) + 1; 
                int giaTri2 = xucXac2.nextInt(5) + 1; 
                int giaTri3 = xucXac3.nextInt(5) + 1; 
                int ketQuaTaiXiu = giaTri1 + giaTri2 + giaTri3;
                
                System.out.println("***** Kết quả các xúc xắc lần lượt là: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
                if(ketQuaTaiXiu == 3 || ketQuaTaiXiu == 18){
                    System.out.println("***** Tổng là: " + ketQuaTaiXiu);
                    System.out.println("***** Nhà cái ăn hết, bạn thua cuộc");
                    taiKhoanNguoiChoi -= tienDatCuoc;
                    System.out.println("***** Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi));
                }
                else if(ketQuaTaiXiu >= 4 && ketQuaTaiXiu <= 10){
                    System.out.println("***** Tổng là: " + ketQuaTaiXiu + " => XỈU");
                    if(luaChonTaiXiu == 1) {
                        System.out.println("Bạn đã thắng cược");
                        taiKhoanNguoiChoi += tienDatCuoc;
                        System.out.println("***** Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi));
                    }
                    else {
                        System.out.println("Bạn đã thua cược");
                        taiKhoanNguoiChoi -= tienDatCuoc;
                        System.out.println("***** Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi));
                    }
                }
                else if(ketQuaTaiXiu >= 11 && ketQuaTaiXiu <= 17){
                    System.out.println("***** Tổng là: " + ketQuaTaiXiu + " => TÀI");
                    if(luaChonTaiXiu == 2) {
                        System.out.println("Bạn đã thắng cược");
                        taiKhoanNguoiChoi += tienDatCuoc;
                        System.out.println("***** Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi));
                    }
                    else {
                        System.out.println("Bạn đã thua cược");
                        taiKhoanNguoiChoi -= tienDatCuoc;
                        System.out.println("***** Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi));
                    }
                }
            }
        } while(luaChonPhim == 1);
    }
}
