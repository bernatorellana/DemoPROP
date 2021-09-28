package edu.upc.prop.lab.s1;

import java.util.Objects;

/**
 *
 * @author bernat
 */
public class Propietari {
    String NIF;
    String nom;

    public Propietari(String NIF, String nom) {
        setNIF(NIF);
        setNom(nom);
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
