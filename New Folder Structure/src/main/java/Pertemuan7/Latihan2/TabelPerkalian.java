/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7.Latihan2;

/**
 *
 * @author Irzi Rhmtllh
 */
public class TabelPerkalian {
    
    public void printTabelPerkalian(int a, int b) {
        System.out.println("Tabel Perkalian dari " + a + " sampai " + b);
        for(int i = 1; i <= b; i++) {
            for(int j = 1; j <= a; j++) {
                System.out.print(j*i + "  ");
            };
            System.out.println("  ");
        }
    }
}
