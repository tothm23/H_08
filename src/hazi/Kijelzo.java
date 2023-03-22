package hazi;

import java.util.Random;

/**
 *
 * @author Tóth Milán
 */
public abstract class Kijelzo {

    // https://prohardver.hu/tudastar/grafikus_es_kepernyo_felbontasok.html
    /*
    6 tulajdonság
    1 csak látható - nev
    1 bármire megváltoztatható - kepernyoArany
    4 korlátozottan - szelesseg, magassag, felbontas, kepernyoFrisssites, 
    portokSzama, valaszIdo, fogyasztas
    3 konstruktor
    getter, setter
     */
    private final Long gyariSzamm = generalGyariSzam(15);
    private String nev;
    private Double szelesseg;
    private Double magassag;
    private String felbontas;
    private Integer kepernyoFrisssites;
    private Integer portokSzama;
    private Integer valaszIdo;
    private Integer fogyasztas;

    public Kijelzo(String nev, String felbontas) {
        this.nev = nev;
        this.felbontas = felbontas;
    }

    public Kijelzo(String nev, Double szelesseg, Double magassag) {
        this.nev = nev;
        this.szelesseg = szelesseg;
        this.magassag = magassag;
    }

    public Kijelzo(String nev, Double szelesseg, Double magassag, String felbontas, Integer kepernyoFrisssites, Integer portokSzama, Integer valaszIdo, Integer fogyasztas) {
        this.nev = nev;
        this.szelesseg = szelesseg;
        this.magassag = magassag;
        this.felbontas = felbontas;
        this.kepernyoFrisssites = kepernyoFrisssites;
        this.portokSzama = portokSzama;
        this.valaszIdo = valaszIdo;
        this.fogyasztas = fogyasztas;
    }

    public Kijelzo() {
    }

    private static Long generalGyariSzam(long hossz) {
        final String SZAMOK = "0123456789";

        String gyariSzam = "";
        for (int i = 0; i < hossz; i++) {
            Integer veletlenSzam = new Random().nextInt(SZAMOK.length());
            char betu = SZAMOK.charAt(veletlenSzam);
            gyariSzam += betu;
        }

        return Long.parseLong(gyariSzam);

    }

    public Long getGyariSzamm() {
        return gyariSzamm;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Double getSzelesseg() {
        return szelesseg;
    }

    public void setSzelesseg(Double szelesseg) {
        if (szelesseg > 0) {
            this.szelesseg = szelesseg;
        }
        this.szelesseg = 0.0;

    }

    public Double getMagassag() {
        return magassag;
    }

    public void setMagassag(Double magassag) {
        if (magassag > 0) {
            this.magassag = magassag;
        }
        this.magassag = 0.0;
    }

    public String getFelbontas() {
        return felbontas;
    }

    public void setFelbontas(String felbontas) {
        this.felbontas = felbontas;
    }

    public Integer getKepernyoFrisssites() {
        return kepernyoFrisssites;
    }

    public void setKepernyoFrisssites(Integer kepernyoFrisssites) {
        if (kepernyoFrisssites > 0) {
            this.kepernyoFrisssites = kepernyoFrisssites;
        }
        this.kepernyoFrisssites = 0;
    }

    public Integer getPortokSzama() {
        return portokSzama;
    }

    public void setPortokSzama(Integer portokSzama) {
        if (portokSzama > 0) {
            this.portokSzama = portokSzama;
        }
    }

    public Integer getValaszIdo() {
        return valaszIdo;
    }

    public void setValaszIdo(Integer valaszIdo) {
        this.valaszIdo = valaszIdo;
    }

    public Integer getFogyasztas() {
        return fogyasztas;
    }

    public void setFogyasztas(Integer fogyasztas) {
        if (fogyasztas > 0) {
            this.fogyasztas = fogyasztas;
        }
        this.fogyasztas = 0;
    }

}
