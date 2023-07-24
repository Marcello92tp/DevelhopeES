package esercizioPasquale;

import java.util.Objects;

public class Prodotto {
    private String Nome;
    private String Codice;

    public Prodotto(String nome, String codice, double prezzo) {
        Nome = nome;
        Codice = codice;
        Prezzo = prezzo;
    }

    private double Prezzo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prodotto prodotto)) return false;
        return Double.compare(prodotto.Prezzo, Prezzo) == 0 && Objects.equals(Nome, prodotto.Nome) && Objects.equals(Codice, prodotto.Codice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, Codice, Prezzo);
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "Nome='" + Nome + '\'' +
                ", Codice='" + Codice + '\'' +
                ", Prezzo=" + Prezzo +
                '}';
    }
}
