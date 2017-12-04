/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masterdata;

/**
 *
 * @author imam
 */
public class Pengirim {
    public Pengirim(){
       
   }
    private String getNamaPengirim() {
        return namaPengirim;
    }

    /**
     * @param namaPengirim the namaPengirim to set
     */
    private void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    /**
     * @return the alamatPengirim
     */
    private String getAlamatPengirim() {
        return alamatPengirim;
    }

    /**
     * @param alamatPengirim the alamatPengirim to set
     */
    private void setAlamatPengirim(String alamatPengirim) {
        this.alamatPengirim = alamatPengirim;
    }

    /**
     * @return the beratPaket
     */
    private int getBeratPaket() {
        return beratPaket;
    }

    /**
     * @param beratPaket the beratPaket to set
     */
    private void setBeratPaket(int beratPaket) {
        this.beratPaket = beratPaket;
    }

  private String namaPengirim;
  private String alamatPengirim;
  private int beratPaket;
}
