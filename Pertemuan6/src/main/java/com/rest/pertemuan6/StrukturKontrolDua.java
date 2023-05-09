/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.pertemuan6;
import java.util.Scanner;
/**
 *
 * @author C-7
 */
public class StrukturKontrolDua {
    public static void main(String[] args){
        //PerbandinganNilai();
        //ElseandIf();
        latihan_switch();
    }
    
    //Latihan 2
    static void PerbandinganNilai() {
    int variabel1 = inputNilaiInteger("Variabel 1");
    int batasBawah = inputNilaiInteger("Batas bawah");
    int batasAtas = inputNilaiInteger("Batas atas");
    if (variabel1 < batasBawah) {
            System.out.println("Variabel1 = "+ variabel1 + " kurang dari batas bawah yang bernilai "+ batasBawah );
        }
    if ((variabel1 < batasBawah) && (variabel1 < batasAtas)) {
            System.out.println("Variabel1 = "+ variabel1 + " kurang dari batas bawah yang bernilai "+ batasBawah +  " dan kurang dari batas atas juga yang bernilai: " + batasAtas);
        }
    if (variabel1 <= batasBawah || variabel1 >= batasAtas) {
            System.out.println("Variabel 1 nilainya tidak berada di antara batas bawah dan batas atas");
        }   
    }
    
    //inputNilaiInteger
    static int inputNilaiInteger (String namaVariabel) {
        Scanner input = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Silakan input nilai untuk variabel " + namaVariabel);
        nilaiInput = input.nextInt();
        return nilaiInput;
    }
        
    //Latihan 3 - Restu Andra Ahmad Saeroji (22201170)
    static void ElseandIf(){
        int orang;
        int mobil;
        int bus;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah orang yang ada");
        orang = input.nextInt();
        System.out.println("Masukkan jumlah mobil yang tersedia");
        mobil = input.nextInt();
        System.out.println("Masukkan jumlah bus yang tersedia");
        bus = input.nextInt();
        
        //Mobil
        if (mobil > orang) {
            System.out.println("Kita ambil mobil");
        }
        else if (mobil < orang) {
            System.out.println("Kita seharusnya tidak mengambil mobil");
        }
        else {
            System.out.println("Kita tidak bisa menentukan");
        }
        
        //Bus
        if (bus > mobil) {
            System.out.println("Terlalu banyak bus");
        }
        else if (bus < mobil) {
            System.out.println("Mungkin kita bisa mengambil bus");
        }
        else {
            System.out.println("Kita masih belum bisa menentukan");
        }
        
        //Orang
        if (orang > bus) {
            System.out.println("Kita akan menggunakan bus");
        }
        else {
            System.out.println("Kita di rumah saja");
        }
    }
    //Latihan 4 - Restu Andra Ahmad Saeroji (22201170)
    static void latihan_switch(){
        int day;
        Scanner input = new Scanner(System.in);
        System.out.println("Silakan pilih 1 - 7 untuk melihat hari");
        day = input.nextInt();
        switch(day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Maaf, hari hanya ada 7");
        }
        do_while();
    }
    
    //Latihan 5 - Restu Andra Ahmad Saeroji (22201170)
    static void loop_while(){
        String confirm;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program telah berjalan, apakah ingin menjalankan program lagi? (y/n)");
        confirm = input.nextLine();
        
        while(true){
            switch(confirm) {
                case "y":
                    latihan_switch();
                case "Y":
                    latihan_switch();
                case "n":
                    System.exit(0); //Digunakan karena break hanya menghentikan fungsi loop_while, latihan_switch masih berjalan. 
                case "N":
                    System.exit(0);
            }
        }
    }
    
    //Latihan 6 - Restu Andra Ahmad Saeroji (22201170)
    static void do_while(){
        String confirm;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program telah berjalan, apakah ingin menjalankan program lagi? (y/n)");
        confirm = input.nextLine();
        do {
            switch(confirm){
                case "y":
                    latihan_switch();
                case "Y":
                    latihan_switch();
                case "n":
                    System.exit(0); //Digunakan karena break hanya menghentikan fungsi loop_while, latihan_switch masih berjalan. 
                case "N":
                    System.exit(0);
            }
        }
        while (true);
    }
}
