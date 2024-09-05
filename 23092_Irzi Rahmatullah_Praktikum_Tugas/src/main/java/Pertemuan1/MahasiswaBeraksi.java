/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author Irzi Rhmtllh
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa myMahasiswa = new Mahasiswa();
        myMahasiswa._name1 = "Reizidan";
        myMahasiswa._name2 = "Bayu";

        myMahasiswa.membaca();
        myMahasiswa.mencontek();
        
        myMahasiswa.modifikasi("Haikal", "Fazri");
        System.out.println("");
        
        myMahasiswa.membaca();
        myMahasiswa.mencontek();
    }
};
