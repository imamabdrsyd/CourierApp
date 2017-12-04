
package com.imam.model;

/**
 *
 * @author imam
 */
public class Tipe {

    
    private double reg;
    private double ekonomi;
    private double sds;
    private double ons;
    private double hds;
    private double totalHarga;

    public Tipe() {
    }

    public Tipe(double reg, double kilat, double sds, double ons, double hds, double totalHarga) {
        this.reg = reg;
        this.ekonomi = ekonomi;
        this.sds = sds;
        this.ons = ons;
        this.hds = hds;
        this.totalHarga = totalHarga;
    }
    
    

    public double getReg() {
        return reg;
    }

    public void setReg(double reg) {
        this.reg = reg;
    }

    public double getEkonomi() {
        return ekonomi;
    }

    public void setEkonomi(double ekonomi) {
        this.ekonomi = ekonomi;
    }

    public double getSds() {
        return sds;
    }

    public void setSds(double sds) {
        this.sds = sds;
    }

    public double getOns() {
        return ons;
    }

    public void setOns(double ons) {
        this.ons = ons;
    }

    public double getHds() {
        return hds;
    }

    public void setHds(double hds) {
        this.hds = hds;
    }
    
    /**
     * @return the totalHarga
     */
    public double getTotalHarga() {
        return totalHarga;
    }

    /**
     * @param totalHarga the totalHarga to set
     */
    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
}
