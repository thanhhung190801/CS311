/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUAKE;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Test1 {
    public static void main(String[] args) {
         ArrayList<SinhVien> list =modifierOfSV.getListSVFromFile("sinhviendatmoniac.txt");
         modifierOfSV.Display(list);
    }
}
