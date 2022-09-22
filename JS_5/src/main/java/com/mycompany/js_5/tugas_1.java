/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * created by 21343063_Nurul Husna
 */
public class tugas_1 {
    public static void main(String[]args){
        String a,c;
        String b = "";
        Scanner dMasuk = new Scanner(System.in);
        BufferedReader bMasuk = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("Enter word1 ");
        a = dMasuk.nextLine();
        
        try {
        System.out.println("Enter word2 ");
        b = bMasuk.readLine();
        
        }
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
        System.out.println("Enter word3 ");
        c = dMasuk.nextLine();
        
        System.out.println(a+" "+b+" "+ c);
    }
}
