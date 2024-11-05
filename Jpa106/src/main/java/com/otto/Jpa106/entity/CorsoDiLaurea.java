package com.otto.Jpa106.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class CorsoDiLaurea {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private int anno;


    private String facolta;


    @OneToMany(mappedBy = "corsoLaurea")
    private Set<Studente> studenti;




    public CorsoDiLaurea() {
    }

    public CorsoDiLaurea(int id, int anno, String facolta) {
        this.id = id;
        this.anno = anno;
        this.facolta = facolta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getFacolta() {
        return facolta;
    }

    public void setFacolta(String facolta) {
        this.facolta = facolta;
    }
}
