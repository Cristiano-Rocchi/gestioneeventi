package cristianorocchi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

enum Sesso {
    MASCHIO, FEMMINA
}

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;
    private String cognome;
    private String email;

    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;

    @Enumerated(EnumType.STRING)
    private Sesso sesso;

    @Column(name = "lista_partecipazioni")
    private String listaPartecipazioni;

    public Persona() {
    }

    public Persona(String nome, String cognome, String email, LocalDate dataDiNascita, Sesso sesso, String listaPartecipazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.sesso = sesso;
        this.listaPartecipazioni = listaPartecipazioni;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public String getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setListaPartecipazioni(String listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }
}
