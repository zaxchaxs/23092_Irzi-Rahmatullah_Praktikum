/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan8;

import java.util.Scanner;

/**
 *
 * @author Irzi Rhmtllh
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Barang[] arrayBarang = {
            new Barang("a001", "Buku", 3000),
            new Barang("a002", "Pensil", 4000),
            new Barang("a003", "Pulpen", 5000)
        };
        
        printMenu(input, arrayBarang);
        
    };
    
    public static void printMenu(Scanner input, Barang[] listBarang) {
        int jumlahItem;
        
        System.out.println("TOKO SERBA ADA");
        System.out.println("***************");
        System.out.print("Masukkan jumlah item barang\t: ");
        jumlahItem = input.nextInt();
        
        ChoisedBarang[] barangTerpilih = new ChoisedBarang[jumlahItem];
        
        for(int i = 0; i < jumlahItem; i++) {
            String kodeBarang;
            int jumlahDibeli;
            
            System.out.println("Data ke " + (i+1));
            System.out.print("Masukkan kode barang\t\t: ");
            kodeBarang = input.next();
            System.out.print("Masukkan jumlah dibeli\t\t: ");
            jumlahDibeli = input.nextInt();
            barangTerpilih[i] = new ChoisedBarang(kodeBarang, jumlahDibeli);
        };
        
        printChoisedBarang(barangTerpilih, listBarang);
    };
    
    public static void printChoisedBarang(ChoisedBarang[] barangTerpilih, Barang[] listBarang) {
        String[] headerColumn = {"No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar"};
        int[] jumlahPembayaran = new int[barangTerpilih.length];
        
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("***************");
        
        for(String headCol: headerColumn) {
            System.out.print(headCol + "\t");
        }
        System.out.println("");
        System.out.println("=============================================================================");
        
        for(int i = 0; i < barangTerpilih.length; i++) {
            System.out.print((i+1) + "\t    ");
            System.out.print(barangTerpilih[i].kodeBarang + "\t    ");

            // Nyari barang di list barang yang kodenya sesuai
            boolean isItemFounded = false;
            for(int k = 0; k < listBarang.length; k++) {
                if(listBarang[k].kodeBarang.equals(barangTerpilih[i].kodeBarang)) {
                    System.out.print(listBarang[k].namaBarang + " \t");
                    System.out.print(listBarang[k].hargaBarang + "\t    ");
                    System.out.print(barangTerpilih[i].jumlahDibeli + "\t\t");
                    System.out.print((barangTerpilih[i].jumlahDibeli * listBarang[k].hargaBarang));
                    jumlahPembayaran[i] = barangTerpilih[i].jumlahDibeli * listBarang[k].hargaBarang;
                    isItemFounded = true;
                    break;
                }    
            };
            if(!isItemFounded) {
                System.out.print("Not Found\t");
                System.out.print("  -\t    ");
                System.out.print(barangTerpilih[i].jumlahDibeli + "\t\t");
                System.out.print("-\t");
            };
            System.out.println("");
        };
                System.out.println("=============================================================================");
        int totalBayar = 0;
        for(int initial = 0; initial < jumlahPembayaran.length; initial++) {
            totalBayar = totalBayar+jumlahPembayaran[initial];
        };
        System.out.println("Total Bayar: \t\t" + totalBayar);
                System.out.println("=============================================================================");
    };
}
