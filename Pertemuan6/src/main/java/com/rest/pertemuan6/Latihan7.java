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
 * @author rest
 */

//Latihan 7 - Restu Andra Ahmad Saeroji (22201170)
public class Latihan7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tuliskan pesan disini, akan saya tampilkan berulang - ulang.");
        System.out.println("Pesan: ");
        String pesan = input.nextLine();

        Random mesinRandom = new Random();
        int jumlahPengulangan = 1 + mesinRandom.nextInt(20);

        if (jumlahPengulangan < 10) {
            System.out.println("Pesan akan diulang sebanyak: " + jumlahPengulangan + " kali");

            for (int n = 0; n < jumlahPengulangan; n++) {
                System.out.println(n + ". " + pesan);
            }
        } else if (jumlahPengulangan > 10) {
            int jumlahPengulanganrev = jumlahPengulangan - 10;
            System.out.println("Bilangan random yang didapat terlalu besar");
            System.out.println("Pesan akan diulang " + jumlahPengulanganrev + " kali");

            for (int n = 0; n < jumlahPengulanganrev; n++) {
                System.out.println(n + ". " + pesan);
            }
        }

    }
}
