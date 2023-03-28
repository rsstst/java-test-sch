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
        
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("nilai pi = " + pi);
        System.out.println("nilai eksponen = " + eksponen);
        System.out.println("boolean berupa " + isPlus);
        System.out.println("Silakan ketik apapun di blank space bawah ini");
        String inp = input_pertama.nextLine();
        System.out.println("Yang kamu ketik adalah " + inp);
         
    }
    
}
