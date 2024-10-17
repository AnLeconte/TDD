package org.example.Exo4;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class RechercheVille {
    private List<String> villes;

    public void setVilles(List<String> villes) {
        this.villes = villes;
    }

    public List<String> rechercher(String mot) {
        if (mot.length() < 2) {
            throw new IllegalArgumentException();
        }

        List<String> resultats = new ArrayList<>();

        String motRecherche = mot.toLowerCase(Locale.ROOT);

        for (String ville : villes) {
            String villeLower = ville.toLowerCase(Locale.ROOT);

            if (motRecherche.equals("*")) {
                return new ArrayList<>(villes);
            }

            if (villeLower.startsWith(motRecherche) || villeLower.contains(motRecherche)) {
                resultats.add(ville);
            }
        }

        return resultats;
    }
}


