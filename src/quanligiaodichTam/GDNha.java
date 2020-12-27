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
public class GDNha extends GiaoDich{
    private boolean loaiNha;
    public GDNha(){
        super();
    }

    public GDNha(boolean loaiNha, int maGD, String ngayGD, double dongia, double dientich) {
        super(maGD, ngayGD, dongia, dientich);
        this.loaiNha = loaiNha;
    }

    public boolean isLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(boolean loaiNha) {
        this.loaiNha = loaiNha;
    }
    public double thanhtien(){
        //true=ngoai pho, false trong kiet.
        if(loaiNha==true)
            return super.getDientich()*super.getDongia();
        return super.getDientich()*super.getDongia()*0.9;
    }

    @Override
    public String toString() {
        return "GDNha{" +super.toString()+ "loaiNha=" + (loaiNha==true?"Mat Pho":"Trong kiet") + 
                "Thanh Tien ="+thanhtien()+'}';
    }

   
    
}
