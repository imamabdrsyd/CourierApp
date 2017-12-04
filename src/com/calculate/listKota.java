/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculate;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author imam
 */
public class listKota {
    public void listKota(){
        String [] daftarKota ={ "Bandung","Semarang","Surabaya","Timika","Malang","Tanggerang","Tasikmalaya","Yogyakarta","Medan"};
        DefaultComboBoxModel dm = new DefaultComboBoxModel(daftarKota);
    }
//    public List<Tarif>getKota() throws FileNotFoundException{
//        List<Tarif> daftarKota = new ArrayList<>();
//        
//        try{
//            Scanner sc = new Scanner (new File("C:/Java/listTarif.txt"));
//            while (sc.hasNextLine()){
//            String kota = sc.nextLine();
//            String [] data = kota.split(",");
//            Tarif tarifs = new Tarif();
//            tarifs.setKotaTujuan(data[0]);
//            
//            tarifs.setHargaPaket;
//                
//            }
//        }
//    }
}
