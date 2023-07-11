/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uas;

/**
 *
 * @author C-7
 */
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
