
package com.imam.model;

import java.util.Date;

/**
 *
 * @author imam
 */
public class Paket {

    private String noPaket;
    private int berat;
    private Tarif paketTarif;

    public Paket() {
    }

    public Paket(String noPaket, int berat, Tarif pakatTarif) {
        this.noPaket = noPaket;
        this.berat = berat;
        this.paketTarif = pakatTarif;
    }

    public String getNoPaket() {
        return noPaket;
    }
 
    public void setNoPaket(String noPaket) {
        this.noPaket = noPaket;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public Tarif getPaketTarif() {
        return paketTarif;
    }

    public void setPaketTarif(Tarif pakatTarif) {
        this.paketTarif = pakatTarif;
    }
    
    public double hitungBiaya (String namaKota, String namaPaket) {
        //Tipe tipe = new Tipe();
        //Tarif tarif = new Tarif();
 
        double biaya = 0;
        if (namaKota.equalsIgnoreCase(paketTarif.getKotaTujuan())) {
            if (namaPaket.equalsIgnoreCase("Reguler")) {
                biaya = berat * paketTarif.getJasaLayanan().getReg();
            } else if (namaPaket.equalsIgnoreCase("Ekonomi")) {
                biaya = berat * paketTarif.getJasaLayanan().getEkonomi();
            } else if (namaPaket.equalsIgnoreCase("Sds")) {
                biaya = berat * paketTarif.getJasaLayanan().getSds();
            } else if (namaPaket.equalsIgnoreCase("Ons")) {
                biaya = berat * paketTarif.getJasaLayanan().getOns();
            }else if (namaPaket.equalsIgnoreCase("Hds")) {
                biaya = berat * paketTarif.getJasaLayanan().getHds();
            }  else {
                System.out.println("Paket Tidak Ada");
            }
        
        } else {
            System.out.println("Tujuan Tidak Ada");
        }
        
        return biaya;
    }
}
