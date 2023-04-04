/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rsst.pertemuan3;
import java.util.Scanner;
/**
 *
 * @author C-7
 */
public class tipedata {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        //Numerik
        byte tipeByte = 10;
        short tipeShort = 10;
        int tipeInt = 10;
        long tipeLong = 10L;
        float tipeFloat = 3.14f;
        double tipeDouble = 2.771;
        
        //Karakter
        char tipeChar = 'D';
        
        //Boolean
        boolean tipeBoolean = true;
        
        
        System.out.println("Tipe Data Numerik");
        System.out.println("Byte: " + tipeByte);
        System.out.println("Short: " + tipeShort);
        System.out.println("Int: " + tipeInt);
        System.out.println("Long: " + tipeLong);
        System.out.println("Float: " + tipeFloat);
        System.out.println("Double: " + tipeDouble);
        System.out.println("\nTipe Data Karakter");
        System.out.println("Char: " + tipeChar);
        System.out.println("\nTipe Data Boolean");
        System.out.println("Boolean: " + tipeBoolean);
        
        System.out.println("\nMasukkan nilai untuk variabel a (byte): ");
        tipeByte = input.nextByte();
        System.out.println("Masukkan nilai untuk variabel b (short): ");
        tipeShort = input.nextShort();
        System.out.println("Masukkan nilai untuk variabel c (int): ");
        tipeInt = input.nextInt();
        System.out.println("Masukkan nilai untuk variabel d (long): ");
        tipeLong = input.nextLong();
        System.out.println("Masukkan nilai untuk variabel e (float): ");
        tipeFloat = input.nextFloat();
        System.out.println("Masukkan nilai untuk variabel f (double): ");
        tipeDouble = input.nextDouble();
        System.out.println("Masukkan nilai untuk variabel g (char): ");
        tipeChar = input.next().charAt(0);
        System.out.println("Masukkan nilai untuk variabel h (boolean): ");
        tipeBoolean = input.nextBoolean();
        
        System.out.println("Data baru sesuai dengan yang di-inputkan");
        System.out.println("Tipe Data Numerik");
        System.out.println("Byte: " + tipeByte);
        System.out.println("Short: " + tipeShort);
        System.out.println("Int: " + tipeInt);
        System.out.println("Long: " + tipeLong);
        System.out.println("Float: " + tipeFloat);
        System.out.println("Double: " + tipeDouble);
        System.out.println("\nTipe Data Karakter");
        System.out.println("Char: " + tipeChar);
        System.out.println("\nTipe Data Boolean");
        System.out.println("Boolean: " + tipeBoolean);
    }
}
