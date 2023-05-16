/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.pertemuan7;

import java.io.PrintWriter;

/**
 *
 * @author restu
 */
//Nomor 3 - Restu Andra Ahmad Saeroji - 22201170
public class ArrayOutput {

    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] nama = {"Kevin", "Dimas", "Kholid", "Tamalla", "Bintang"};

        PrintWriter fileout = new PrintWriter("teks.txt");
        fileout.println("Nama saya Restu Andra");
        fileout.println("NIM saya 22201170");
        fileout.println("Umur : 19");
        fileout.println("Tinggi badan : 167");
        fileout.println("Berat badan : tidak tahu");
        fileout.println("");
        for (int num : arr) {
            fileout.println(num);
        }
        fileout.println("");
        for (String str : nama) {
            fileout.println(str);
        }
        fileout.close();

        for (int num : arr) {
            System.out.println(num + " ");
        }

        for (String str : nama) {
            System.out.println(str + " ");
        }

    }
}
