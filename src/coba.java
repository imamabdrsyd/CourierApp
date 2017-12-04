
import com.imam.dao.TarifFileDAO;
import com.imam.model.Paket;
import com.imam.model.Tarif;
import com.imam.model.Tipe;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class coba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Tarif> tarifs = TarifFileDAO.pilihKota();

        for (Tarif tarif : tarifs) {
            if (tarif.getKotaTujuan().equalsIgnoreCase("bandung")) {
                Paket paket = new Paket();
                paket.setBerat(4);
                paket.setPaketTarif(tarif);
                double hitung = paket.hitungBiaya("bandung", "reguler");
                System.out.println("hitung = " + hitung);
            }
        }

    }

}
