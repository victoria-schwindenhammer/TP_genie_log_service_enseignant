/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

import java.util.Date;

/**
 *
 * @author Eliane
 */
public class Intervention { 
    public Date debut;
    public int duree; 
    public boolean annulee = false ;

    public Intervention(Date debut, int duree) {
        this.debut = debut;
        this.duree = duree; 
    }

    public Date getDebut() {
        return debut;
    }

    public int getDuree() {
        return duree;
    }

    public boolean isAnnulee() {
        return annulee;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void annulerIntervention() {
        annulee = true; 
    }
    
}
