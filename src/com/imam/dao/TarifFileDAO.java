
package com.imam.dao;

import com.imam.model.Paket;
import com.imam.model.Tarif;
import com.imam.model.Tipe;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author imam
 */
public class TarifFileDAO {
    public static List <Tarif> pilihKota () {
        
        List <Tarif> kotatujuan = new ArrayList<>();
        
//        for (Tarif tarif: kotatujuan) {
//            if ( )
//        }
        
        try {
//            Scanner scan = new Scanner(new File("C:/JAVA_LATIHAN/FileTarif.txt"));
            Scanner scan = new Scanner(new File(TarifFileDAO.class.getResource("/asset/FileTarif.txt").getFile()));
            
            while (scan.hasNextLine()) {
            
            
            String line = scan.nextLine();
            String [] data = line.split(",");  

                Tarif tarif = new Tarif();
                tarif.setKotaTujuan(data[0]);
                
                Tipe tipe = new Tipe();
                tarif.setJasaLayanan(tipe);
                
                tarif.getJasaLayanan().setReg(Double.parseDouble(data[1].trim()));
                tarif.getJasaLayanan().setEkonomi(Double.parseDouble(data[2].trim()));
                tarif.getJasaLayanan().setSds(Double.parseDouble(data[3].trim()));
                tarif.getJasaLayanan().setOns(Double.parseDouble(data[4].trim()));
                tarif.getJasaLayanan().setHds(Double.parseDouble(data[5].trim()));
                
                kotatujuan.add(tarif);
                
                
            
        }
            
            
        } catch (FileNotFoundException fileErr) {
//            fileErr.printStackTrace();
              System.out.println("File tidak ditemukan");
        }
        return kotatujuan;
    }   
}
