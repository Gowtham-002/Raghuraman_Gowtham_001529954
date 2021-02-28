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
public class PatientDirectory {
    public ArrayList<Patient> patientdirectory;
    
    PatientDirectory(){
        this.patientdirectory = new ArrayList<Patient>();
    }
    
      
   public Patient GetPatient(int id){
       Patient patient = null;
       for(Patient pat: this.patientdirectory){
           if(pat.getPersonID() == id){
               patient = pat;
           }
       }
       return patient;
   }
    
    public void addpatient(Patient P){
    this.patientdirectory.add(P);
}

    public ArrayList<Patient> getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(ArrayList<Patient> patientdirectory) {
        this.patientdirectory = patientdirectory;
    }
}
