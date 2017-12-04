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
public class TestDao {
    public static void main(String[] args) {
//      List<IndexPaket>getIndexPakets = TarifDao.getIndexPakets<>();
        IndexPaket i = new IndexPaket();
//      i = (8);
              double hargaTotalRegulerNonAsuransi= i.getReguler()*5;
        System.out.println(i.getTujuan()+hargaTotalRegulerNonAsuransi);
        double hargaTotalKilatNonAsuransi =i.getKilat()*3;
        System.out.println(hargaTotalRegulerNonAsuransi);
        
        
//        for (IndexPaket penerima : getIndexPakets) {
//            System.out.println(" Kota Tujuan Anda " +penerima.getTujuan()+ "   "
//                    + penerima.getReguler()+ "  " 
//                    +penerima.getKilat());
//        penerima.setOneDayService(Double.parseDouble(data[3]));
//        penerima.setHourDayService(Double.parseDouble(data[4]));
//        penerima.setSameDayService(Double.parseDouble(data[5]));
//        listPaket.add(penerima););
        }
}
