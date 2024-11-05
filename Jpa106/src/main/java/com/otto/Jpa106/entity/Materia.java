package com.otto.Jpa106.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity

public class Materia {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descrizione;


    @ManyToMany
    @JoinTable(name = "MATERIE_SOSTENUTE",
            joinColumns = @JoinColumn (name = "id_materia"),
            inverseJoinColumns = @JoinColumn(name = "id_studente"))
    private Set<Studente> studenti;


    public Materia() {
    }

    public Materia(int id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
