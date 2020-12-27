/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiGiaoDich;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MangGiaoDich {
    private ArrayList<GiaoDich>list = new ArrayList<>();
    public void readDataFromfile(){
        try (Scanner read = new Scanner(new File("giaodich.txt"))){
            while(read.hasNextLine()){
                String maGd = read.next();
                String datestring =read.next();
                float dongia =read.nextFloat();
                float dientich =read.nextFloat();
                if(read.hasNextBoolean()){
                    list.add(new GiaoDichNha(read.nextBoolean(), maGd, dientich, dongia, new SimpleDateFormat("dd/MM/yyyy").parse(datestring)));
                }else                    
                    list.add(new GiaoDichDat(read.next(), maGd, dientich, dongia, new SimpleDateFormat("dd/MM/yyyy").parse(datestring)));
            }
        } catch (Exception e) {
        }
    }
    public void output(String nd ){
        System.out.println(nd);
        int  i =0;
        for (GiaoDich g : list) {
            i++;
            System.out.println(i+"."+g);  
        }
    }
    public static void main(String[] args) {
        MangGiaoDich a = new MangGiaoDich();
        a.readDataFromfile();
        a.output("danh sach mang la ");
    }
}
