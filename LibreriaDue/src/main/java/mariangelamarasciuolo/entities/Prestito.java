package mariangelamarasciuolo.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "prestiti")
public class Prestito {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Catalogo elementoPrestato;
    @ManyToOne(cascade = CascadeType.ALL)
    private Utente utente;
    private LocalDate dataInizioPrestito;
    private LocalDate dataRestituzionePrevista;
    private LocalDate dataRestituzuioneEffettiva;

    public Prestito(Catalogo elementoPrestato, Utente utente, LocalDate dataInizioPrestito, LocalDate dataRestituzionePrevista, LocalDate dataRestituzuioneEffettiva) {
        this.elementoPrestato = elementoPrestato;
        this.utente = utente;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataRestituzionePrevista;
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
