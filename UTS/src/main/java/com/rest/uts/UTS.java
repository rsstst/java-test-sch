/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.uts;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author C-17
 */

class datadiri {
    String nama;
    String umur;
    String nim;
    String tb;
    String alamat;
    }

public class UTS {
    public static void main(String[] args) throws Exception{
        int[] arr = {1,2,3,4,5,6,7,8,9,0}; //Array 10 nilai integer
        String[] nama = {"Dimas", "Kevin", "Kholid", "Rifki", "Davin"}; //String 5 nama
        datadiri restu;
        restu = new datadiri();
        
        //Record data diri
        restu.nama = "Restu Andra Ahmad Saeroji";
        restu.umur = "19";
        restu.nim = "22201170";
        restu.tb = "167";
        restu.alamat = "Banyuwangi";
        
        //output file
        PrintWriter file = new PrintWriter("output.txt");
        for (int num : arr){
            file.print(num + ", ");
        }
        file.println();
        for (String str : nama){
            file.print(str + ", ");
        }

        file.println();
        file.println("Nama : " + restu.nama);
        file.println("Umur : " + restu.umur);
        file.println("NIM : " + restu.nim);
        file.println("Tinggi badan : " + restu.tb);
        file.println("Alamat : " + restu.alamat);
        
        file.close();
        
        //membaca file
        Scanner reader = new Scanner(new File("output.txt"));
        
        while (reader.hasNextLine()){
            String text = reader.nextLine();
            System.out.println(text);
        }
        
        
        
    }
}
