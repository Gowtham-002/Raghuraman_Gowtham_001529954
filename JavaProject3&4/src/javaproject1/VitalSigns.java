/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javaproject1.Vitalhistory;
import java.util.Scanner;
import javaproject1.Patient;

/**
 *
 * @author gowth
 */
public class VitalSigns {

    @Override
    public String toString() {
        return "VitalSigns{" + "respiratory_rate=" + respiratory_rate + ", heart_rate=" + heart_rate + ", blood_presure=" + blood_presure + ", weight=" + weight + ", pounds=" + pounds + '}';
    }

 
   
    private int respiratory_rate;
    private int heart_rate;
    private int blood_presure;
    private double weight;
    private double pounds;
    private LocalDateTime date;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

  

    public int getRespiratory_rate() {
        return respiratory_rate;
    }

    public void setRespiratory_rate(int respiratory_rate) {
        this.respiratory_rate = respiratory_rate;
    }

    public int getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }

    public int getBlood_presure() {
        return blood_presure;
    }

    public void setBlood_presure(int blood_presure) {
        this.blood_presure = blood_presure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPounds() {
        return pounds;
    }

    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    
     
    public boolean ispatientnormal(int age){
   
       int respiratory_rate = this.respiratory_rate;
       int heart_rate = this.heart_rate;
       int blood_pressure = this.blood_presure;
       double weight = this.weight;
       double pounds = this.pounds;
        
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

    public boolean isThisVitalSignNormal(String VitalSign,int age){
        
        boolean flag = false;
        
         String agegroup = Calculateage(age);
         
         if (VitalSign == "Blood Pressure"){
             switch(agegroup){
                 case "newborn":
                     if(this.blood_presure >= 50 && this.blood_presure <= 70){
                      flag = true;   
             } else{
                    flag = false;  
                     }
                     
                  case "infant":
                     if(this.blood_presure >= 70 && this.blood_presure <= 100){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "toddler":
                     if(this.blood_presure >= 80 && this.blood_presure <= 110){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "preschooler":
                     if(this.blood_presure >= 80 && this.blood_presure <= 110){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "schoolage":
                     if(this.blood_presure >= 80 && this.blood_presure <= 120){
                      flag = true;   
             } else{
                    flag = false;  
                     }
                     case "adolescent":
                     if(this.blood_presure >= 110 && this.blood_presure <= 120){
                      flag = true;   
             } else{
                    flag = false;  
                     }
         }
         }  
              if (VitalSign == "Heart Rate"){
             switch(agegroup){
                 case "newborn":
                     if(this.heart_rate >= 50 && this.heart_rate <= 70){
                      flag = true;   
             } else{
                    flag = false;  
                     }
                     
                  case "infant":
                     if(this.heart_rate >= 120 && this.heart_rate <= 160){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "toddler":
                     if(this.heart_rate >= 80 && this.heart_rate <= 140){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "preschooler":
                     if(this.heart_rate >= 80 && this.heart_rate <= 130){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "schoolage":
                     if(this.heart_rate >= 80 && this.heart_rate <= 120){
                      flag = true;   
             } else{
                    flag = false;  
                     }
                     case "adolescent":
                     if(this.heart_rate >= 70 && this.heart_rate <= 110){
                      flag = true;   
             } else{
                    flag = false;  
                     }
         }
              }  
             if (VitalSign == "Respiratory Rate"){
             switch(agegroup){
                 case "newborn":
                     if(this.respiratory_rate >= 50 && this.respiratory_rate <= 70){
                      flag = true;   
             } else{
                    flag = false;  
                     }
                     
                  case "infant":
                     if(this.respiratory_rate >= 30 && this.respiratory_rate <= 50){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "toddler":
                     if(this.respiratory_rate >= 20 && this.respiratory_rate <= 30){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "preschooler":
                     if(this.respiratory_rate >= 20 && this.respiratory_rate <= 30){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "schoolage":
                     if(this.respiratory_rate >= 20 && this.respiratory_rate <= 30){
                      flag = true;   
             } else{
                    flag = false;  
                     }
                     case "adolescent":
                     if(this.respiratory_rate >= 12 && this.respiratory_rate <= 20){
                      flag = true;   
             } else{
                    flag = false;  
                     }
         }
             }
             if (VitalSign == "Weight"){
             switch(agegroup){
                 case "newborn":
                     if(this.weight >= 2 && this.weight <= 3){
                      flag = true;   
             } else{
                    flag = false;  
                     }
                     
                  case "infant":
                     if(this.weight >= 4 && this.weight <= 10){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "toddler":
                     if(this.weight >= 10 && this.weight <= 14){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "preschooler":
                     if(this.weight >= 14 && this.weight <= 18){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "schoolage":
                     if(this.weight >= 20 && this.weight <= 42){
                      flag = true;   
             } else{
                    flag = false;  
                     }
                     case "adolescent":
                     if(this.weight >=50){
                      flag = true;   
             } else{
                    flag = false;  
                     }
         }
             }  
             if (VitalSign == "Pounds"){
             switch(agegroup){
                 case "newborn":
                     if(this.pounds >= 4.5 && this.pounds <= 7){
                      flag = true;   
             } else{
                    flag = false;  
                     }
                     
                  case "infant":
                     if(this.pounds >= 9 && this.pounds <= 22){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "toddler":
                     if(this.pounds >= 22 && this.pounds <= 31){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "preschooler":
                     if(this.pounds >= 31 && this.pounds <= 40){
                      flag = true;   
             } else{
                    flag = false;  
                     }case "schoolage":
                     if(this.pounds >= 41 && this.pounds <= 92){
                      flag = true;   
             } else{
                    flag = false;  
                     }
                     case "adolescent":
                     if(this.pounds >=110){
                      flag = true;   
             } else{
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
    
    
}
             
              
              