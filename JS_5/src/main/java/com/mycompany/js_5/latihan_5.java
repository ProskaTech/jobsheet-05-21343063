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
public class latihan_5 {
    public static void main (String[] args){
        String name ="", hoby="";
        
        name = JOptionPane.showInputDialog("Nama Anda   ");
        hoby = JOptionPane.showInputDialog("Hobi Anda   ");
        
        String msg = "Jadi Hobi Anda "+hoby+". "+"Hobi yang bagus "+name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi Hobi Anda "+hoby+". "+"Hobi yang bagus "+name);
    }
}
