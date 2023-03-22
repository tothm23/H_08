package hazi;

/**
 *
 * @author Tóth Milán
 */
public class Monitor extends Kijelzo {

    public Monitor(String nev, Double szelesseg, Double magassag,
            String felbontas, Integer kepernyoFrisssites, Integer portokSzama,
            Integer valaszIdo, Integer fogyasztas) {
        super(nev, szelesseg, magassag, felbontas, kepernyoFrisssites,
                portokSzama, valaszIdo, fogyasztas);
    }

    public Monitor() {
        super();
    }

}
