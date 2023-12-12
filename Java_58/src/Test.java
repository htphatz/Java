
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
        
        // Hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for(int i = 0; i < 10; i++){
            System.out.println("TEST");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Trước khi chạy for: " + t1);
        System.out.println("Trước khi chạy for: " + t2);
        System.out.println("Thời gian: " + (t2 - t1) + " ms");
        System.out.println("Thời gian: " + (t2 - t1) / 1000 + " s");
        
        // Class TimeUnit => chuyển đổi giữa các mốc thời gian (ví dụ chuyển từ năm sang giây)
        System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000 * 365) + " giây");
        
        // Class Date
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        
        // Class Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));
        // Cộng thời gian vào Calendar 30 giờ
        c.add(Calendar.HOUR, 30);
        System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));
        
        // DateFormat 
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(date));
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));
    }
}
