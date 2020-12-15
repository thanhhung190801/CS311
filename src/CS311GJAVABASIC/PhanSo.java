/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS311GJAVABASIC;

import java.util.Scanner;
import javax.swing.text.html.HTML;

/**
 *
 * @author Admin
 */
public class PhanSo {
    private int tuso,mauso;

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public PhanSo(){
        tuso=0;mauso=1;
    }
    public PhanSo(int x){
        tuso =1; mauso =x;
    }
    public void input(String ow) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap phan so " + ow + " :\n Nhap tu so:");
        tuso = kb.nextInt();
        do {
            System.out.println("Nhap mau so:");
            mauso = kb.nextInt();
        } while (mauso == 0);

    }
    public String toString(){
        return tuso+"/"+mauso;
    }
    private int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private void rutGon() {
        if (tuso * mauso != 0) {
            int ucln = UCLN(Math.abs(tuso), Math.abs(mauso));
            tuso = tuso / ucln;
            mauso = mauso / ucln;
        }
    }

    public PhanSo congPhanSo(PhanSo a) {
        PhanSo c = new PhanSo();
        c.tuso = tuso * a.mauso + mauso * a.tuso;
        c.mauso = mauso * a.mauso;
        c.rutGon();
        return c;
    }
     public PhanSo truPhanSo(PhanSo a) {
        PhanSo c = new PhanSo();
        c.tuso = tuso * a.mauso - mauso * a.tuso;
        c.mauso = mauso * a.mauso;
        c.rutGon();
        return c;
    }
      public PhanSo nhanPhanSo(PhanSo a) {
        PhanSo c = new PhanSo();
        c.tuso = tuso *  a.tuso;
        c.mauso = mauso * a.mauso;
        c.rutGon();
        return c;
    }
      public PhanSo chiaPhanSo(PhanSo a) {
        PhanSo c = new PhanSo();
        c.tuso = tuso * a.mauso ;
        c.mauso = mauso * a.tuso;
        c.rutGon();
        return c;
    }
      public float giatri(){
          return (float) (tuso*1.0/mauso);
      }
      public static void main(String[] args) {
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a.input("a");
        b.input("b");
          System.out.println("Phan so 1: "+a+"Phan so 2: "+b);
          System.out.println("Phan so tong: "+a.congPhanSo(b));
    }
}
