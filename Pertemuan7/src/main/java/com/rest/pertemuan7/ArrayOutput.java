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

        PrintWriter file = new PrintWriter("teks.txt");
        file.println("Nama saya Restu Andra");
        file.println("NIM saya 22201170");
        file.println("Umur : 19");
        file.println("Tinggi badan : 167");
        file.println("Berat badan : tidak tahu");
        file.println("");
        for (int num : arr) {
            file.println(num);
        }
        file.println("");
        for (String str : nama) {
            file.println(str);
        }
        file.close();

        for (int num : arr) {
            System.out.println(num + " ");
        }

        for (String str : nama) {
            System.out.println(str + " ");
        }

    }
}
