/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.pertemuan8;

/**
 *
 * @author C-9
 */
public class Latihan2 {
    
    public static void main(String[] args){
        Mobil mobil1 = new Mobil("Merah", "Toyota", 250, 120000000);
        mobil1.getInfo();
        mobil1.maju();
    }
}

    class Mobil{
        String warna;
        String model;
        int kecepatan;
        int harga;
    
    public Mobil(String warna, String model, int kecepatan, int harga){
        this.warna = warna;
        this.model = model;
        this.kecepatan = kecepatan;
        this.harga = harga;
    }
    
    public void maju(){
        System.out.println("Mobil maju");
    }
    
    public void mundur(){
        System.out.println("Mobil mundur");
    }
    
    void getInfo(){
        System.out.println("Mobil ini berwarna " + this.warna);
        System.out.println("modelnya adalah " + this.model);
        System.out.println("Harganya adalah " + this.harga);
        System.out.println("Kecepatan tertinggi " + this.kecepatan);
    }
}