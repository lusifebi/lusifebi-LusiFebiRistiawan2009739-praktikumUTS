/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lusifebiristiawan_2009739.uts.soal2;

import java.util.Scanner;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class UTSSoal2 {

    public static void main(String[] args) {
        int N;
        int i;
        int j;
        int k;
 
        
        Scanner data = new Scanner(System.in);
        
        System.out.print("Masukkan N: ");        
        N = data.nextInt();
        System.out.println();
        
        System.out.println("Pattern A");
        for(i = 1; i<=N; i++){
            for(j = 1; j<=i; j++){
                System.out.print(j + "");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Pattern B");
        for(i = 1; i<=N; i++){
            for(j = i; j<=N; j++){
                System.out.print(j-(i-1) + "");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Pattern C");
        for(i = 1; i<=N; i++){
            for(j = N; j >= i; j--){
                System.out.print(" ");
            }
            for (k = i; k >= 1; k--){
                System.out.print(k + "");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Pattern D");
        for(i = 1; i<=N; i++){
            for(j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for (k = i; k <= N; k++){
                System.out.print(k-(i-1)+ "");
            }
            System.out.println();
        }
        System.out.println();
        
    }
}
