/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;

import java.util.ArrayList;

/**
 *
 * @author gowth
 */
public class EncounterHistory {
    public ArrayList<Encounter> encounterhistory;
    public Encounter encounter;

    public EncounterHistory() {
        this.encounterhistory = new ArrayList<Encounter>();
        this.encounter = new Encounter();
    }

    public int GetSize(){
        return this.encounterhistory.size();
    }
    
    public void addencounter(Encounter e){
        this.encounterhistory.add(e);
    }
    public ArrayList<Encounter> getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(ArrayList<Encounter> encounterhistory) {
        this.encounterhistory = encounterhistory;
    }
    public Encounter addEncounterHistory(){
        encounter = new Encounter();
        this.encounterhistory.add(encounter);
        return encounter;
    }
    
    
}
