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
public class IndexPaket {
    private String tipePaket;
   private String tujuan;
   private final double PPN = 0.3;
   private double reguler;
   private double kilat;
   private double sameDayService;
   private double oneDayService;
   private double hourDayService;

    /**
     * @return the tujuan
     */
    public String getTujuan() {
        return tujuan;
    }

    /**
     * @param tujuan the tujuan to set
     */
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    /**
     * @return the tipePaket
     */
    public String getTipePaket() {
        return tipePaket;
    }

    /**
     * @param tipePaket the tipePaket to set
     */
    public void setTipePaket(String tipePaket) {
        this.tipePaket = tipePaket;
    }

    /**
     * @return the PPN
     */
    public double getPPN() {
        return PPN;
    }

    /**
     * @return the reguler
     */
    public double getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(double reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the kilat
     */
    public double getKilat() {
        return kilat;
    }

    /**
     * @param kilat the kilat to set
     */
    public void setKilat(double kilat) {
        this.kilat = kilat;
    }

    /**
     * @return the sameDayService
     */
    public double getSameDayService() {
        return sameDayService;
    }

    /**
     * @param sameDayService the sameDayService to set
     */
    public void setSameDayService(double sameDayService) {
        this.sameDayService = sameDayService;
    }

    /**
     * @return the oneDayService
     */
    public double getOneDayService() {
        return oneDayService;
    }

    /**
     * @param oneDayService the oneDayService to set
     */
    public void setOneDayService(double oneDayService) {
        this.oneDayService = oneDayService;
    }

    /**
     * @return the hourDayService
     */
    public double getHourDayService() {
        return hourDayService;
    }

    /**
     * @param hourDayService the hourDayService to set
     */
    public void setHourDayService(double hourDayService) {
        this.hourDayService = hourDayService;
    }
}
