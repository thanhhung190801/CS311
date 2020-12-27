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
public class GiaoDichDat extends GiaoDich{
    String loaidat;

    public GiaoDichDat() {
        super();
        loaidat="";
    }

    public GiaoDichDat(String loaidat, String maGD, float dientich, float dongia, Date ngaynhap) {
        super(maGD, dientich, dongia, ngaynhap);
        this.loaidat = loaidat;
    }

    public String getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }

    @Override
    public double getThanhtien() {
        if(loaidat.equalsIgnoreCase("A"))return dientich*dongia;
        return dientich*dongia*0.9;
    }
    
    @Override
    public String toString() {
        return "GiaoDichDat{" +super.toString()+ "loaidat=" + loaidat +",Thanh tien= "+getThanhtien() +'}';
    }
    
    
}
