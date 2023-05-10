/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.pertemuan6;
import java.util.Scanner;

/**
 *
 * @author rest
 */
public class Array {
    public static void main(String[] args) {
        //Latihan48();
        Latihan49();
    }
    
    //Latihan 48 - Restu Andra Ahmad Saeroji (22201170)
    static void Latihan48(){
        String[ ] namaPlanet = { "Merkurius", "Venus", "Bumi", "Mars",
                                "Jupiter", "Saturnus", "Uranus", "Neptunus"};
        for ( String p : namaPlanet) {
            System.out.println(p + "\t" + p.toUpperCase());
        }

        System.out.println("\n");

        String [] namaHewan = { "Kucing", "Kambing", "Kerbau", "Ular", "Komodo"};

        for ( String h : namaHewan) {
            System.out.println(h + "\t" + h.toUpperCase());
        }
    }

    //Latihan 49 - Restu Andra Ahmad Saeroji (22201170)
    static void Latihan49(){
        try (Scanner input = new Scanner(System.in)) {
            int [] nomorOrder = {123123,431414,542637,1231236,86575,1234};
            int dicari;

            System.out.println("Sekarang ada" + nomorOrder.length + "order di database");
            System.out.println("Order: ");
            for (int num : nomorOrder) {
                System.out.println(num + " ");
            }

            System.out.println("Order manakah yang ingin dilihat?");
            dicari = input.nextInt();

            for (int num : nomorOrder){
                if (num == dicari){
                    System.out.println("Order " + num + " ditemukan");
                }
                else {
                    System.out.println("Order tidak ditemukan");
                    break;
                }
            }
        }
    }
}
