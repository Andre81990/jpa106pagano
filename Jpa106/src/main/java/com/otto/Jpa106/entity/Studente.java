package com.otto.Jpa106.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Studente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int matricola;

    private String name;

    private String cognome;

    public Studente() {
    }

    public Studente(int matricola, String name, String cognome) {
        this.matricola = matricola;
        this.name = name;
        this.cognome = cognome;
    }

    @OneToOne
    @JoinColumn(name = "id_indirizzo")
    private Indirizzo indirizzo;


    @ManyToOne
    @JoinColumn(name = "id_corso_laurea")
    private CorsoDiLaurea corsoLaurea;


    @ManyToMany
    @JoinTable(name = "MATERIE_SOSTENUTE",
    joinColumns = @JoinColumn (name = "id_studente"),
            inverseJoinColumns = @JoinColumn(name = "id_materia"))
    private Set<Materia> materieSostenute;





    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
