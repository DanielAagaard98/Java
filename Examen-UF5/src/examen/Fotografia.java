package examen;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Daniel Aagaard Pérez
 *
 */
public class Fotografia {
    
    private String autor;
    private String descripcio;
    private LocalDate data;
    private ArrayList<String> temes;
    
    private static int nFotografies = 0;
    
    public Fotografia(String autor, String descripcio, LocalDate data,  ArrayList<String> temes){
        this.autor = autor;
        this.descripcio = descripcio;
        this.data = data;
        this.temes = temes;

    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ArrayList<String> getTemes() {
        return temes;
    }

    public void setTemes(ArrayList<String> temes) {
        this.temes = temes;
    }

    public static int getnFotografies() {
        return nFotografies;
    }

    public static void setnFotografies(int nFotografies) {
        Fotografia.nFotografies = nFotografies;
    }

    @Override
    public String toString() {
        return "Fotografia{" + "autor=" + autor + ", descripcio=" + descripcio + ", data=" + data + ", temes=" + temes + '}';
    }

    
    
}
