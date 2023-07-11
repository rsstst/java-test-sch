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
class keuangan {
    private int modal;
    private int keuntungan;
    
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
