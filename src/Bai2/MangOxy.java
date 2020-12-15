/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import com.sun.xml.internal.ws.api.pipe.Fiber;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MangOxy {

    private ArrayList<Diem> list = new ArrayList<>();

    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap n ");
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap diem thu " + (i + 1));
            int x = kb.nextInt();
            int y = kb.nextInt();
            Diem a = new Diem(x, y);
            list.add(a);

        }
    }

    public void output() {
        System.out.print("noi dung {");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ;  ");
        }
        System.out.println("}!");

    }

    public void Docfile() {
        try {
            File file = new File("sinhvien.txt");
            if (file.exists()) {
                Scanner read = new Scanner(file);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    int x = 0, y = 0;
                    while (line.hasNext()) {
                        x = line.nextInt();
                        y = line.nextInt();
                    }
                    list.add(new Diem(x, y));

                }
            } else {
                System.out.println("khong tim thay file ");
            }
        } catch (Exception e) {
        }

        /*
         public void ghisv(ArrayList<Student> list){
        try(PrintWriter pw = new PrintWriter(new File("SV1.txt"))) {
            for (Student s : list) {
                pw.println(s.getId());
                pw.println(s.getName());
                pw.println(s.getAge());
                pw.println(s.getMark());
            }
            
        } catch (Exception e) {
            System.out.println("got an exception");
        }
    }
         */
    }

    public void ghiDiemoxyInFile() {
        try (PrintWriter pw = new PrintWriter("sinhvien.txt")) {
            for (Diem diem : list) {
                pw.print(diem.getX() + " ");
                pw.println(diem.getY());
            }

        } catch (Exception e) {
        }
    }

    public void docDiemoxyonfile() {
        try (Scanner read = new Scanner(new File("sinhvien.txt"))) {
            while (read.hasNext()) {
                Scanner line = new Scanner(read.nextLine());
                Diem x = new Diem();
                while (line.hasNext()) {
                    x.setX(read.nextInt());
                    x.setY(read.nextInt());
                }

                list.add(x);
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        MangOxy m = new MangOxy();
//        m.Docfile();
        m.input();
        m.ghiDiemoxyInFile();
        m.docDiemoxyonfile();
        m.output();
    }
}
