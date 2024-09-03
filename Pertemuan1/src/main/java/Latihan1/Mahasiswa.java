/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;

/**
 *
 * @author Irzi Rhmtllh
 */

public class Mahasiswa {
    String _name1, _name2;

    void membaca() {
        System.out.println(_name1 + "Membaca buku");
    };

    void mencontek() {
        System.out.println(_name1 + " Mencontek ke " + _name2);
    };

    void modifikasi(String name1, String name2 ) {
        this._name1 = name1;
        this._name2 = name2;
    };
};


