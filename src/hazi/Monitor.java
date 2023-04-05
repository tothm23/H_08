package hazi;

/**
 *
 * @author Tóth Milán
 */
public class Monitor extends Kijelzo {

    public Monitor(String nev, Double szelesseg, Double magassag, GrafikusFelbontas grafikusFelbontas, String kepernyoFelbontas, String kepernyoArany, Integer kepernyoFrisssites, Integer portokSzama, Integer valaszIdo, Integer fogyasztas) {
        super(nev, szelesseg, magassag, grafikusFelbontas, kepernyoFelbontas, kepernyoArany, kepernyoFrisssites, portokSzama, valaszIdo, fogyasztas);
    }

    public Monitor() {
        super();
    }

}
