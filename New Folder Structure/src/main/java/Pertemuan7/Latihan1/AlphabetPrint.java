/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7.Latihan1;

/**
 *
 * @author Irzi Rhmtllh
 */
public class AlphabetPrint {
    
      public void printZtoA() {
          char alphabet = 'Z';
          System.out.println("\nAlphabet dari Z - A :");
          do {
              System.out.print(alphabet + " ");
              alphabet--;
              
          } while (alphabet >= 'A');
      };
}
