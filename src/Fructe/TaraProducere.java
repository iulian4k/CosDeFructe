package Fructe;

/**
 * This class is used for agregation
 */
public class TaraProducere {

    private String denumire; //denumire tara de producere
    private String denumireCompanie;


    /**
     * @param denumire The name of import country
     * @param denumireCompanie The name of import country
     */
    public TaraProducere(String denumire, String denumireCompanie) {
        this.denumire = denumire;
        this.denumireCompanie = denumireCompanie;
    }

    /**
     * @return This return the name of import country
     */
    public String getDenumire() {
        return denumire;
    }

    /**
     * @return This returns the name of import company
     */
    public String getDenumireCompanie() {
        return denumireCompanie;
    }
}
