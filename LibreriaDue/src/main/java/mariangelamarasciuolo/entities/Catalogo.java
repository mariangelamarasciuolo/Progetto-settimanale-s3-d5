package mariangelamarasciuolo.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "catalogo")
public abstract class Catalogo {
    @Id
    @GeneratedValue
    private long ISBN;
    private String titolo;
    private int annoPubblicazione;
    private int pagine;

    public Catalogo(String titolo, int annoPubblicazione, int pagine) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.pagine = pagine;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", pagine=" + pagine +
                '}';
    }
}
