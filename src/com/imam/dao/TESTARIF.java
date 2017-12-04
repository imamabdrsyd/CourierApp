/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imam.dao;

import com.imam.model.Tarif;
import java.util.List;

/**
 *
 * @author user
 */
public class TESTARIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Tarif> tarifs = TarifFileDAO.pilihKota();
        for (Tarif tarif : tarifs) {
            if(tarif.getKotaTujuan().equalsIgnoreCase("bandung")){
                System.out.println("Harga ONS: " + tarif.getJasaLayanan().getHds());
            }
        }
    }
    
}
