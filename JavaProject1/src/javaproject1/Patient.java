/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;

import java.util.ArrayList;
import java.util.Scanner;
import javaproject1.VitalSigns;

/**
 *
 * @author gowth
 */
public class Patient {

    @Override
    public String toString() {
        return "Patient{" + "patientId=" + patientId + ", name=" + name + ", age=" + age + '}';
    }
    
    
    public int patientId;
    //public MainClass patientarray;
    public String name;
    public int age;
    public VitalSigns currentVital;
    public ArrayList<VitalSigns> history;
    public ArrayList<Patient> patientarray;
    
    
    public VitalSigns getCurrentVital() {
        return currentVital;
    }

    public void setCurrentVital(VitalSigns currentVital) {
        this.currentVital = currentVital;
    }

    public ArrayList<Patient> getPatientarray() {
        return patientarray;
    }

    public void setPatientarray(ArrayList<Patient> patientarray) {
        this.patientarray = patientarray;
    }

    
    public Patient(){
        this.history = new ArrayList<VitalSigns>();
    }

   public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public VitalSigns getPatienthealth() {
        return currentVital;
    }

    public void setPatienthealth(VitalSigns currentVital) {
        this.currentVital = currentVital;
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
   public  void addpatient(Patient patientId){
       
        
    } 
    
    public void addVitals(VitalSigns vitals){
        // if the current vital is empty at first, we need not puish the current to history.
        if(currentVital == null){
            this.currentVital = vitals;
        }
        else{
            //if there is any current vital, we need to push it to history and 
            this.history.add(currentVital);
            this.currentVital = vitals;
        }
    }
 
    public boolean ispatientnormal(){
   
       int respiratory_rate = currentVital.getRespiratory_rate();
       int heart_rate = currentVital.getHeart_rate();
       int blood_pressure = currentVital.getBlood_presure();
       double weight = currentVital.getWeight();
       double pounds = currentVital.getPounds();
        
      String agegroup = Calculateage(age);
        
     switch(agegroup){
         case "newborn":
             if (respiratory_rate >= 30 && respiratory_rate <= 50 && heart_rate >= 120 && heart_rate <= 160 && blood_pressure >= 50 && blood_pressure <= 70 && weight >= 2 && weight <=3 && pounds >= 4.5 && pounds <= 7){
                 return true;
             }else {
                 return false;
             } 
             
         case "infant":
             if (respiratory_rate >= 20 && respiratory_rate <= 30 && heart_rate >= 80 && heart_rate <= 140 && blood_pressure >= 70 && blood_pressure <= 100 && weight >= 4 && weight <=10 && pounds >= 9 && pounds <= 22){
                 return true;
             }else {
                 return false;
             }    
             
                 
         case "toddler":
             if (respiratory_rate >= 20 && respiratory_rate <= 30 && heart_rate >= 80 && heart_rate <= 130 && blood_pressure >= 80 && blood_pressure <= 110 && weight >= 10 && weight <=14 && pounds >= 22 && pounds <= 31){
                 return true;
             }else {
                 return false;
             }   
             
           case "preschooler":
             if (respiratory_rate >= 20 && respiratory_rate <= 30 && heart_rate >= 80 && heart_rate <= 120 && blood_pressure >= 80 && blood_pressure <= 110 && weight >= 14 && weight <=18 && pounds >= 31 && pounds <= 40){
                 return true;
             }else {
                 return false;
             } 
             
               case "schoolage":
                
             if (respiratory_rate >= 20 && respiratory_rate <= 30 && heart_rate >= 70 && heart_rate <= 110 && blood_pressure >= 80 && blood_pressure <= 120 && weight >= 20 && weight <=42 && pounds >= 41 && pounds <= 92){
                 return true;
             }else {
                 return false;
             } 
             
                case "adolescent":
             if (respiratory_rate >= 12 && respiratory_rate <= 20 && heart_rate >= 55 && heart_rate <= 105 && blood_pressure >= 110 && blood_pressure <= 120 && weight >= 50 && pounds >= 110){
                 return true;
             }else {
                 return false;
             } 
     }
             
        return true;
}
    
    public boolean isThisVitalSignNormal(String VitalSign){
        
         boolean flag = false;
        switch(VitalSign){
         
            case "BloodPressure":
                if (age == 12 && currentVital.getBlood_presure() >= 50 && currentVital.getBlood_presure() <= 70){
                  flag = true;
                } else{
                    flag = false;
                }
        }
        return flag;
       
    }

    private String Calculateage(int age) {
       
         if (age == 0){           
             return  "newborn";               
    }  else if (age ==1) {
             return "infant"; 
         } else if (age >1 && age <= 3 ){
             return "toddler";
         } else if (age >3 && age <=5){
             return "preschooler";
         } else if (age >=6 && age <=12){
             return "schoolage";
         } else  {
             return "adolescent";
         }
    }
}
