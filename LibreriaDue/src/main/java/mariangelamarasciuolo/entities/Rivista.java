package mariangelamarasciuolo.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "riviste")
public class Rivista extends Catalogo {

    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public Rivista() {
    }
    public Rivista(String titolo, int annoPubblicazione, int pagine, Periodicita periodicita) {
        super(titolo, annoPubblicazione, pagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" + super.toString() +
                "periodicita=" + periodicita +
                '}';
    }
}
