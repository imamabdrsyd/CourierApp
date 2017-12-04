/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masterdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author imam
 */
public class TarifDao {
    public List<IndexPaket> getIndexPakets(){
    List<IndexPaket> listPaket= new ArrayList<>();
        try{
        Scanner sc = new Scanner(new File("C:/Java/listTarif.txt"));
   
        
      while(sc.hasNextLine()){
        IndexPaket penerima = new IndexPaket();
        String destination = sc.nextLine();
        String [] data = destination.split(",");
        String kotaTujuan = data[0];
        
        penerima.setTujuan(kotaTujuan);
        penerima.setReguler(Double.parseDouble(data[1]));
        penerima.setKilat(Double.parseDouble(data[2]));
        penerima.setOneDayService(Double.parseDouble(data[3]));
        penerima.setHourDayService(Double.parseDouble(data[4]));
        penerima.setSameDayService(Double.parseDouble(data[5]));
        listPaket.add(penerima);
      }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
//    
//      double hargaDasar = Double.parseDouble(data[1]);
//      double regular = Double.parseDouble(data[2]);
//      double sds = Double.parseDouble(data[3]);
//      double ons = Double.parseDouble(data[4]);
//      double hds = Double.parseDouble(data[5]);
     return listPaket;
    }
}
