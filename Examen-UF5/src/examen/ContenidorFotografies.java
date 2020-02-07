package examen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Daniel Aagaard Pérez
 *
 */
public class ContenidorFotografies implements Iterable<Fotografia> {

    private ArrayList<Fotografia> fotografies = new ArrayList<>();

    public void afegirFoto(Fotografia f) {
        fotografies.add(f);

    }

    public void eliminarFoto(Fotografia f) throws FotoNotFoundException {
        if (fotografies.contains(f)) {
            fotografies.remove(f);
        } else {
            throw new FotoNotFoundException("LA FOTO NO ES TROBA A LA COLLECIÓ");
        }
    }

    public void mostrarPerPantalla() {
        for (Fotografia f : fotografies) {
            System.out.println(f);
        }
    }
    
    public void ordenaAlfabetic() {
        Collections.sort(fotografies, new OrdenarAutorData());
    }
    
    
    
    @Override
    public Iterator<Fotografia> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
