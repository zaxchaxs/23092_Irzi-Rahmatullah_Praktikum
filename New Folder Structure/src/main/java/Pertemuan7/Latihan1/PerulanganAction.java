/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7.Latihan1;

/**
 *
 * @author Irzi Rhmtllh
 */
public class PerulanganAction {
    public static void main(String[] args) {
        
        // a) & b)
        PrimeNumberCheck bilPrima = new PrimeNumberCheck(0, 20);
        bilPrima.cekPrima();
        bilPrima.cekNotPrima();
        
        // c)
        AlphabetPrint alphabet = new AlphabetPrint();
        alphabet.printZtoA();
        
        // d)
        PrintLaguAnakAyam laguAnakAyam = new PrintLaguAnakAyam();
        laguAnakAyam.printLaguAnakAyam(5);
        
    };
}
