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
public class Date {
    int ngay,thang,nam;

    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public Date (String st){
        int i=st.indexOf("/");
        int j=st.indexOf("/",i+1);
        ngay=Integer.parseInt(st.substring(0,i));
        thang=Integer.parseInt(st.substring(i+1,j));
        nam=Integer.parseInt(st.substring(j+1,st.length()));
    } 
    public String toString(){
        return ngay+"/"+thang+"/"+nam;
    }
}
