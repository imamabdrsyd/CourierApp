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
public class DeliveryCost {
    private String destination;
     private Double reguler;
     private Double kilat;
     private Double SDS;
     private Double ONS;
     private Double HDS;
    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the reguler
     */
    public Double getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(Double reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the kilat
     */
    public Double getKilat() {
        return kilat;
    }

    /**
     * @param kilat the kilat to set
     */
    public void setKilat(Double kilat) {
        this.kilat = kilat;
    }

    /**
     * @return the SDS
     */
    public Double getSDS() {
        return SDS;
    }

    /**
     * @param SDS the SDS to set
     */
    public void setSDS(Double SDS) {
        this.SDS = SDS;
    }

    /**
     * @return the ONS
     */
    public Double getONS() {
        return ONS;
    }

    /**
     * @param ONS the ONS to set
     */
    public void setONS(Double ONS) {
        this.ONS = ONS;
    }

    /**
     * @return the HDS
     */
    public Double getHDS() {
        return HDS;
    }

    /**
     * @param HDS the HDS to set
     */
    public void setHDS(Double HDS) {
        this.HDS = HDS;
    }
}
