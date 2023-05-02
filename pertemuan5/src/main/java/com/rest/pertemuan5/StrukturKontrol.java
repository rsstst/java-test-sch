/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.pertemuan5;
import java.util.Scanner;
/**
 *
 * @author C-7
 */
public class StrukturKontrol {
//public class AgeMessages {
    public static void main(String[] args) {    
        Scanner keyboard = new Scanner(System.in);

        int age;
        System.out.println("Berapa usia kamu?");
        age = keyboard.nextInt();
        System.out.println("Kamu sekarang ");

        if (age < 13){
            System.out.println("\tterlalu muda untuk membuat akun Facebook");
        }
        if (age < 16) {
            System.out.println("\tterlalu muda untuk membuat surat izin mengemudi");
        }
        if (age <= 18) {
            System.out.println("\tterlalu muda untuk menikahi seseorang");
        }
        if (age < 35) {
            System.out.println("\tTerlalu muda untuk menjadi presiden RI");
            System.out.println("\t\tSangat menyedihkan!");
        }

        if (age >= 50) {
            System.out.println("\tsudah setengah baya, hati - hati dengan kulineran.");
        }

        /*
        1. Tulis dan jalankan kode di atas, coba dengan mengubah-ubah nilai input untuk memahami
        kode
        2. Tambahkan kondisi, jika umur lebih atau sama dengan 50, untuk menampilkan pernyataan:
        "Anda sudah setengah baya, hati-hati dengan kulineran". Buat screenshot kode dan output
        lalu upload di form.
        */
    
        //Restu Andra Ahmad Saeroji - 22201170
    }
}
