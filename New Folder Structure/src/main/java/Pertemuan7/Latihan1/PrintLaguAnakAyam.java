/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7.Latihan1;

/**
 *
 * @author Irzi Rhmtllh
 */
public class PrintLaguAnakAyam {
    public void printLaguAnakAyam(int jumlahAyam) {
       int jumlah = jumlahAyam;
        
       System.out.println("\n");
       while(jumlah != 0) {
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turunlah berkotek");
        System.out.println("Anak ayam turunlah " + jumlah);
        if(jumlah == 1) {
            System.out.println("Mati satu tinggalah induknya");
            --jumlah;
        } else {
            System.out.println("Mati satu tinggalah " + --jumlah);
        }
        System.out.println();
       };
    };
}
