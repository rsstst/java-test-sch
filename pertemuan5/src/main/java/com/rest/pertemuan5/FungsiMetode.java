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
public class FungsiMetode {
//public class KelasUtama {
    public static void main(String[] args){
    int varInteger;
    sayHello();
    sayHelloTo("Budi");
    String namaMahasiswa = "George";
    sayHelloTo(namaMahasiswa);
    varInteger = inputNilaiInteger("var Integer");
    System.out.println("Nilai varInteger sekarang = " + varInteger);
    System.out.println("Fungsi hitung luas lingkaran");
    hitungLuasLingkaran();
    System.out.println("Fungsi selamat ulang tahun");
    selamatUlangTahun();
    }
    
    static void sayHello(){
        System.out.println("Halo, ini metode tipe void tanpa parameter");
    }
    
    static void sayHelloTo(String nama){
        System.out.println("Halo " + nama + ", ini metode void dengan parameter");
    }
    
    static int inputNilaiInteger(String namaVariabel){
        Scanner inputScanner = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Silakan input nilai untuk variabel " + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput;
    }
    /*
1. Apakah perintah import yang kita perlukan agar program bisa berjalan?
    Import java.util.Scanner
2. Apakah nama file yang harus kita berikan untuk file yang berisi kode tersebut?
    KelasUtama
*/



    
/*
Tambahkan metode hitungLuasLingkaran untuk menghitung luas lingkaran, apabila diketahui jari - jarinya. 
(Rumus luas lingkaran = 22/7 x jari-jari x jari-jari). Metode menerima parameter berupa nilai jari-jari, 
menampilkan teks "Luas lingkaran dengan jari-jari x adalah ...", 
x dan titik-titik diganti jari-jari dan luasnya. Metode memberikan nilai return luas
lingkaran bertipe double. Tampilkan nilai luas lingkaran ini pada program utama.
*/
    static void hitungLuasLingkaran(){
    int jarijari;
    double pi = (double)22/7;
    
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Silakan input nilai untuk jari - jari");
    jarijari = inputScanner.nextInt();
    System.out.println("Luas lingkaran dengan jari - jari " + jarijari + " adalah");
    double hasilDouble = pi * jarijari * jarijari;
    int hasilInt = (int) Math.round(hasilDouble);
    System.out.println("Hasil yang dibulatkan = " + hasilInt);
    System.out.println("Hasil yang tidak dibulatkan = " + hasilDouble);
    }
 
    
/*
Buat metode selamatUlangTahun yang menerima dua variabel String sebagai parameter
berupa nama depan dan nama belakang dan menggabungkannya menjadi satu variabel di
dalam kode metode. Pada metode tersebut, buat permintaan untuk menginputkan umur.
Nilai returnnya adalah teks " Saudara X berumur y, semoga panjang umur". X adalah nama
lengkap, dan y adalah umur yang dinputkan. Tampilkan nilai return pada program utama.
*/
    static void selamatUlangTahun(){
        String namaDepan;
        String namaBelakang;
        int umur;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Masukkan nama depan ");
        namaDepan = inputScanner.nextLine();
        System.out.println("Masukkan nama belakang");
        namaBelakang = inputScanner.nextLine();
        System.out.println("Masukkan umur");
        umur = inputScanner.nextInt();
        String nama = namaDepan + " " + namaBelakang;
        System.out.println("Saudara " + nama + " berumur " + umur + ", semoga panjang umur.");
    }
    
}