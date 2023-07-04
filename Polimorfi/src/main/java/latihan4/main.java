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
        
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("5");
        
        System.out.println("Array list memiliki ukuran: " + arr.size());
        System.out.println("Isinya saat ini " + arr);
        showList(arr);
        
        arr.add(3, "3a");
        showList(arr);

        int i = arr.indexOf("1");
        System.out.println(arr.get(i) + " terdapat di slot " + i);
        arr.remove(1);
        showList(arr);

        arr.add(1, "8");
        showList(arr);

        arr.remove(5);
        arr.remove(4);
        arr.remove(2);
        arr.remove(0);
        showList(arr);

        i = arr.indexOf("8");
        String removed = arr.remove(i);
        arr.add(i, removed);
        showList(arr);

        System.out.println("Isi array saat ini " + arr);

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
        int leftSide = totalSpaces / 2;
        int rightSide = totalSpaces - leftSide;
        String out = "";
        for (int i = 0; i<leftSide; i++)
            out += " ";
        out += s;
        for (int i = 0; i<rightSide; i++)
            out += " ";
        return out;
    }
}
