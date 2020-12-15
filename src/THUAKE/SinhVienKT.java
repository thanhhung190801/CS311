/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUAKE;

/**
 *
 * @author Admin
 */
public class SinhVienKT extends SinhVien{
    float diemMarKetting, diemBiA;

    public SinhVienKT() {
    }

    public SinhVienKT(float diemMarKetting, float diemBiA, String id, String name, int gender) {
        super(id, name, gender);
        this.diemMarKetting = diemMarKetting;
        this.diemBiA = diemBiA;
    }

    @Override
    public String toString() {
        return super.toString()+ "diemMarKetting=" + diemMarKetting + ", diemBiA=" + diemBiA + "sinh vien Kinh Te";
    }

   
    
}
