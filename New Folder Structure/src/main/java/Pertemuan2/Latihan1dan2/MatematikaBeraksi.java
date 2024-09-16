/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2.Latihan1dan2;

/**
 *
 * @author Irzi Rhmtllh
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika myMtk = new Matematika();
        
        System.out.println("Pertambahan 20+10 : " + myMtk.pertambahan(20, 10));
        System.out.println("Pengurangan 10-5 : " + myMtk.pengurangan(10, 5));
        System.out.println("Perkalian 10*3 : " + myMtk.perkalian(10, 3));
        System.out.println("Pembagian 21/2 : " + myMtk.pembagian(21, 2));
    }
    
}
