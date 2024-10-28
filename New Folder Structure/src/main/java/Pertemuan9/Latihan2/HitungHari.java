/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9.Latihan2;

import java.time.YearMonth;

/**
 *
 * @author Irzi Rhmtllh
 */
public class HitungHari {
    int tahun, bulan;
    int jumlahHari;
    
    public HitungHari(int tahun, int bulan) {
        this.tahun = tahun;
        this.bulan = bulan;
    };
    
    public String hitung() {
        YearMonth yearMonth = YearMonth.of(tahun, bulan);
        jumlahHari = yearMonth.lengthOfMonth();
        return jumlahHari + "";
    };
}
