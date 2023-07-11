/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uas;

import java.util.Scanner;

/**
 *
 * @author C-7
 */

//Class yang mengurusi buku
class buku {

    private String judul;
    private int hargabeli;
    private int hargajual;
    private int stok;

    //Constructur
    public buku(String judul, int hargabeli, int hargajual, int stok) {
        this.judul = judul;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
        this.stok = stok;
    }

    //Getter Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public int getHargaBeli(){
        return hargabeli;
    }
    
    public void setHargaBeli(){
        this.hargabeli = hargabeli;
    }
    
    public int getHargaJual(){
        return hargajual;
    }
    
    public void setHargaJual(){
        this.hargajual = hargajual;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void setStok(){
        this.stok = stok;
    }
    
class bukuFiksi extends buku{
    private String jenisBuku;
    public bukuFiksi(String judul, int hargabeli, int hargajual, int stok, String jenisBuku){
        super(judul, hargabeli, hargajual, stok);
        this.jenisBuku = jenisBuku;
    }
    
    public String getJenisBuku(){
        return jenisBuku;
    }
    
    public void setJenisBuku(){
        this.jenisBuku = jenisBuku;
    }
    
    public void info(){
        System.out.println("Buku fiksi berjudul" + judul + "memiliki stok sebanyak " + stok);
    }
    
    public void info_lengkap(){
        System.out.println("Judul buku : " + judul);
        System.out.println("Jenis buku :" + jenisBuku);
        System.out.println("Harga jual : " + hargajual);
        System.out.println("Jumlah stok : " + stok);
    }
}

class bukuNonFiksi extends buku{
    private String jenisBuku;
    public bukuNonFiksi(String judul, int hargabeli, int hargajual, int stok, String jenisBuku){
        super(judul, hargabeli, hargajual, stok);
        this.jenisBuku = jenisBuku;
    }
    
    public String getJenisBuku(){
        return jenisBuku;
    }
    
    public void setJenisBuku(){
        this.jenisBuku = jenisBuku;
    }
    
        public void info(){
        System.out.println("Buku non-fiksi berjudul" + judul + "memiliki stok sebanyak " + stok);
    }
    
    public void info_lengkap(){
        System.out.println("Judul buku : " + judul);
        System.out.println("Jenis buku :" + jenisBuku);
        System.out.println("Harga jual : " + hargajual);
        System.out.println("Jumlah stok : " + stok);
    }
}
    
class majalah extends buku{
    private int nomorEdisi;
    public majalah(String judul, int hargabeli, int hargajual, int stok, int nomorEdisi){
        super(judul, hargabeli, hargajual, stok);
        this.nomorEdisi = nomorEdisi;
    }
    
    //Getter Setter
    public int getNomorEdisi(){
        return nomorEdisi;
    }
    
    public void setNomorEdisi(){
        this.nomorEdisi = nomorEdisi;
    }
    
    public void info(){
        System.out.println("Majalah berjudul" + judul + "memiliki stok sebanyak " + stok);
    }
    
    public void info_lengkap(){
        System.out.println("Judul majalah : " + judul);
        System.out.println("Harga jual : " + hargajual);
        System.out.println("Jumlah stok : " + stok);
        System.out.println("Nomor edisi : " + nomorEdisi);
    }
    
}

//Class yang mengurus keuangan
class keuangan {

    private int modal;
    private int keuntungan;

    //Constructor
    public keuangan(int modal, int keuntungan) {
        this.modal = modal;
        this.keuntungan = keuntungan;
    }

    //Getter Setter
    public int getModal() {
        return modal;
    }

    public void setModal(int modal) {
        this.modal = modal;
    }

    public int getKeuntungan() {
        return keuntungan;
    }

    public void setKeuntungan(int modal) {
        this.keuntungan = keuntungan;
    }
}

//Fungsi utama
public class main {

    private int stok_buku;

    public void beliBukuFiksi() {
        Scanner scanner = new Scanner(System.in);
        if (stok_buku > 0) {
            System.out.println("Buku apa yang ingin dibeli?");
            String judul = scanner.nextLine();
            System.out.println("Berapa harganya?");
            int hargabeli = scanner.nextInt();
            buku buku = new buku(judul, hargajual, hargabeli, stok);
            stok_buku++;
        } else {
            System.out.println("Mohon maaf, stok buku kosong.");
        }
    }

    public void jualBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buku apa yang ingin dijual?");
        String judul = scanner.nextLine();
        System.out.println("Berapa harganya?");
        int hargaBukuJual = scanner.nextInt();
    }

}
