/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.pertemuan6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author C-7
 */
public class Latihan7 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tuliskan pesan disini, akan saya tampilkan berulang - ulang.");
        System.out.println("Pesan: ");
        String pesan = input.nextLine();
        
        Random mesinRandom = new Random();
        int jumlahPengulangan = 1 + mesinRandom.nextInt(10);
        
        System.out.println("Pesan akan diulang sebanyak: " + jumlahPengulangan + " kali\n");
        
        for (int n = 0; n < jumlahPengulangan; n++){
            System.out.println(n + ". " + pesan);
        }
    }
}
