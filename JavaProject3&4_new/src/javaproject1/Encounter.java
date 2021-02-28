/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;

import java.util.Date;

/**
 *
 * @author gowth
 */
public class Encounter {
    public Date date;
    public VitalSigns Vitalsigns;
    
    
    Encounter(){
        this.Vitalsigns = new VitalSigns();
    }
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public VitalSigns getVitalsigns() {
        return Vitalsigns;
    }

    public void setVitalsigns(VitalSigns Vitalsigns) {
        this.Vitalsigns = Vitalsigns;
    }
    
}
