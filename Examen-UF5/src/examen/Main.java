package examen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Aagaard Pérez
 *
 */
public class Main {

    public static void main(String[] args) {

        ContenidorFotografies fotografies = new ContenidorFotografies();

        LocalDate data1 = LocalDate.of(2020, 02, 7);
        LocalDate data2 = LocalDate.of(2019, 02, 7);
        LocalDate data3 = LocalDate.of(1880, 1, 1);
        LocalDate data4 = LocalDate.of(2020, 2, 8);

        ArrayList<String> temes1 = new ArrayList<>();
        temes1.add("alegria");
        temes1.add("gent");
        temes1.add("aula");

        ArrayList<String> temes2 = new ArrayList<>();
        temes2.add("emoció");
        temes2.add("ensenyament");
        temes2.add("aula");

        ArrayList<String> temes3 = new ArrayList<>();
        temes3.add("valor");

        ArrayList<String> temes4 = new ArrayList<>();
        temes4.add("paissatge");
        temes4.add("muntanya");
        temes4.add("Catalunya");

        ArrayList<String> temes5 = new ArrayList<>();
        temes5.add("paissatge");

        ArrayList<String> temes6 = new ArrayList<>();
        temes6.add("nervis");

        Fotografia f9 = new Fotografia("Anna", "paissatge Empordà", data3, temes5);
        Fotografia f10 = new Fotografia("Daniel Aagaard", "selfie", data4, temes6);

        fotografies.afegirFoto(new Fotografia("Maria", "alumnes fent examen de DAW", data1, temes1));
        fotografies.afegirFoto(new Fotografia("Maria", "alumnes fent examen de DAW", data1, temes1));
        fotografies.afegirFoto(new Fotografia("Maria", "alumnes fent examen de DAW", data2, temes1));
        fotografies.afegirFoto(new Fotografia("Maria", "alumnes fent examen de DAW", data2, temes2));
        fotografies.afegirFoto(new Fotografia("Joan", "alumnes fent examen de DAW", data1, temes3));
        fotografies.afegirFoto(new Fotografia("Josep", "paissatge Empordà", data3, temes4));
        fotografies.afegirFoto(new Fotografia("Josep", "paissatge Empordà", data3, temes4));
        fotografies.afegirFoto(new Fotografia("Josep", "paissatge Empordà", data3, temes4));
        //fotografies.afegirFoto(f9);
        fotografies.afegirFoto(f10);

        fotografies.mostrarPerPantalla();
        System.out.println("----------------------------------------------------------------------------");
        try {
            fotografies.eliminarFoto(f9);
        } catch (FotoNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.out.println("");
        }
        fotografies.mostrarPerPantalla();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("MOSTRAR ORDENAT ALFABETIC PER AUTOR I DATA");
        fotografies.ordenaAlfabetic();
        fotografies.mostrarPerPantalla();
        System.out.println("\n");
    }
}
