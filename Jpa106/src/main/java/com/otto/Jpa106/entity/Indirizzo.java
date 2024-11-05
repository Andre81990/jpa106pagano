package com.otto.Jpa106.entity;


import jakarta.persistence.*;

@Entity
public class Indirizzo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String via;
    private String civico;
    private String cap;
    private String citta;

    @OneToOne(mappedBy = "indirizzo")
    private Studente studente;

    public Indirizzo() {
    }

    public Indirizzo(int id, String via, String civico, String cap, String citta) {
        this.id = id;
        this.via = via;
        this.civico = civico;
        this.cap = cap;
        this.citta = citta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCivico() {
        return civico;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }
}
