package com.imam.model;

/**
 *
 * @author imam
 */
public class Tarif {
    
    private String kotaTujuan;
    private Tipe jasaLayanan;

    public Tarif() {
    }

    public Tarif(String kotaTujuan, Tipe jasaLayanan) {
        this.kotaTujuan = kotaTujuan;
        this.jasaLayanan = jasaLayanan;
    }
    
    public double getHargaPaket(){
     double tarif = 0.0;
     return tarif;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    public Tipe getJasaLayanan() {
        return jasaLayanan;
    }

    public void setJasaLayanan(Tipe jasaLayanan) {
        this.jasaLayanan = jasaLayanan;
    }

    @Override
    public String toString() {
        return this.kotaTujuan;
    }
}
