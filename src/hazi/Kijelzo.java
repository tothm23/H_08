package hazi;

import h_08.FogyasztasException;
import h_08.MagassagException;
import h_08.PortSzamException;
import h_08.SzelessegException;
import java.util.Random;

/**
 *
 * @author Tóth Milán
 */
public abstract class Kijelzo {

    /*
    https://prohardver.hu/tudastar/grafikus_es_kepernyo_felbontasok.html
    6 tulajdonság
    1 csak látható - nev
    1 bármire megváltoztatható - kepernyoArany
    4 korlátozottan - szelesseg, magassag, grafikusFelbontas, KepernyoFelbontas, kepernyoFrisssites, portokSzama, valaszIdo, fogyasztas
    3 konstruktor
    getter, setter
     */
    private final Long gyariSzam = setGyariSzam();
    private String nev;
    private Double szelesseg;
    private Double magassag;
    private String grafikusFelbontas;
    private String kepernyoFelbontas;
    private Integer kepernyoFrisssites;
    private Integer portokSzama;
    private Integer valaszIdo;
    private Integer fogyasztas;

    /*
    public Screen(String nev, String grafikusFelbontas, String kepernyoFelbontas) {
        this.nev = nev;
        this.grafikusFelbontas = grafikusFelbontas;
        this.kepernyoFelbontas = kepernyoFelbontas;
    }

    public Screen(String nev, Double szelesseg, Double magassag) {
        this.nev = nev;
        this.szelesseg = szelesseg;
        this.magassag = magassag;
    }
     */
    public Kijelzo(String nev, Double szelesseg, Double magassag,
            String grafikusFelbontas, String kepernyoFelbontas,
            Integer kepernyoFrisssites, Integer portokSzama, Integer valaszIdo,
            Integer fogyasztas) {
        this.nev = nev;
        this.szelesseg = szelesseg;
        this.magassag = magassag;
        this.grafikusFelbontas = grafikusFelbontas;
        this.kepernyoFelbontas = kepernyoFelbontas;
        this.kepernyoFrisssites = kepernyoFrisssites;
        this.portokSzama = portokSzama;
        this.valaszIdo = valaszIdo;
        this.fogyasztas = fogyasztas;
    }

    public Kijelzo() {
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

    public void setSzelesseg(Double szelesseg) throws SzelessegException {
        if (szelesseg <= 0.0) {
            throw new SzelessegException("A kijelző szélessége 0 méternél nem lehet kisebb!");
        }
        if (szelesseg <= 5 && szelesseg >= 0.1) {
            this.szelesseg = szelesseg;
        } else {
            throw new SzelessegException("A kijelző szélessége 5 méternél nem lehet nagyobb!");
        }

    }

    public Double getMagassag() {
        return magassag;
    }

    public void setMagassag(Double magassag) throws MagassagException {
        if (magassag <= 0.0) {
            throw new MagassagException("A kijelző magassága 0 méternél nem lehet kisebb!");
        }
        if (magassag <= 3 && magassag >= 0.1) {
            this.magassag = magassag;
        } else {
            throw new MagassagException("A kijelző magassága 3 méternél nem lehet nagyobb!");
        }
    }

    public String getGrafikusFelbontas() {
        return grafikusFelbontas;
    }

    public void setGrafikusFelbontas(String grafikusFelbontas) {
        this.grafikusFelbontas = grafikusFelbontas;
    }

    public String getKepernyoFelbontas() {
        return kepernyoFelbontas;
    }

    public void setKepernyoFelbontas(String KepernyoFelbontas) {
        this.kepernyoFelbontas = KepernyoFelbontas;
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

    public void setPortokSzama(Integer portokSzama) throws PortSzamException {
        if (portokSzama < 2) {
            throw new PortSzamException("A kijelzőnek minimum 2 porttal kell rendelkeznie!");
        } else {
            this.portokSzama = portokSzama;
        }
    }

    public Integer getValaszIdo() {
        return valaszIdo;
    }

    public void setValaszIdo(Integer valaszIdo) {
        this.valaszIdo = valaszIdo;
    }

    public Long getGyariSzamm() {
        return gyariSzam;
    }

    private Long setGyariSzam() {
        Long gyariszam = new Random().nextLong();
        
        while (gyariszam < 0) {
            gyariszam = new Random().nextLong();
        }
        
        return gyariszam;
    }

    public Integer getFogyasztas() {
        return fogyasztas;
    }

    public void setFogyasztas(Integer fogyasztas) throws FogyasztasException {
        if (fogyasztas > 0) {
            this.fogyasztas = fogyasztas;
        } else {
            throw new FogyasztasException("A kijelző nem termel áramot!");
        }
    }

}
