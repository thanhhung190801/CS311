/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUAKE;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class modifierOfSV {
    public static ArrayList<SinhVien> getListSVFromFile(String tenfile){
        ArrayList<SinhVien> list = new ArrayList<>();
    
        try (Scanner read = new Scanner(new File(tenfile))){
            //001 Mai Thanh Hung 1 10 9.5 9.5
            //001 Nguyen Thi ngan nhi 0 7 9 7
           while(read.hasNextLine()){
                String ms ="";
            String name ="";
            ms=read.next();
            while (read.hasNext()&&!read.hasNextInt()) {                
                 
                name= name +read.next()+ " ";
            }
             int gt =read.nextInt();
             float diem1=read.nextFloat();
             float diem2=read.nextFloat();
             if(read.hasNextFloat()){
                 float diem3 =read.nextFloat();
                 list.add(new SinhvienIT(diem1, diem2, diem3, ms, name, gt));
             }
             else list.add(new SinhVienKT(diem1, diem2, ms, name, gt));
           }
        
        } catch (Exception e) {
        }
   return list; 
}
    public static void Display(ArrayList<SinhVien> list ){
        for (Iterator<SinhVien> iterator = list.iterator(); iterator.hasNext();) {
            SinhVien next = iterator.next();
            System.out.println(next+" ; ");
        }
    }
    
}