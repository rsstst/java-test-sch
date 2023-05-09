/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.pertemuan6;

/**
 *
 * @author C-7
 */
public class Array {
    public static void main(String[] args) {
        Latihan48();
    }
    
    static void Latihan48(){
        String[ ] namaPlanet = { "Merkurius", "Venus", "Bumi", "Mars",
                                "Jupiter", "Saturnus", "Uranus", "Neptunus"};
        for ( String p : namaPlanet) {
            System.out.println(p + "\t" + p.toUpperCase());
        }
    }
}
