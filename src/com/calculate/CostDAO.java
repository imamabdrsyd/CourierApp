/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculate;

import com.masterdata.DeliveryCost;
import com.masterdata.DeliveryCostLib;
import com.masterdata.DeliveryPackage;
import java.util.List;

/**
 *
 * @author imam
 */
public class CostDAO {
    private double hargaAsuransi = 0.003;
    
    public double calculateCost (DeliveryPackage devPackage){
            double totalCost =0.0;
            
            Double costdest=0.0;
        Double weight = devPackage.getBeratPaket();
        Double price = devPackage.getHargaPaketKirim();
        
        List<DeliveryCost> libcost = DeliveryCostLib.costLib();
        
        for (DeliveryCost deliveryCost : libcost) {
            
            if(deliveryCost.getDestination().equalsIgnoreCase(devPackage.getKotaTujuan())){
                if(devPackage.getJenisPengiriman().equalsIgnoreCase("reguler")){
                    costdest = deliveryCost.getReguler();
                    if(devPackage.getAsuransi()){
                        totalCost = (costdest * weight) + (price * hargaAsuransi);
                        System.out.println("Total COST DAO: "+ totalCost);
                    }
                    else{
                        totalCost = costdest * weight;
//         double costdest ;
//         double weightPaket = devPackage.getBeratPaket();
//         double pricePackage = devPackage.getHargaPaket();
//         
//         List<DeliveryCost> libcost = DeliveryCostLib.costLib();
//         
//         for (DeliveryCost deliveryCost : libcost) {
//             if(deliveryCost.getDestination().equalsIgnoreCase(devPackage.getKotaTujuan())){
//                if(devPackage.getJenisPengiriman().equalsIgnoreCase("reguler")){
//             costdest = deliveryCost.getReguler();
//             if(devPackage.getAsuransi());
//             totalCost = (costdest * weightPaket) + ( pricePackage * hargaAsuransi);
//                 System.out.println("Total Cost DAO : " +totalCost );
//             }
//             else{
//                totalCost = costdest * weightPaket;
             }
            
        }
         if(devPackage.getJenisPengiriman().equalsIgnoreCase("kilat")){
                    costdest = deliveryCost.getKilat();
                    if(devPackage.getAsuransi()){
                        totalCost = (costdest * weight) + (price * hargaAsuransi);
                    }
                    else{
                        totalCost = costdest * weight;
                    }
                }
                
                if(devPackage.getJenisPengiriman().equalsIgnoreCase("SDS")){
                    costdest = deliveryCost.getHDS();
                    if(devPackage.getAsuransi()){
                        totalCost = (costdest * weight) + (price * hargaAsuransi);
                    }
                    else{
                        totalCost = costdest * weight;
                    }
                }
                
                if(devPackage.getJenisPengiriman().equalsIgnoreCase("ONS")){
                    costdest = deliveryCost.getONS();
                    if(devPackage.getAsuransi()){
                        totalCost = (costdest * weight) + (price * hargaAsuransi);
                    }
                    else{
                        totalCost = costdest * weight;
                    }
                }
                
                if(devPackage.getJenisPengiriman().equalsIgnoreCase("HDS")){
                    costdest = deliveryCost.getSDS();
                    if(devPackage.getAsuransi()){
                        totalCost = (costdest * weight) + (price * hargaAsuransi);
                    }
                    else{
                        totalCost = costdest * weight;
                    }
                }
            }
        }
        return totalCost;
        }
    
}
