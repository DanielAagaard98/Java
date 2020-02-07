package examen;

import java.util.Comparator;

/**
 *
 * @author Daniel Aagaard Pérez
 *
 */
public class OrdenarAutorData implements Comparator<Fotografia> {

    @Override
    public int compare(Fotografia c1, Fotografia c2) {
        int resultat = c1.getAutor().compareToIgnoreCase(c2.getAutor());

        if (resultat == 0) {
            resultat = c1.getData().compareTo(c2.getData());
        }

        return resultat;
    }
}
