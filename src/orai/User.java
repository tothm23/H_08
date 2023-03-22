package orai;

/**
 *
 * @author Tóth Milán
 */
public class User {

    // Nem használunk primitív adattípust! (int)
    public String name;
    public Szin szin;
    private String szemelyigazolvanyszam;
    public static Integer peldany = 0;

    public User() {
        this.name = null;
        this.szemelyigazolvanyszam = null;
        User.peldany++;

        // Visszaad egy példányt
        // return this;
    }

    public User(String name, Szin szin) {
        this.name = name;
        this.szin = szin;
        User.peldany++;
    }

    public User(String name, String szemelyigazolvanyszam) {
        this.name = name;
        this.szemelyigazolvanyszam = szemelyigazolvanyszam;
        User.peldany++;
    }

    public String getSzemelyigazolvanyszam() {
        return szemelyigazolvanyszam;
    }

    public void setSzemelyigazolvanyszam(String szemelyigazolvanyszam) {
        this.szemelyigazolvanyszam = szemelyigazolvanyszam;
    }

    public static Integer getPeldany() {
        return peldany;
    }

}
