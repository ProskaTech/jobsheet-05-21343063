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
public class latihan_3 {
    public static void main(String[]args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        String name = "", hoby = "";
        try{
            System.out.print("Nama Anda ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda");
            hoby = dataIn.readLine();
        }
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
        System.out.println("Jadi Hobi Anda "+hoby+". Hobi yang bagus "+name);
    }
}
