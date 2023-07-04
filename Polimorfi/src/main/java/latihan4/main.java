/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;
import java.util.ArrayList;

/**
 *
 * @author C-17
 */
public class main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        
        System.out.println("Array list memiliki ukuran: " + arr.size());
        
        arr.add("");
        arr.add("");
        arr.add("");
        arr.add("");
        arr.add("");
        
        System.out.println("Array list memiliki ukuran: " + arr.size());
        System.out.println("Isinya saat ini " + arr);
        showList(arr);
        
        arr.add(3, "");
        showList(arr);
    }
    
    
    public static void showList( ArrayList<String> a){
        System.out.println("size() sekarang adalah " + a.size());
        for (int i = 0; i < a.size(); i++ ) {
            int len = a.get(i).length() + 4;
            System.out.println("|" + centerPad(""+i, len));
        }
        
        System.out.println("|");
        for (String s : a)
            System.out.println("| \"" + s + "\" ");
        System.out.println("|\n");
    }
    
    public static String centerPad(String s, int width){
        int totalSpaces = width - s.length();
    }
}
