/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS311GJAVABASIC;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
//public class TinhToanTrenPhanSo {

//    private PhanSo a;
//    private PhanSo b;
//    private char pt;
//
//    public PhanSo Nhap1PhanSo(String ow) {
//        int b;
//        Scanner kb = new Scanner(System.in);
//        System.out.println(ow+"\nNhap tu so:");
//        int a = kb.nextInt();
//        do {
//            System.out.println("Nhap mau so >0:");
//            b = kb.nextInt();
//        } while (b <= 0);
//        PhanSo c = new PhanSo(a,b);
//        return c;
//    }
//
//    public void input() {
//        Scanner kb = new Scanner(System.in);
//        PhanSo a = Nhap1PhanSo("Nhap phan so thu 1:");
//        PhanSo b = Nhap1PhanSo("Nhap phan so thu 2:");
//        do {
//            System.out.println("Nhap phep tinh (+ , - , * , /)");
//            pt = kb.next().charAt(0);
//        } while (pt != '+' && pt != '-' && pt != '*' && pt != '/');
//    }
//
//    public void output() {
//        System.out.println("phep tinh la :"+pt);
//        PhanSo c = new PhanSo();
//        switch (pt) {
//            case '+' :
//                c = a.congPhanSo(b);
//                break;
//            case '-':
//                c = a.truPhanSo(b);
//                break;
//            case '*':
//                c = a.nhanPhanSo(b);
//                break;
//            case '/':
//                if (b.getTuso() == 0) {
//                    System.out.println("khong the chia duoc: ");
//                    System.exit(0);
//                } else {
//                    c = a.chiaPhanSo(b);
//                }
//        }
//        System.out.println("ket qua: " + a + " " + pt + " " + b + " = " + c);
//    }
//    public static void main(String[] args) {
//        TinhToanTrenPhanSo m = new TinhToanTrenPhanSo();
//        m.input();
//        m.output();
//    }
    
//}
public class TinhToanTrenPhanSo {
    private PhanSo a,b;
    private char pt;
    public PhanSo nhap1PhanSo(String nd){
        PhanSo c;
        int x,y;
        System.out.println(nd);
        Scanner kb = new Scanner (System.in);
        System.out.print("\tTu: ");
        x = kb.nextInt();
        do{
            System.out.print("\tMau>0: ");
            y=kb.nextInt();
            
        }while(y<=0);
        c = new PhanSo(x,y);
        return c;
    }
    public void input(){
        a = nhap1PhanSo("Nhap phan so 1: ");
        b = nhap1PhanSo("Nhap phan so 2: ");
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Nhap phep toan (+,-,*,/): ");
            pt = kb.next().charAt(0);            
        }while(pt!='+' && pt!='-'&& pt!='*'&& pt!='/');
    }
    public void output(){
        PhanSo c = new PhanSo();
        switch(pt){
            case '+': c = a.congPhanSo(b);break;
            case '-': c = a.truPhanSo(b); break;
            case '*': c = a.nhanPhanSo(b);break;
            case '/': if(b.getTuso()==0){
                           System.out.println("khong chi 0");
                           System.exit(0);
            }    
            else c = a.chiaPhanSo(b); 
                
        }
        System.out.println(a + " " + pt + " " + b +" = "+ c);
    }
    public static void main(String[] args) {
       TinhToanTrenPhanSo a = new TinhToanTrenPhanSo();
       a.input();
       a.output();
    }
}