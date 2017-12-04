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
public class Paket {
    private Tarif paketTarif;
    private double berat;
    /**
     * @return the paketTarif
     */
    
    public Paket(){
        
    }
    
    public double hitunganHargaKirimPaketRegulerNonAsuransi(int inx){
       double reg =0.0;
       TarifDao tff = new TarifDao();
       Tarif trf = new Tarif();
       IndexPaket indPaket = new IndexPaket();
       indPaket = tff.getIndexPakets().get(inx);
       reg =  indPaket.getReguler()*getBerat();
       return reg;
   }
    public double hitunganHargaKirimPaketKilatNonAsuransi(int inx){
       double kilat =0.0;
       TarifDao tff = new TarifDao();
       Tarif trf = new Tarif();
       IndexPaket indPaket = new IndexPaket();
       indPaket = tff.getIndexPakets().get(inx);
       kilat =  indPaket.getKilat()*getBerat();
       return kilat;
   }
     public double hitunganHargaKirimPaketRegulerDgnAsuransi(int inx){
       double biayaAsuransi =hitunganHargaKirimPaketRegulerDgnAsuransi(inx)*0.003;
       double biaya = hitunganHargaKirimPaketRegulerDgnAsuransi(inx)+biayaAsuransi;
      return biaya;
   }
   public double hitungHargaKirimPaketKilatDgnAsuransi (int inx){
       double biayaAsuransi = hitungHargaKirimPaketKilatDgnAsuransi(inx)*0.003;
       double biaya = hitungHargaKirimPaketKilatDgnAsuransi(inx)+biayaAsuransi;
       return biaya;
   }
    
    public Tarif getPaketTarif() {
        return paketTarif;
    }

    /**
     * @param paketTarif the paketTarif to set
     */
    public void setPaketTarif(Tarif paketTarif) {
        this.paketTarif = paketTarif;
    }

    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(double berat) {
        this.berat = berat;
    }
    public double hitungTotalRegulerNonAsuransi(int indexKota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
