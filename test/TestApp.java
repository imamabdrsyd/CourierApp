
import com.imam.dao.TarifFileDAO;
import com.imam.model.Tarif;
/**
 *
 * @author imam
 */
public class TestApp {

    public static void main(String[] args) {
        TarifFileDAO tff = new  TarifFileDAO();
        Tarif ta = new Tarif();
        ta = tff.pilihKota().get(2);
        System.out.println(ta.getJasaLayanan().getOns()+" "+ ta.getJasaLayanan().getHds() +ta.getKotaTujuan());
    }
    
}
