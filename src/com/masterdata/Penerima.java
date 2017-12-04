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
public class Penerima {
    private String namaPenerima;
    private String alamatPenerima;
    private String kotaPenerima;
    private int noTelfonPenerima;

    /**
     * @return the kotaPenerima
     */
    private String getKotaPenerima() {
        return kotaPenerima;
    }

    /**
     * @param kotaPenerima the kotaPenerima to set
     */
    private void setKotaPenerima(String kotaPenerima) {
        this.kotaPenerima = kotaPenerima;
    }
    
    public Penerima(String namaPenerima, String alamatPenerima, int noTelfonPenerima){
        this.namaPenerima=namaPenerima;
        this.alamatPenerima=alamatPenerima;
        this.noTelfonPenerima=this.noTelfonPenerima;
    }

    public Penerima() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String getNamaPenerima() {
        return namaPenerima;
    }

    /**
     * @param namaPenerima the namaPenerima to set
     */
    private void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    /**
     * @return the alamatPenerima
     */
    private String getAlamatPenerima() {
        return alamatPenerima;
    }

    /**
     * @param alamatPenerima the alamatPenerima to set
     */
    private void setAlamatPenerima(String alamatPenerima) {
        this.alamatPenerima = alamatPenerima;
    }

    /**
     * @return the noTelfonPenerima
     */
    private int getNoTelfonPenerima() {
        return noTelfonPenerima;
    }

    /**
     * @param noTelfonPenerima the noTelfonPenerima to set
     */
    private void setNoTelfonPenerima(int noTelfonPenerima) {
        this.noTelfonPenerima = noTelfonPenerima;
    }
}
