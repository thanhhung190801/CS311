/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanligiaodichTam;

import java.io.FileNotFoundException;

/**
 *
 * @author tamho
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Mang a=new Mang();
//        a.input();
            a.readDataFromfile();
        a.output();
        
    }
}
