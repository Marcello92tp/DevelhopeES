package esercizioPasquale;

public interface Ordine {

        void aggiungiProdotto(Prodotto prodotto, Integer quantità);
        void rimuoviProdotto(Prodotto prodotto, Integer quantità);
    double calcoloTotale();
}

