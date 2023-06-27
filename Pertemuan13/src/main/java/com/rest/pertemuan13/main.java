/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.pertemuan13;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author C-18
 */
public class main extends JFrame {
    
    
    public main(){
        super("Test");
        JLabel label = new JLabel("Test");
        
        getContentPane().add(label);
        
        setSize(300,200);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        main gui = new main();
    }
}    