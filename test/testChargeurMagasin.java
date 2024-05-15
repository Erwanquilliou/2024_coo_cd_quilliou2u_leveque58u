package test;
import static org.junit.Assert.*;

import donnees.Magasin;
import org.junit.Test;


import XML.ChargeurMagasin;

import java.io.FileNotFoundException;
import java.io.IOException;

public class testChargeurMagasin {

    @Test
    //lorsque qu'un répertoire valide est donné (le répertoire d'exemple), la méthode
    //chargerMagasin ne lève pas d'exception et retourne bien un magasin avec la
    //bonne taille
    public void testChargeurMagasin_bonneTaille() throws IOException {
        ChargeurMagasin c = new ChargeurMagasin("../musicbrainzSimple");
        Magasin m = c.chargerMagasin();
        int taille = m.getNombreCds();
        assertEquals(12, taille);
    }

    @Test
    //lorsque qu'un répertoire non valide est donné (répertoire inexistant), la méthode
    //chargerMagasin lève bien une FileNotFoundException
    public void testChargeurMagasin_repertoireInexistant() throws FileNotFoundException {
        ChargeurMagasin c = new ChargeurMagasin("hsbfizNFU");
        Magasin m = c.chargerMagasin();
    }


}
