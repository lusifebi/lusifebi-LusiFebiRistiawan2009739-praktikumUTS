/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lusifebiristiawan_2009739.uts.soal4_balok;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class UTSSoal4_Balok {

    public static void main(String[] args) {
        Balok Balok1 = new Balok();
        System.out.println("Balok 1");
        System.out.println("1)Luas Balok = " + Balok1.Luas());
        System.out.println("2)Keliling Balok = " + Balok1.Kelilng());
        System.out.println("3)Volume Balok = " + Balok1.Volume());
        System.out.println("");
        
        Balok Balok2 = new Balok();
        Balok2.panjang = 30;
        Balok2.lebar = 40;
        Balok2.tinggi = 50;
        System.out.println("Balok 2");
        System.out.println("1)Luas Balok = " + Balok2.Luas());
        System.out.println("2)Keliling Balok = " + Balok2.Kelilng());
        System.out.println("3)Volume Balok = " + Balok2.Volume());
        System.out.println("");
        
        Balok Balok3 = new Balok();
        Balok3.setPanjangLebarTinggi(25, 35, 45);
        System.out.println("Balok 3");
        System.out.println("1)Luas Balok = " + Balok3.Luas());
        System.out.println("2)Keliling Balok = " + Balok3.Kelilng());
        System.out.println("3)Volume Balok = " + Balok3.Volume());
    }
}
