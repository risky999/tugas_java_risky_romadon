/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class contohJoptionPane {
    public static void main(String[] args) {
        String pertanyaaan1 = "Siapa nama Anda?";
        String nama = JOptionPane.showInputDialog(pertanyaaan1);
        
        String pertanyaaan2 = "Dimana Alamat Anda?";
        String alamat = JOptionPane.showInputDialog(pertanyaaan2);
        
        String pertanyaaan3 = "berapa umur  Anda?";
        String umur = JOptionPane.showInputDialog(pertanyaaan3);

        
        System.out.println("Data Anda sebagai berikut:");
        System.out.println("Nama " + nama);        
        System.out.println("Alamat " + alamat);        
        System.out.println("umur " + umur);


        
    }
    
}
