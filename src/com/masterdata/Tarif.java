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
public class Tarif {
    public Tarif() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @retpubliceinting kotaTujuan;
    getBerat() String kodeTujuan{
        return;
    berat
    /*    }*/
    private int berat;
    private String kotaTujuan;
    private String jenisPengiriman;
    private String kodeTujuan;
    private double hargaPaket;
    private double hargaBarang;
    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }

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
     * @return the kodeTujuan
     */
    public String getKodeTujuan() {
        return kodeTujuan;
    }

    /**
     * @param kodeTujuan the kodeTujuan to set
     */
    public void setKodeTujuan(String kodeTujuan) {
        this.kodeTujuan = kodeTujuan;
    }

    /**
     * @return the hargaPaket
     */
    public double getHargaPaket() {
        double Tarif =0.0;
        return Tarif;
    }

    /**
     * @param hargaPaket the hargaPaket to set
     */
    public void setHargaPaket(double hargaPaket) {
        this.hargaPaket = hargaPaket;
    }

/*
     * @return the harga
     */
    
////    private HargaPaket harga;
//// private int quantity;
//// private double PPN = 0.3;
//// 
//// public Tarif(HargaPaket harga, int quantity, double PPN){
////     this.harga=harga;
////     this.quantity=quantity;
////     this.PPN=PPN;
//// }
//// 
//// public double hitungHargaTotal(){
////     double totalHarga;
////     if(PPN!=0.0){
////         double hargaKirim = (harga.getPricePaket()*quantity)*PPN;
////         totalHarga=(harga.getPricePaket()*quantity);
////     }else{
////         totalHarga=this.harga.getTypePaket()*quantity;
////     }
////     return totalHarga;
//// }
////    public HargaPaket getHarga() {
////        return harga;
////    }
////
////    /**
////     * @param harga the harga to set
////     */
////    public void setHarga(HargaPaket harga) {
////        this.harga = harga;
////    }
////
////    /**
////     * @return the quantity
////     */
////    public int getQuantity() {
////        return quantity;
////    }
////
////    /**
////     * @param quantity the quantity to set
////     */
////    public void setQuantity(int quantity) {
////        this.quantity = quantity;
////    }
////
////    /**
////     * @return the PPN
////     */
////    public double getPPN() {
////        return PPN;
////    }
////
////    /**
////     * @param PPN the PPN to set
////     */
////    public void setPPN(double PPN) {
////        this.PPN = PPN;
////    }
}
