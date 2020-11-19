/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

/**
 *
 * @author Eliane
 */
public class Salle {
    public String intitule;
    public int capacite;
    
    public Salle(String intitule, int capacite) {
        this.intitule=intitule;
        this.capacite=capacite;         
    }

    public String getIntitule() {
        return intitule;
    }

    public int getCapacite() {
        return capacite;
    }

    @Override
    public String toString() {
        return "Salle{" + "intitule=" + intitule + ", capacite=" + capacite + '}';
    }

    
    
}
