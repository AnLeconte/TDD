package Exo4;

import org.example.Exo4.RechercheVille;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;


public class RechercheVilleTest {

    private static RechercheVille rechercheVille;

    @BeforeAll
    public static void setup() {
        rechercheVille = new RechercheVille();
        rechercheVille.setVilles(Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver",
                "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok",
                "Hong Kong", "Dubaï", "Rome", "Istanbul"));
    }

    @Test
    public void testRechercheMoinsDeDeuxCaracteres() {
        assertThrows(IllegalArgumentException.class, () -> {
            rechercheVille.rechercher("A");
        });
    }

}


