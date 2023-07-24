package esercizioPasquale;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OrdineElettronico implements Ordine {
    private Map<String, Integer> prodottiQuantita;
    private Set<String> prodottiUnici;

    public OrdineElettronico() {
        prodottiQuantita = new HashMap<>();
        prodottiUnici = new HashSet<>();
    }

    public void aggiungiProdotto(String nomeProdotto, int quantita) {
        if (prodottiQuantita.containsKey(nomeProdotto)) {
            int vecchiaQuantita = prodottiQuantita.get(nomeProdotto);
            prodottiQuantita.put(nomeProdotto, vecchiaQuantita + quantita);
        } else {
            prodottiQuantita.put(nomeProdotto, quantita);
            prodottiUnici.add(nomeProdotto);
        }
    }

    public void rimuoviProdotto(String nomeProdotto, int quantita) {
        if (prodottiQuantita.containsKey(nomeProdotto)) {
            int vecchiaQuantita = prodottiQuantita.get(nomeProdotto);
            if (vecchiaQuantita > quantita) {
                prodottiQuantita.put(nomeProdotto, vecchiaQuantita - quantita);
            } else {
                prodottiQuantita.remove(nomeProdotto);
                prodottiUnici.remove(nomeProdotto);
            }
        }
    }

    public Map<String, Integer> getProdottiQuantita() {
        return prodottiQuantita;
    }

    public Set<String> getProdottiUnici() {
        return prodottiUnici;
    }

    @Override
    public void aggiungiProdotto(Prodotto prodotto, Integer quantità) {

    }

    @Override
    public void rimuoviProdotto(Prodotto prodotto, Integer quantità) {

    }

    @Override
    public double calcoloTotale() {
        return 0;
    }
}
