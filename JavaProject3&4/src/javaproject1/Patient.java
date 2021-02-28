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
public class Patient extends Person {

    public Patient(Person p) {
        this.Age = p.Age;
        this.PersonFname = p.PersonFname;
        this.PersonLname = p.PersonLname;
        this.PersonID = p.PersonID;
        this.encounterhistory = new EncounterHistory();
    }

    public EncounterHistory encounterhistory;

    public EncounterHistory getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(EncounterHistory encounterhistory) {
        this.encounterhistory = encounterhistory;
    }

    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int PersonID) {
        this.PersonID = PersonID;
    }

    public String getPersonFname() {
        return PersonFname;
    }

    public void setPersonFname(String PersonFname) {
        this.PersonFname = PersonFname;
    }

    public String getPersonLname() {
        return PersonLname;
    }

    public void setPersonLname(String PersonLname) {
        this.PersonLname = PersonLname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public boolean ispatientnormal() {

        Encounter e = encounterhistory.getEncounterhistory().get(encounterhistory.GetSize() - 1);
        VitalSigns v = e.getVitalsigns();

        int age = this.Age;

        int respiratory_rate = v.getRespiratory_rate();
        int heart_rate = v.getHeart_rate();
        int blood_pressure = v.getBlood_presure();
        double weight = v.getWeight();
        double pounds = v.getPounds();

        String agegroup = Calculateage(age);

        switch (agegroup) {
            case "newborn":
                if (respiratory_rate >= 30 && respiratory_rate <= 50 && heart_rate >= 120 && heart_rate <= 160 && blood_pressure >= 50 && blood_pressure <= 70 && weight >= 2 && weight <= 3 && pounds >= 4.5 && pounds <= 7) {
                    return true;
                } else {
                    return false;
                }

            case "infant":
                if (respiratory_rate >= 20 && respiratory_rate <= 30 && heart_rate >= 80 && heart_rate <= 140 && blood_pressure >= 70 && blood_pressure <= 100 && weight >= 4 && weight <= 10 && pounds >= 9 && pounds <= 22) {
                    return true;
                } else {
                    return false;
                }

            case "toddler":
                if (respiratory_rate >= 20 && respiratory_rate <= 30 && heart_rate >= 80 && heart_rate <= 130 && blood_pressure >= 80 && blood_pressure <= 110 && weight >= 10 && weight <= 14 && pounds >= 22 && pounds <= 31) {
                    return true;
                } else {
                    return false;
                }

            case "preschooler":
                if (respiratory_rate >= 20 && respiratory_rate <= 30 && heart_rate >= 80 && heart_rate <= 120 && blood_pressure >= 80 && blood_pressure <= 110 && weight >= 14 && weight <= 18 && pounds >= 31 && pounds <= 40) {
                    return true;
                } else {
                    return false;
                }

            case "schoolage":

                if (respiratory_rate >= 20 && respiratory_rate <= 30 && heart_rate >= 70 && heart_rate <= 110 && blood_pressure >= 80 && blood_pressure <= 120 && weight >= 20 && weight <= 42 && pounds >= 41 && pounds <= 92) {
                    return true;
                } else {
                    return false;
                }

            case "adolescent":
                if (respiratory_rate >= 12 && respiratory_rate <= 20 && heart_rate >= 55 && heart_rate <= 105 && blood_pressure >= 110 && blood_pressure <= 120 && weight >= 50 && pounds >= 110) {
                    return true;
                } else {
                    return false;
                }
        }

        return true;
    }

    /*public boolean isThisVitalSignNormal(String VitalSign){
        
         Encounter e = encounterhistory.getEncounterhistory().get(encounterhistory.GetSize()-1);
        VitalSigns v = e.getVitalsigns();
        
         boolean flag = false;
        switch(VitalSign){
         
            case "BloodPressure":
                if (this.Age == 12 && v.getBlood_presure() >= 50 && v.getBlood_presure() <= 70){
                  flag = true;
                } else{
                    flag = false;
                }
        }
        return flag;
       
    } */
    public boolean isThisVitalSignNormal(String VitalSign) {

        boolean flag = false;
        Encounter e = this.encounterhistory.encounterhistory.get(this.encounterhistory.GetSize()-1);
        VitalSigns v = e.getVitalsigns();
        String agegroup = Calculateage(this.Age);
        if (VitalSign.equals("Blood Pressure")) {
            
            switch (agegroup) {
                
                case "newborn":
                    if (v.getBlood_presure() >= 50 && v.getBlood_presure() <= 70) {
                        flag = true;
                    } else {
                        flag = false;
                    }

                case "infant":
                    if (v.getBlood_presure() >= 70 && v.getBlood_presure() <= 100) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "toddler":
                    if (v.getBlood_presure() >= 80 && v.getBlood_presure() <= 110) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "preschooler":
                    if (v.getBlood_presure() >= 80 && v.getBlood_presure() <= 110) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "schoolage":
                    if (v.getBlood_presure() >= 80 && v.getBlood_presure() <= 120) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "adolescent":
                   // System.out.println(v.getBlood_presure());
                    if (v.getBlood_presure() >= 110 && v.getBlood_presure() <= 120) {
                        
                        flag = true;
                    } else {
                        
                        flag = false;
                    }
            }
        }
        if (VitalSign.equals("Heart Rate")) {
            switch (agegroup) {
                case "newborn":
                    if (v.getHeart_rate() >= 50 && v.getHeart_rate() <= 70) {
                        flag = true;
                    } else {
                        flag = false;
                    }

                case "infant":
                    if (v.getHeart_rate() >= 120 && v.getHeart_rate() <= 160) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "toddler":
                    if (v.getHeart_rate() >= 80 && v.getHeart_rate() <= 140) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "preschooler":
                    if (v.getHeart_rate() >= 80 && v.getHeart_rate() <= 130) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "schoolage":
                    if (v.getHeart_rate() >= 80 && v.getHeart_rate() <= 120) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "adolescent":
                    if (v.getHeart_rate() >= 70 && v.getHeart_rate() <= 110) {
                        flag = true;
                    } else {
                        flag = false;
                    }
            }
        }
        if (VitalSign.equals("Respiratory Rate")) {
            switch (agegroup) {
                case "newborn":
                    if (v.getRespiratory_rate() >= 50 && v.getRespiratory_rate() <= 70) {
                        flag = true;
                    } else {
                        flag = false;
                    }

                case "infant":
                    if (v.getRespiratory_rate() >= 30 && v.getRespiratory_rate() <= 50) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "toddler":
                    if (v.getRespiratory_rate() >= 20 && v.getRespiratory_rate() <= 30) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "preschooler":
                    if (v.getRespiratory_rate() >= 20 && v.getRespiratory_rate() <= 30) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "schoolage":
                    if (v.getRespiratory_rate() >= 20 && v.getRespiratory_rate() <= 30) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "adolescent":
                    System.out.println("respiratory rate is "+v.getRespiratory_rate());
                    if (v.getRespiratory_rate() >= 12 && v.getRespiratory_rate() <= 20) {
                        flag = true;
                    } else {
                        flag = false;
                    }
            }
        }
        if (VitalSign.equals("Weight")) {
            switch (agegroup) {
                case "newborn":
                    if (v.getWeight() >= 2 && v.getWeight() <= 3) {
                        flag = true;
                    } else {
                        flag = false;
                    }

                case "infant":
                    if (v.getWeight() >= 4 && v.getWeight() <= 10) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "toddler":
                    if (v.getWeight() >= 10 && v.getWeight() <= 14) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "preschooler":
                    if (v.getWeight() >= 14 && v.getWeight() <= 18) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "schoolage":
                    if (v.getWeight() >= 20 && v.getWeight() <= 42) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "adolescent":
                    if (v.getWeight() >= 50) {
                        flag = true;
                    } else {
                        flag = false;
                    }
            }
        }
        if (VitalSign.equals("Pounds")) {
            switch (agegroup) {
                case "newborn":
                    if (v.getPounds() >= 4.5 && v.getPounds() <= 7) {
                        flag = true;
                    } else {
                        flag = false;
                    }

                case "infant":
                    if (v.getPounds() >= 9 && v.getPounds() <= 22) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "toddler":
                    if (v.getPounds() >= 22 && v.getPounds() <= 31) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "preschooler":
                    if (v.getPounds() >= 31 && v.getPounds() <= 40) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "schoolage":
                    if (v.getPounds() >= 41 && v.getPounds() <= 92) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                case "adolescent":
                    if (v.getPounds() >= 110) {
                        flag = true;
                    } else {
                        flag = false;
                    }
            }
        }
        /* switch(VitalSign){
            case "Blood Pressure":
                if (age == 12 && this.blood_presure >= 50 && this.blood_presure <= 70){
                  
                flag = true;
                } else{
                    flag = false;
                }
        }*/
        //return flag;
       
        return flag;
    }

    private String Calculateage(int age) {

        if (age == 0) {
            return "newborn";
        } else if (age == 1) {
            return "infant";
        } else if (age > 1 && age <= 3) {
            return "toddler";
        } else if (age > 3 && age <= 5) {
            return "preschooler";
        } else if (age >= 6 && age <= 12) {
            return "schoolage";
        } else {
            return "adolescent";
        }
    }
}
