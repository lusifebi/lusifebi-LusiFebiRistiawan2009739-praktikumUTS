/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lusifebiristiawan_2009739.uts.soal1;

import java.util.Scanner;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class UTSSoal1 {

    public static void main(String[] args) {
        String input;
        String temp = "";
               
        System.out.println("Masukan tida digit angka: ");        
        Scanner data = new Scanner(System.in);      
        input = data.nextLine();
        
        int n = input.length();
        for(int i = n-1; i >= 0; i--){
            temp = temp + input.charAt(i);
        }
        
        if(input.equals(temp)){
            System.out.println(input + " adalah polindrom");
        }else{
            System.out.println(input + " bukan polindrom");
        }

    }
}
