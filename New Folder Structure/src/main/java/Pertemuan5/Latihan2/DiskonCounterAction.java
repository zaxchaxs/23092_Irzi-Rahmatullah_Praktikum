/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan5.Latihan2;
import java.util.Scanner;

/**
 *
 * @author Irzi Rhmtllh
 */
public class DiskonCounterAction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double besarPotongan;
        System.out.print("Total Pembelian: ");
        double totalPembelian = input.nextInt();
        
        if(totalPembelian >= 50000) {
            besarPotongan = 0.2 * totalPembelian;
        } else {
            besarPotongan = 0.05 * totalPembelian;
        };
        
        System.out.println("Besarnya Potongan: " + besarPotongan);
        System.out.println("Jumlah yang harus dibayarkan: " + (totalPembelian - besarPotongan));
        
    }
    
}
