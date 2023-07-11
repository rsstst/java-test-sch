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
    private String nama;
    private String penulis;
    private String penerbit;
    private int stok;
    private int tahun_terbit;
    
    //Constructur
    public buku(String nama, String penulis, String penerbit, int stok, int tahun_terbit){
        this.nama = nama;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.stok = stok;
        this.tahun_terbit = tahun_terbit;
    }
    
    //Getter Setter
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getPenulis(){
        return penulis;
    }
    
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    
    public String getPenerbit(){
        return penerbit;
    }
    
    public void setPenerbit(){
        this.penerbit = penerbit;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    
    public int getTahunTerbit(){
        return tahun_terbit;
    }
    
    public void setTahunTerbit(int tahun_terbit){
        this.tahun_terbit = tahun_terbit;
    }
}

//Class yang mengurus keuangan
class keuangan {
    private int modal;
    private int keuntungan;
    
    //Constructor
    public keuangan(int modal, int keuntungan){
        this.modal = modal;
        this.keuntungan = keuntungan;
    }
    
    //Getter Setter
    public int getModal(){
        return modal;
    }
    
    public void setModal(int modal){
        this.modal = modal;
    }
    
    public int getKeuntungan(){
        return keuntungan;
    }
    
    public void setKeuntungan(int modal){
        this.keuntungan = keuntungan;
    }
}

//Fungsi utama
public class main {
    private int stok_buku;
    
    public void cekBuku(){
        System.out.println();
    }
    
    public void beliBuku(){
        Scanner scanner = new Scanner(System.in);
        if (stok_buku > 0){
            System.out.println("Buku apa yang ingin dibeli?");
            String bukuBeli = scanner.nextLine();
            stok_buku++;
        } else{
            System.out.println("Mohon maaf, stok buku kosong.");
        }
        
    }
    
    public void jualBuku(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buku apa yang ingin dijual?");
        String bukuJual = scanner.nextLine();
        System.out.println("Berapa harganya?");
        int hargaBukuJual = scanner.nextInt();
    }
    
    
}
