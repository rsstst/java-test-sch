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
public class PerbandinganNilai {
    public static void main(String[] args) {
        int variabel1 = inputNilaiInteger("variabel 1");
        int variabel2 = inputNilaiInteger("variabel 2");
        int variabel3 = inputNilaiInteger("variabel 3");
        if (variabel1 < variabel2) {
            System.out.println("Variabel 1 : " + variabel1 + " kurang dari variabel 2 yang bernilai " + variabel2);
        }
        if ((variabel1 < variabel2) && (variabel1 < variabel3)) {
            System.out.println("Variabel 1 : " + variabel1 + " kurang dari variabel 2 yang bernilai " + variabel2 + " dan kurang dari variabel 3 yang bernilai: " + variabel3);
        }
        if (variabel1 <= variabel2 || variabel1>= variabel3) {
            System.out.println("Variabel 1 nilainya tidak berada di antara variabel 2 dan variabel 3");
        }
    }
    static int inputNilaiInteger(String namaVariabel){
        Scanner inputScanner = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Silakan input nilai untuk " + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput;
            }
    
    //Restu Andra Ahmad Saeroji - 2201170
}
