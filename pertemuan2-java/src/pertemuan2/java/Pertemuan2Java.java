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
        
        Scanner inp = new Scanner(System.in); //main inp scanner func
            
            System.out.println("nilaiA = " + nilaiA);
            System.out.println("nilaiB = " + nilaiB);
            System.out.println("nilai pi = " + pi);
            System.out.println("nilai eksponen = " + eksponen);
            System.out.println("boolean berupa " + isPlus);
            System.out.println("Masukkan nilaiA baru");
            nilaiA = inp.nextInt();
            System.out.println("Nilai A sekarang adalah " + nilaiA);
            System.out.println("Rubah angka pi dengan angka yang tidak masuk akal");
            pi = inp.nextDouble();
            System.out.println("Sekarang nilainya bukan pi, melainkan " + pi);
        }
         
    }
    
}
