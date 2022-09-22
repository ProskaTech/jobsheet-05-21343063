/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js_5;
import javax.swing.JOptionPane;
/**
 *
 * created by 21343063_Nurul Husna
 */
public class tugas_2 {
    public static void main(String[]args){
        String w1 = "", w2="", w3="";
        
        w1 = JOptionPane.showInputDialog("Enter word 1 ");
        w2 = JOptionPane.showInputDialog("Enter word 2 ");
        w3 = JOptionPane.showInputDialog("Enter word 3 ");
        
        String msg = w1 +" "+w2+" "+w3;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(w1 +" "+w2+" "+w3);
    }
}
