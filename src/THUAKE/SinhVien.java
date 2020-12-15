/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THUAKE;

/**
 *
 * @author Admin
 */
public class SinhVien {
    String id,name;
    int gender;

    public SinhVien() {
    }

    public SinhVien(String id, String name, int gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    
    public String toString() {
        return  "id=" + id + ", name=" + name + ", gender=" + gender ;
    }
    
}
