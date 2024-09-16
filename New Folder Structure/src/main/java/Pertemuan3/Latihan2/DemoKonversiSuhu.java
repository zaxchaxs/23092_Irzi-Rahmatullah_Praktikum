/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3.Latihan2;

/**
 *
 * @author Irzi Rhmtllh
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KonversiSuhu2 tempratureConvert = new KonversiSuhu2();
        
        double resultCelToFahren = tempratureConvert.celciusToFahrenheit(15);
        System.out.println("15 Celcius to Fahrenheit = " + resultCelToFahren);
        
        double resultCelToReamur = tempratureConvert.celciusToReamur(15);
        System.out.println("15 Celcius to Reamur = " + resultCelToReamur);
        
        double resultFahrenToReamur = tempratureConvert.fahrenheitToReamur(45);
        System.out.println("45 Fahrenheit to Reamur = " + resultFahrenToReamur);

    }
    
}
