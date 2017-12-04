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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author imam
 */
public class DeliveryCostLib {
    public static List<DeliveryCost> costLib(){
        List<DeliveryCost> libs = new ArrayList<>();
        
        try{
            Scanner scan = new Scanner(new File("C:/JAVA_LATIHAN/FileTarif.txt"));
            while (scan.hasNextLine()) {                
            String next = scan.nextLine();
            String [] data = next.split(",");
            
                DeliveryCost cost = new DeliveryCost();
                cost.setDestination(data[0]);
                cost.setReguler(Double.parseDouble(data[1]));
                cost.setKilat(Double.parseDouble(data[2]));
                cost.setHDS(Double.parseDouble(data[3]));
                cost.setONS(Double.parseDouble(data[4]));
                cost.setSDS(Double.parseDouble(data[5]));
            
            libs.add(cost);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeliveryCostLib.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  libs;
    }
}
