package hazi;

/**
 *
 * @author Tóth Milán
 */
public class TV extends Kijelzo {

    private Boolean vanTaviranyito;

    public TV(String nev, Double szelesseg, Double magassag, String felbontas,
            Integer kepernyoFrisssites, Integer portokSzama, Integer valaszIdo,
            Integer fogyasztas) {
        super(nev, szelesseg, magassag, felbontas, kepernyoFrisssites,
                portokSzama, valaszIdo, fogyasztas);
    }

    public TV() {
        super();
    }

    public TV(Boolean vanTaviranyito, String nev, Double szelesseg,
            Double magassag, String felbontas, Integer kepernyoFrisssites,
            Integer portokSzama, Integer valaszIdo, Integer fogyasztas) {
        super(nev, szelesseg, magassag, felbontas, kepernyoFrisssites,
                portokSzama, valaszIdo, fogyasztas);
        this.vanTaviranyito = vanTaviranyito;
    }

    public Boolean getVanTaviranyito() {
        return vanTaviranyito;
    }

    public void setVanTaviranyito(Boolean vanTaviranyito) {
        this.vanTaviranyito = vanTaviranyito;
    }

}
