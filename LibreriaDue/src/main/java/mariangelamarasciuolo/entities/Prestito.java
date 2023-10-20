package mariangelamarasciuolo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "utente")
public class Prestito {
    private UUID id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Catalogo elementoPrestato;
    @ManyToOne(cascade = CascadeType.ALL)
    private Utente utente;
    private LocalDate dataInizioPrestito;
    private LocalDate dataRestituzionePrevista;
    private LocalDate dataRestituzuioneEffettiva;

    public Prestito(Utente utente, Catalogo elementoPrestato, LocalDate dataInizioPrestito, LocalDate dataRestituzionePrevista, LocalDate dataRestituzuioneEffettiva) {
        this.utente = utente;
        this.elementoPrestato = elementoPrestato;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataRestituzionePrevista.plusDays(30);
        this.dataRestituzuioneEffettiva = dataRestituzuioneEffettiva;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Catalogo getElementoPrestato() {
        return elementoPrestato;
    }

    public void setElementoPrestato(Catalogo elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public LocalDate getInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setInizioPrestito(LocalDate inizioPrestito) {
        this.dataInizioPrestito = inizioPrestito;
    }

    public LocalDate getFinePrevistaPrestito() {
        return dataRestituzionePrevista;
    }

    public void setFinePrevistaPrestito(LocalDate finePrevistaPrestito) {
        this.dataRestituzionePrevista = finePrevistaPrestito;
    }

    public LocalDate getFinePrestito() {
        return dataRestituzuioneEffettiva;
    }

    public void setFinePrestito(LocalDate finePrestito) {
        this.dataRestituzuioneEffettiva = finePrestito;
    }

}
