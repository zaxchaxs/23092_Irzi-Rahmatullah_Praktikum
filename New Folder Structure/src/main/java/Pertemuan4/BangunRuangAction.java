/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Irzi Rhmtllh
 */
public class BangunRuangAction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Balok myBalok = new Balok(10, 7, 4);
        
        String luasPermukaanBalok = myBalok.getLuasPermukaanBalok();
        String volBalok = myBalok.getVolKubus();
        System.out.println("\n"+ luasPermukaanBalok);
        System.out.println(volBalok);
        
        
        Kubus myKubus = new Kubus(10);
        String luasPermukaanKubus = myKubus.getLuasPermukaanKubus();
        String volKubus = myKubus.getVolKubus();
        System.out.println("\n"+ luasPermukaanKubus);
        System.out.println(volKubus);
    }
    
}
