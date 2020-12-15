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
public class SinhvienIT  extends SinhVien{
    float diemjava, diemcss, diemhtml;

    public SinhvienIT() {
        super();
        diemjava= diemcss= diemhtml=0;
        
    }

    public SinhvienIT(float diemjava, float diemcss, float diemhtml, String id, String name, int gender) {
        super(id, name, gender);
        this.diemjava = diemjava;
        this.diemcss = diemcss;
        this.diemhtml = diemhtml;
    }

    @Override
    public String toString() {
        return  super.toString() + "  diemjava=" + diemjava + ", diemcss=" + diemcss + ", diemhtml=" + diemhtml + "Sinh Vien CNTT";
    }
    
    
}
