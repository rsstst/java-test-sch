/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

import barang.Mobil;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author budi
 */
public class Main {
    public static void main(String[] args) {
        PenjualanMobil penjualanMobil = new PenjualanMobil();

        // Tambah mobil ke dalam daftar
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2021, 150000000);
        penjualanMobil.beliMobil(mobil1);

        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, 200000000);
        penjualanMobil.beliMobil(mobil2);
        
        System.out.printf("Modal kamu sekarang " + "%,.2f", penjualanMobil.modal);
        System.out.println();
        System.out.printf("Nilai aset kamu sekarang " + "%,.2f", penjualanMobil.nilaiAsset);
        System.out.println();

        // Cari mobil berdasarkan merek
        List<Mobil> hasilPencarian = penjualanMobil
            .cariMobilBerdasarkanMerek("Toyota");
        for (Mobil mobil : hasilPencarian) {
            System.out.println("Merek: "+  mobil.getMerek() + "\nModel:  " 
                + mobil.getModel());
        }

        // Hapus mobil dari daftar
        penjualanMobil.jualMobil(mobil2, 210000000);
        
        System.out.println("Ada mobil yang dijual dan sekarang");
        System.out.printf("Modal kamu sekarang " + "%,.2f", penjualanMobil.modal);
        System.out.println();
        System.out.printf("Nilai aset kamu sekarang " + "%,.2f", penjualanMobil.nilaiAsset);
        System.out.println();

        
    }
}