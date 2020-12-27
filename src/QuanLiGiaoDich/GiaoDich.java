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
public abstract class  GiaoDich {
    String maGD ;
    float dientich,dongia;
    Date ngaynhap;

    public GiaoDich() {
    }

    public GiaoDich(String maGD, float dientich, float dongia, Date ngaynhap) {
        this.maGD = maGD;
        this.dientich = dientich;
        this.dongia = dongia;
        this.ngaynhap = ngaynhap;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public float getDientich() {
        return dientich;
    }

    public void setDientich(float dientich) {
        this.dientich = dientich;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    @Override
    public String toString() {
        return  "maGD=" + maGD + ", dientich=" + dientich + ", dongia=" + dongia + ", ngaynhap=" + ngaynhap ;
    }
    public abstract double getThanhtien();
}
