/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rsst.pertemuan4;
import java.util.Scanner;
/**
 *
 * @author C-16
 */
public class kuis {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Masukkan angka pertama untuk ditambahkan");
    int var1 = input.nextInt();
    System.out.println("Masukkan angka kedua untuk ditambahkan");
    int var2 = input.nextInt();
    int var3 = var1 + var2;
    System.out.println("Variabel 1 + Variabel 2 = " + var3);
    
    System.out.println("Dikerjakan oleh Restu Andra Ahmad Saeroji, NIM 22201170");
    }
    
}