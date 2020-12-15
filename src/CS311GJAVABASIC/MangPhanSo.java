/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS311GJAVABASIC;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MangPhanSo {
    private ArrayList<PhanSo>list = new ArrayList<>();
    public void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan so");
        int n = kb.nextInt();
        System.out.println("Nhap "+n+" phan so !");
        TinhToanTrenPhanSo ps = new TinhToanTrenPhanSo();
        for (int i = 0; i < n; i++) {
            PhanSo a=ps.nhap1PhanSo("nhap phan so");
            list.add(a);
        }
    }
    public void output(){
        System.out.print("noi dung :{ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ; ");
        }
        System.out.println("\b}");
    }
    public float searchPhanSoMax(){
        float max= list.get(0).giatri();
         
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).giatri()> max){
                max =list.get(i).giatri();
            }
        }
        return max;
}
    public void searchTwoPhanSotolargestsum(){
        float max1 = searchPhanSoMax();
        float max= list.get(0).giatri();
        int location=0,vt=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).giatri()>max &&list.get(i).giatri()<max1){
                max =list.get(i).giatri();
                location =i;
            }
            if(list.get(i).giatri()== max1) vt =i;
        }
        System.out.println("Hai phan so la:"+list.get(location)+" va "+list.get(vt)
                +" sum of  = "+(float)(list.get(location).giatri()+list.get(vt).giatri()));
    }
    public void sortAscendingByvalue(){
        for(int i =0; i < list.size()-1;i++)
            for (int j = i+1; j < list.size(); j++) {
               if(list.get(i).giatri()>list.get(j).giatri()){
                   PhanSo temp = list.get(i);
                   list.set(i,list.get(j));
                   list.set(j,temp);
               }
            }
        output();
    }
    public void sortDecreaseByTuValue(){
        for(int i =0; i < list.size()-1;i++)
            for (int j = i+1; j < list.size(); j++) {
               if(list.get(i).getTuso()< list.get(j).getTuso()){
                   PhanSo temp = list.get(i);
                   list.set(i,list.get(j));
                   list.set(j,temp);
               }
            }
        output();
    }
    public static void main(String[] args) {
        MangPhanSo mang = new MangPhanSo();
        System.out.println("Nhap thong tin cho danh sach:");
        mang.input();
        System.out.println("Xuat thong tin danh sach");
        mang.output();
        System.out.println("gia tri phan so lon nhat la "+mang.searchPhanSoMax());
        System.out.println(" cau 4");
        mang.searchTwoPhanSotolargestsum();
        System.out.println(" danh sach sau khi sap xep tang dan theo gia tri");
        mang.sortAscendingByvalue();
         System.out.println(" danh sach sau khi sap xep giam dan theo tu so");
        mang.sortDecreaseByTuValue();
    }
}