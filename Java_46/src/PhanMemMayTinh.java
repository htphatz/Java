/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface{

    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        if (b == 0){
            return 0;
        }
        return a / b;
    }

    @Override
    public void sapXepTang(int n, int[] a) {
        for(int i = 0; i < n - 1; i++){
            for(int j = i; j < n; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    @Override
    public void sapXepGiam(int n, int[] a) {
        for(int i = 0; i < n - 1; i++){
            for(int j = i; j < n; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
}
