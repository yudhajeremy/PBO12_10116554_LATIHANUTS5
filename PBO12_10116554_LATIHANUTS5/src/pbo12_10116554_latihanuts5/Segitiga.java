/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116554_latihanuts5;

/**
 *
 * @author Jemmy
 */
public class Segitiga implements BangunDatar{

    private int luas;
    private int keliling;
    private final int sisiAb;
    private final int sisiBc;
    private final int sisiCa;
    private final int alas;
    private final int tinggi;
    
    public Segitiga (int ab, int bc, int ca, int alas, int tinggi){
        this.sisiAb = ab;
        this.sisiBc = bc;
        this.sisiCa = ca;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public void hitungLuas() {
        luas = (alas * tinggi)/2;
        System.out.println("Luas Segitiga = "+luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = sisiAb + sisiBc + sisiCa;
        System.out.println("Keliling Segitiga = "+keliling);
    }
    
}
