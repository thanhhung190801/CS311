package BAI1;

import java.util.Scanner;

public class DiemOxy {
   private int ox,oy;
public void DiemOxy(){
      ox=0;
      oy=0;
  }
 public void DiemOxy(int x,int y){ 
     ox=x;
     oy=y;
}
 
 public int getox(){
     return ox;
 }
 public void setox(int x){
         ox=x;
}
 public int getoy(){
     return oy;
 }
 public void setoy(int y){
         oy=y;
}
public  double modul() {
 return Math.sqrt((Math.pow((ox-0), 2))+(Math.pow((oy-0), 2)));
}
public double khoangcach(DiemOxy b) {
  return  Math.sqrt((Math.pow((ox-b.ox), 2))+(Math.pow((oy-b.oy), 2)));
    
}
@Override
public String toString(){
 return ox+":"+oy;  
}
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        DiemOxy diem1 = new DiemOxy();
        DiemOxy diem2 = new DiemOxy();
        DiemOxy diem3 = new DiemOxy();
 System.out.print("Nhap diem thu 1: ");
 System.out.print("nhap toa do x: ");
        int x1=sc.nextInt();
 System.out.print("nhap toa do y: ");       
        int y1=sc.nextInt();
        diem1.DiemOxy(x1, y1);
  System.out.print("Nhap diem thu 2: ");
  System.out.print("nhap toa do x: ");
        int x2=sc.nextInt();
  System.out.print("nhap toa do y: ");       
        int y2=sc.nextInt();
        diem2.DiemOxy(x2, y2);
  System.out.print("Nhap diem thu 2: ");
  System.out.print("nhap toa do x: ");
        int x3=sc.nextInt();
  System.out.print("nhap toa do y: ");       
        int y3=sc.nextInt();
  diem3.DiemOxy(x3, y3);
        double a = diem2.modul();
        double b = diem3.modul();
        double c = diem2.khoangcach(diem3);
   if ((a+b<=c) || (a+c<=b) || (b+c<=a)) 
             System.out.println("ba canh vua nhap không tao thanh tam giac");
         else 
         {
              double p = (a+b+c)/2;
             System.out.println("chu vi tam giac la: " + (float)(a+b+c));
             System.out.println("dien tich tam giac la: "+ (float)(Math.sqrt(p*(p-a)*(p-b)*(p-c))) );
             if (a == b && b == c) 
            	 System.out.println("tam giac nay la tam tam giac deu");
             else if (a == b || a == c || b == c)
             {
                 if ((a*a) + (b*b) == (c*c) || (a*a) + (c*c) == (b*b) || b*b + c*c == a*a) 
                     System.out.println("tam giac nay la tam giac vuong can.");
                 else 
                	 System.out.println("tam giac nay la tam giac can.");
              }
             else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) 
                     System.out.println("tam giac nay la tam giac vuong.");
             else System.out.println("tam giac thuong.");
         }
 }
}
