/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculate;

import com.masterdata.DeliveryPackage;

/**
 *
 * @author imam
 */
public class tesHasil {
    public static void main(String[] args) {
        // TODO code application logic here
        DeliveryPackage pack = new DeliveryPackage();
        pack.setHargaPaketKirim(100000.0);
        pack.setJenisPengiriman("reguler");
        pack.setKotaTujuan("bandung");
        pack.setAsuransi(true);
        pack.setBeratPaket(4.0);
        
        CostDAO cost = new CostDAO();
        Double harga = cost.calculateCost(pack);
        //?
        System.out.println("Berat: " + pack.getBeratPaket());
        System.out.println("Harga: " + pack.getHargaPaketKirim());
        System.out.println("COST : " + harga);
    }
}
