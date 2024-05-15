package test;
import static org.junit.Assert.*;

import donnees.Magasin;
import org.junit.Test;


import XML.ChargeurMagasin;

import java.io.FileNotFoundException;
import java.io.IOException;


public class testTri {

    @Test
    //test début de liste
    public void testTriCd_debut() throws IOException {
        ChargeurMagasin c = new ChargeurMagasin("../musicbrainzSimple");
        Magasin m = c.chargerMagasin();
        m.trierCd();
        String titre = m.getCd(0).getTitre();
        assertEquals("AboutLove", titre);
    }

    @Test
    //test fin de liste
    public void testTriCd_fin() throws IOException {
        ChargeurMagasin c = new ChargeurMagasin("../musicbrainzSimple");
        Magasin m = c.chargerMagasin();
        m.trierCd();
        String titre = m.getCd(12).getTitre();
        assertEquals("Worlds", titre);
    }


    @Test
    //test début de liste
    public void testTriArtiste_debut() throws IOException {
        ChargeurMagasin c = new ChargeurMagasin("../musicbrainzSimple");
        Magasin m = c.chargerMagasin();
        m.trierArtiste();
        String artiste = m.getCd(0).getArtiste();
        assertEquals("Benabar", artiste);
    }

    @Test
    //test fin de liste
    public void testTriArtiste_fin() throws IOException {
        ChargeurMagasin c = new ChargeurMagasin("../musicbrainzSimple");
        Magasin m = c.chargerMagasin();
        m.trierArtiste();
        String artiste = m.getCd(12).getArtiste();
        assertEquals("Zebda", artiste);
    }

}
