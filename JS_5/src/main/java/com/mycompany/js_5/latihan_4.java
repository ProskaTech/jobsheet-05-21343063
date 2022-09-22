/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * created by 21343063_Nurul Husna
 */
public class latihan_4 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Masukkan angka pertama ");
        try{
             a = dataIn.readLine();
             angka1 = Float.parseFloat(a);
        
            System.out.print("Masukkan angka kedua ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);

            jumlah = angka1 + angka2;
            System.out.println("Jumlah "+jumlah);
        }
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
    }
}
