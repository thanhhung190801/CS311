/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanligiaodichTam;

/**
 *
 * @author tamho
 */
public abstract class GiaoDich {
    protected int maGD;
    protected Date ngayGD;
    protected double dongia, dientich;

    public GiaoDich(){
        
    }
    public GiaoDich(int maGD, String ngayGD, double dongia, double dientich) {
        this.maGD = maGD;
        this.ngayGD = new Date(ngayGD);
        this.dongia = dongia;
        this.dientich = dientich;
    }

    public int getMaGD() {
        return maGD;
    }

    public void setMaGD(int maGD) {
        this.maGD = maGD;
    }

    public Date getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(Date ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }
    public abstract double thanhtien();

    @Override
    public String toString() {
        return  "maGD=" + maGD + ", ngayGD=" + ngayGD + ", dongia=" + dongia + ", dientich=" + dientich+"thanh tien"+thanhtien() ;
    }   
    
    
}
