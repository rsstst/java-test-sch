/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author C-17
 */

class Overloading {
    public static void main (String[] args){
        System.out.println("Contoh demonstrasi metode overload");
        Addition add = new Addition();
        int sumInt = add.sum(10, 20);
        System.out.println("10 + 20 = " + sumInt);
        double sumDouble = add.sum(10.5, 11.5);
        System.out.println("10.5 + 11.5 = " + sumDouble);
        String sumString = add.sum("Oh", "yeah");
        System.out.println("'Oh' + 'yeah' is " + sumString);
    }
}