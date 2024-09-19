/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Irzi Rhmtllh
 */
public class BangunRuangKubusBalok {
    private double luasPermukaanKubus, volumeKubus;
    private double luasPermukaanBalok, volumeBalok;
    
    // overload
    protected BangunRuangKubusBalok(double sisi) {
        luasPermukaanKubus = 6 * Math.pow(sisi, 2);
        volumeKubus = sisi*3;
    };
    protected BangunRuangKubusBalok(double p, double l, double t) {
        luasPermukaanBalok = (p*l) + (l*t);
        volumeBalok = p*l*t;
    };
    
    
    protected String getLuasPermukaanKubus() {
        return "Luas permukaan: " + luasPermukaanKubus;
    };
    protected String getVolKubus() {
        return "Volume: " + volumeKubus;
    };
    
    protected String getLuasPermukaanBalok() {
        return "Luas permukaan: " + luasPermukaanBalok;
    };
    protected String getVolBalok() {
        return "Volume: " + volumeBalok;
    };
};


class Kubus extends BangunRuangKubusBalok {
    private int s;
    
    public Kubus(int s) {
        super(s);
        this.s = s;
    };
    
    @Override
    public String getLuasPermukaanKubus() {
        return "Kubus, dengan sisi: " + s + "\n" + super.getLuasPermukaanKubus();
    };
    
    @Override
    public String getVolKubus() {
        return "Kubus, dengan sisi: " + s + "\n" + super.getVolKubus();
    };
}

class Balok extends BangunRuangKubusBalok {
    private double p, l, t;
    
    public Balok(double p, double l, double t) {
        super(p, l, t);
        this.p = p;
        this.l = l;
        this.t = t;
    };
    
    @Override
    public String getLuasPermukaanBalok() {
        return "Balok, dengan panjang: " + p + " lebar: " + l + " tinggi: " + t + "\n" + super.getLuasPermukaanBalok();
    };
    
    @Override
    public String getVolKubus() {
        return "Balok, dengan panjang: " + p + " lebar: " + l + " tinggi: " + t + "\n" + super.getVolBalok();
    };    
}