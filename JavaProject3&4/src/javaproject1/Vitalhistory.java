/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;

import javaproject1.VitalSigns;
import java.util.ArrayList;

/**
 *
 * @author gowth
 */
public class Vitalhistory {
    private ArrayList<VitalSigns> history;
    
    public Vitalhistory(){
        this.history = new ArrayList<VitalSigns>();
               
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addnewVitals(){
        VitalSigns newvitals = new VitalSigns();
        history.add(newvitals);
        return newvitals;
    }
    
}
