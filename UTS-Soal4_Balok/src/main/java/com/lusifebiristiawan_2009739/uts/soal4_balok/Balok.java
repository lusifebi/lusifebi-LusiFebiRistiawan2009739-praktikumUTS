/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lusifebiristiawan_2009739.uts.soal4_balok;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class Balok {
    int panjang = 1;
    int lebar = 1;
    int tinggi = 1;
     
    int Luas (){
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    int Kelilng (){
        return 4 * (panjang + lebar + tinggi);
    }
    
    int Volume(){
        return panjang * lebar * tinggi;
    }
    
    void setPanjangLebarTinggi (int newPanjang, int newLebar, int newTinggi){
        panjang = newPanjang;
        lebar = newLebar;
        tinggi = newTinggi;
    }
}
