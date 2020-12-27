/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiGiaoDich;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class GiaoDichNha extends GiaoDich{
    boolean loainha;

    public GiaoDichNha() {
        super();
        loainha=true;
    }

    public GiaoDichNha(boolean loainha, String maGD, float dientich, float dongia, Date ngaynhap) {
        super(maGD, dientich, dongia, ngaynhap);
        this.loainha = loainha;
    }

    public boolean isLoainha() {
        return loainha;
    }

    public void setLoainha(boolean loainha) {
        this.loainha = loainha;
    }

     @Override
    public double getThanhtien() {
        if(loainha==true)return dientich*dongia;
        return dientich*dongia*0.9;
    }
    
    @Override
    public String toString() {
        return "GiaoDichNha{" +super.toString()+ "loaidat=" + loainha +",Thanh tien= "+getThanhtien() +'}';
    }
}
