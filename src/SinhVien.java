
import java.util.Scanner;
import javafx.scene.shape.DrawMode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class SinhVien {

    private int maSv, namsinh, gioitinh;
    String hoten, mon;
    float diem;

    public SinhVien(int maSv, int namsinh, int gioitinh, String hoten, String mon, float diem) {
        this.maSv = maSv;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
        this.hoten = hoten;
        this.mon = mon;
        this.diem = diem;
    }

    public SinhVien() {
    }

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSv=" + maSv + ", namsinh=" + namsinh + ", gioitinh=" + gioitinh + ", hoten=" + hoten + ", mon=" + mon + ", diem=" + diem + '}';
    }

    public static void main(String[] args) {
        System.out.println("nhap thong tin sinh vien");
        Scanner sc = new Scanner(new Scanner(System.in).nextLine());
        //001 Mai thanh Hung 2001  0  lap trinh  10
        int ms = sc.nextInt();
        String ten = "", mon = "";
        int namsinh = 0, gt = 0;
        float diem = 0;
        while (sc.hasNext() && !sc.hasNextInt()) {
            ten = ten + sc.next() + " ";
        }
        namsinh = sc.nextInt();
        gt = sc.nextInt();
        while (sc.hasNext() && !sc.hasNextInt()) {
            mon = mon + sc.next() + " ";
        }
           diem =sc.nextFloat();

        SinhVien x = new SinhVien(ms, namsinh, gt, ten, mon, diem);
        System.out.println(x);

    }
}
