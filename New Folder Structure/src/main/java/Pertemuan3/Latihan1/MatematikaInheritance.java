/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3.Latihan1;

/**
 *
 * @author Irzi Rhmtllh
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika2 myMtk = new Matematika2();
        
        // dari class Matematika
        int resultPertambahan = myMtk.pertambahan(10, 20);
        System.out.println("Pertambahan 10 + 20 = " + resultPertambahan);
        
        // dari class Matematika
        int resultPengurangan = myMtk.pengurangan(20, 10);
        System.out.println("Pengurangan 20 + 10 = " + resultPengurangan);
        
        // dari class Matematika
        int resultPerkalian = myMtk.perkalian(5, 5);
        System.out.println("Perkalian 5 * 5 = " + resultPerkalian);
        
        // dari class Matematika
        double resultPembagian = myMtk.pembagian(21, 3);
        System.out.println("Pembagian 21 / 3 = " + resultPembagian);
        
        // dari class Matematika2
        int resultModulus = myMtk.modulus(54, 10);
        System.out.println("Modulus 54 % 10 = " + resultModulus);
    }
}
