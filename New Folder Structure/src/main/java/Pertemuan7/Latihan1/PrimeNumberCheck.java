/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7.Latihan1;

/**
 *
 * @author Irzi Rhmtllh
 */
public class PrimeNumberCheck {
    private int start, end;
    
    public PrimeNumberCheck(int start, int end) {
        this.start = start;
        this.end = end;
    };
    
    
    public void cekNotPrima() {
        System.out.println("Bilangan bukan prima dari " + start + " - " + end);
    
        for (int i = start; i <= end; i++) {
            boolean isPrima = true;

            if (i < 2) {
                isPrima = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrima = false;
                        break;
                    }
                }
            }
            if (!isPrima) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }    
    
    public void cekPrima() {
        System.out.println("Bilangan prima dari " + start + " - " + end);

          for(int i = start; i <= end; i++) {
            boolean isPrima = true;

            if(i < 2) continue;

            for(int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrima = false;
                    break;
                }
            };

            if(isPrima) System.out.print(i + " ");
          };
          System.out.println();
    };    
}
