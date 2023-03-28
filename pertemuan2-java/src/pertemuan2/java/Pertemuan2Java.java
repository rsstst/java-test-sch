/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2.java;

import java.util.Scanner;
/**
 *
 * @author C-5
 */
public class Pertemuan2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;
        
        double pi = 3.14;
        double eksponen = 2.71;
        
        boolean isPlus = true;
        
        Scanner input_pertama = new Scanner(System.in);
        
        System.out.println(nilaiA);
        System.out.println(nilaiB);
        System.out.println(pi);
        System.out.println(eksponen);
        System.out.println(isPlus);
        System.out.println("Silakan ketik apa yang kamu inginkan di blank space bawah ini");
        String inp = input_pertama.nextLine();
        System.out.println("Yang kamu ketik adalah " + inp);
         
    }
    
}
