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
public class DeliveryPackage {
    private String kotaTujuan;
    private String jenisPengiriman;
    private Double beratPaket;
    private Double hargaPaketKirim;
    private boolean asuransi;

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the jenisPengiriman
     */
    public String getJenisPengiriman() {
        return jenisPengiriman;
    }

    /**
     * @param jenisPengiriman the jenisPengiriman to set
     */
    public void setJenisPengiriman(String jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }

    /**
     * @return the beratPaket
     */
    public Double getBeratPaket() {
        return beratPaket;
    }

    /**
     * @param beratPaket the beratPaket to set
     */
    public void setBeratPaket(Double beratPaket) {
        this.beratPaket = beratPaket;
    }

    /**
     * @return the hargaPaket
     */
    public Double getHargaPaketKirim() {
        return hargaPaketKirim;
    }

    /**
     * @param hargaPaket the hargaPaket to set
     */
    public void setHargaPaketKirim(Double hargaPaketKirim) {
        this.hargaPaketKirim = hargaPaketKirim;
    }

    /**
     * @return the asuransi
     */
    public boolean getAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    public void setAsuransi(String ya) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
