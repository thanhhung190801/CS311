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
public class GDDat extends GiaoDich {
    private String loaiDat;
    public GDDat(){
        super();
    }

    public GDDat(String loaiDat, int maGD, String ngayGD, double dongia, double dientich) {
        super(maGD, ngayGD, dongia, dientich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    public double thanhtien(){
        if(loaiDat.equals("A")){
            return super.getDientich()*super.getDongia()*1.5;
        }else if(loaiDat.equals("B") || loaiDat.equals("C")){
            return super.getDientich()*super.getDongia();
    } return 0;
    }

    @Override
    public String toString() {
        return "GDDat{" +super.toString()+"loaiDat=" + loaiDat +"Thanh Tien ="+thanhtien()+ '}';
    }
   
}
