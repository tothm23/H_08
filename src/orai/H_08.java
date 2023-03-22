package orai;

import hazi.Monitor;

/**
 *
 * @author Tóth Milán
 */
public class H_08 {

    public static void main(String[] args) {
        Integer szam = 12;
        szam = 20;
        System.out.println(szam);

        User u = new User();

        System.out.println(u.name);
        u.name = "Elek";
        System.out.println(u.name);

        u.setSzemelyigazolvanyszam("ABC123");
        System.out.println(u.getSzemelyigazolvanyszam());

        User u2 = new User("Peti", Szin.PIROS);
        System.out.println(u2.name + " " + u2.getSzemelyigazolvanyszam());

        User u3 = new User("Elek", "CBA321");
        System.out.println(u3.name + " " + u3.getSzemelyigazolvanyszam());

        System.out.println(User.peldany);
        System.out.println(User.getPeldany());

        ///// ///// ///// ///// /////
        Monitor m = new Monitor();
        System.out.println(m.getGyariSzamm());
    }

}
