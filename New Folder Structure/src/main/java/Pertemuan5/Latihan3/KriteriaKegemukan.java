/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5.Latihan3;
import java.util.Scanner;

/**
 *
 * @author Irzi Rhmtllh
 */
public class KriteriaKegemukan {
    double imt, tinggiBadan, beratBadan;
    Scanner input = new Scanner (System.in);
    
    
    protected KriteriaKegemukan() {
        System.out.print("Masukkan berat badan (kg): ");
        beratBadan = input.nextDouble();
        
        System.out.print("Masukkan tinggi badan (m): ");
        tinggiBadan = input.nextDouble();
    };
    
    protected void tampilkanKriteriaBadan() {
        imt = beratBadan / (tinggiBadan * tinggiBadan);
        String kriteria;
        
        if(imt >= 40) {
            kriteria = "Sangat Gemuk";
        } else if(imt >= 30) {
            kriteria = "Gemuk";
        } else if(imt >= 25) {
            kriteria = "Berat badan lebih";
        } else if(imt >= 18.5) {
            kriteria = "Berat badan ideal";
        } else {
            kriteria = "Berat badan kurang";
        };
        
        System.out.println("");
        System.out.println("Nilai IMT: " + imt);
        System.out.println("Kriteria: " + kriteria);
    }
}
