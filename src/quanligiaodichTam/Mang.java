/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanligiaodichTam;
import QuanLiGiaoDich.GiaoDichDat;
import QuanLiGiaoDich.GiaoDichNha;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
/**
 *
 * @author tamho
 */
public class Mang {
    private ArrayList<GiaoDich> list=new ArrayList<GiaoDich>();
    Scanner scan= new Scanner(System.in);
    public void input() throws FileNotFoundException{
        File f=new File("giaodich.txt");
        if(f.exists()){
            try(Scanner readf=new Scanner(f)){
                while(readf.hasNextLine()){
                    int maGD=readf.nextInt();
                    String ngayGD=readf.next();
                    double dongia=readf.nextDouble();
                    double dientich=readf.nextDouble();
                    String loaix=readf.next();
                    if(loaix.equals("true")){
                        list.add(new GDNha(true, maGD, ngayGD, dongia, dientich));
                    }else if(loaix.equals("false")){
                        list.add(new GDNha(false, maGD, ngayGD, dongia, dientich));
                    }else
                        list.add(new GDDat(loaix, maGD, ngayGD, dongia, dientich));
                }
            }catch(Exception e){
                System.out.println("Error");
            }
        }else {
            System.out.println("FIle khong ton tai");
        }
    }
    public void readDataFromfile(){
        try (Scanner read = new Scanner(new File("giaodich.txt"))){
            while(read.hasNextLine()){
                int maGd = read.nextInt();
                String datestring =read.next();
                double dongia =read.nextDouble();
                double dientich =read.nextDouble();
                if(read.hasNextBoolean()){
                    list.add(new GDNha(read.nextBoolean(), maGd, datestring, dongia, dientich));
                }else                    
                    list.add(new GDDat(read.next(), maGd, datestring, dongia, dientich));
            }
        } catch (Exception e) {
        }
    }
   
    public void output(){
        System.out.println("Danh sach:");
        for(GiaoDich i:list)
            System.out.println(i);
    }
}