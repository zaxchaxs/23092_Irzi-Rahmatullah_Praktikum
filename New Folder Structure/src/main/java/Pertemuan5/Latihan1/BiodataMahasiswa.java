/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5.Latihan1;
import java.util.Scanner;
/**
 *
 * @author Irzi Rhmtllh
 */
public class BiodataMahasiswa {
    String npm, nama;
    double nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS;
    Scanner input = new Scanner(System.in);
    
    BiodataMahasiswa() {
        inputNilai();
    };
    
    protected void inputNilai() {
        System.out.print("NPM: ");
        npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa: ");
        nama = input.nextLine();
        
        System.out.print("Nilai Kehadiran: ");
        nilaiKehadiran = input.nextDouble();
        
        System.out.print("Nilai Tugas: ");
        nilaiTugas = input.nextDouble();
        
        System.out.print("Nilai UTS: ");
        nilaiUTS = input.nextDouble();
        
        System.out.print("Nilai UAS: ");
        nilaiUAS = input.nextDouble();
    };
    
    protected void showMahasiswaData() {
        System.out.println("");
        System.out.println("Data Mahasiswa");
        System.out.println("NPM Mahasiswa: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        
        NilaiMahasiswa nilaiMhs = new NilaiMahasiswa(nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
        System.out.println("Nilai Akhir: " + nilaiMhs.nilaiAkhir);
        System.out.println("Grade: " + nilaiMhs.grade);
        System.out.println("Keterangan: " + nilaiMhs.keterangan);
    }
}

class NilaiMahasiswa {
    double nilaiAkhir;
    char grade;
    String keterangan;
    
    NilaiMahasiswa(double nilaiAbsen, double nilaiTugas, double nilaiUTS,  double nilaiUAS) {
        nilaiAkhir = (0.1 * nilaiAbsen) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        
        if(nilaiAkhir > 75) {
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if(nilaiAkhir > 65) {
            grade = 'B';
            keterangan = "BAIK";
        } else if(nilaiAkhir > 55) {
            grade = 'C';
            keterangan = "KURANG";
        } else {
            grade = 'D';
            keterangan = "KURANG SEKALI";
        }
    };
};
