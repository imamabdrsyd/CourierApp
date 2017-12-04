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
public class HargaPaket {
    private String typePaket;
    private double pricePaket;
    
    public HargaPaket(String typePaket, double pricePaket){
        this.typePaket=typePaket;
        this.pricePaket=pricePaket;
    }
    /**
     * @return the typePaket
     */
    public String getTypePaket() {
        return typePaket;
    }

    /**
     * @param typePaket the typePaket to set
     */
    public void setTypePaket(String typePaket) {
        this.typePaket = typePaket;
    }

    /**
     * @return the pricePaket
     */
    public double getPricePaket() {
        return pricePaket;
    }

    /**
     * @param pricePaket the pricePaket to set
     */
    public void setPricePaket(double pricePaket) {
        this.pricePaket = pricePaket;
    }
}
