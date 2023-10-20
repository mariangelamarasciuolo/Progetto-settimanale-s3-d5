package mariangelamarasciuolo.entities;

import javax.persistence.*;

@Entity
@Table(name = "libri")
public class Libro extends Catalogo {
    private String autore;
    private String genere;

    public Libro(String titolo, int annoPubblicazione, int pagine, String autore, String genere) {
        super(titolo, annoPubblicazione, pagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
