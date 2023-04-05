package hazi;

/**
 *
 * @author Tóth Milán
 */
public class TV extends Kijelzo {

    private Boolean vanTaviranyito;

    public TV(String nev, Double szelesseg, Double magassag, GrafikusFelbontas grafikusFelbontas, String kepernyoFelbontas, String kepernyoArany, Integer kepernyoFrisssites, Integer portokSzama, Integer valaszIdo, Integer fogyasztas) {
        super(nev, szelesseg, magassag, grafikusFelbontas, kepernyoFelbontas, kepernyoArany, kepernyoFrisssites, portokSzama, valaszIdo, fogyasztas);
    }

    public TV() {
        super();
    }

    public TV(Boolean vanTaviranyito, String nev, Double szelesseg, Double magassag, GrafikusFelbontas grafikusFelbontas, String kepernyoFelbontas, String kepernyoArany, Integer kepernyoFrisssites, Integer portokSzama, Integer valaszIdo, Integer fogyasztas) {
        super(nev, szelesseg, magassag, grafikusFelbontas, kepernyoFelbontas, kepernyoArany, kepernyoFrisssites, portokSzama, valaszIdo, fogyasztas);
        this.vanTaviranyito = vanTaviranyito;
    }

    public Boolean getVanTaviranyito() {
        return vanTaviranyito;
    }

    public void setVanTaviranyito(Boolean vanTaviranyito) {
        this.vanTaviranyito = vanTaviranyito;
    }

}
