package esercizioPasquale;

public class ProdottoElettronico extends Prodotto {
    private String marca;
    private String modello;

    public ProdottoElettronico(String nome, String codice, double prezzo, String marca, String modello) {
        super(nome, codice, prezzo);
        this.marca = marca;
        this.modello = modello;
    }
}
