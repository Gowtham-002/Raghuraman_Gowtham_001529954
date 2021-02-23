/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date; 

/**
 *
 * @author gowth
 */
public class MainClass {
    public Patient patient;
    public static Patient GetPatient(ArrayList<Patient> patientArray, int patientId){
        Patient pa = null;
        for (int i = 0; i < patientArray.size();i++) 
	      { 
                  if (patientArray.get(i).patientId == patientId){
                      pa = patientArray.get(i);
                      }
                  
	      }
        return pa;
    }
    
    
      public static void main(String[] args) {
         
        ArrayList<Patient> patientarray = new ArrayList<Patient>();
        
  Scanner input = new Scanner(System.in);
   int count = 0;
   System.out.print("--------------Enter the patients details--------------\n");
   
   int userinput;
  

  do{
  
       System.out.print("Enter the below option to access patient data \n");
   System.out.print("press 1.To create new patient Data \n");
   System.out.print("      2.To view patient Data \n");
   System.out.print("      3.To Quit \n");
   System.out.print("Provide your input:");
   userinput = input.nextInt();
   //System.out.print("Enter Values from 1 to 3: ");
   //count = input.nextInt();
    switch(userinput){
        case 1:
            System.out.print("Enter patient ID: ");
            int patientId = input.nextInt();
            System.out.print("Enter patient's name: ");
            String name = input.next();
             System.out.println("Enter patient's age: ");
            int age = input.nextInt();
            System.out.println("Enter patients repiratory rate: ");
            int respiratory_rate = input.nextInt();
            System.out.println("Enter patient's heart rate: ");
            int heart_rate = input.nextInt();
            System.out.println("Enter patient's blood presure: ");
            int blood_presure = input.nextInt();
  
            System.out.println("Enter patients Weight: ");
            double weight = input.nextDouble();
  
            System.out.println("Enter patient's Pounds: ");
            double pounds = input.nextDouble();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
            Date date = new Date();  
      
            VitalSigns currentVital = new VitalSigns();
            currentVital.setBlood_presure(blood_presure);
            currentVital.setHeart_rate(heart_rate);
            currentVital.setRespiratory_rate(respiratory_rate);
            currentVital.setWeight(weight);
            currentVital.setPounds(pounds);
            currentVital.setDate(formatter.format(date));
  
  
  
            Patient existingPatient = GetPatient(patientarray, patientId);

            if(existingPatient!= null ){
                existingPatient.addVitals(currentVital);

            }
            else{
                Patient patient = new Patient();
                patient.setPatientId(patientId);
                patient.setAge(age);
                patient.setName(name);
                patient.addVitals(currentVital);
                patientarray.add(patient);
            }
  //patient.addpatient(patient);
  
            Boolean ispatientnormal = currentVital.ispatientnormal(age);
  

  
                System.out.println("Enter one among the below  ");
                System.out.println("1.Check all Vital Signs are Normal");
                System.out.println("2.Check particular Vital Sign");
                System.out.println("3.To Exit");
                System.out.println("Enter Your input: ");
               int CheckVital = input.nextInt();
               input.nextLine();
               if(CheckVital ==1){
                   if (ispatientnormal == true) {
                                System.out.println("The patient " +name + " is Normal");

                            } else {
                              System.out.println("The patient " +name +" is Abnormal");  

                            }
               }
               else {
                   System.out.println("Enter one among the below Vital Sign \n");
                            System.out.println("Blood Pressure  Heart Rate  Respiratory Rate  Weight  Pounds\n");
                            System.out.println("Enter Your input: ");
                           String VitalSign = input.nextLine();
                           Boolean isThisVitalSignNormal = currentVital.isThisVitalSignNormal(VitalSign,age);
                            if (isThisVitalSignNormal == true) {
                           System.out.println("The Vital Sign " +VitalSign + " is Normal");
                            }
                            else {
                         System.out.println("The patient Vital Sign " +VitalSign +" is Abnormal");
                            }
               }
               
               break;
               
        
            
               /*do{
                    switch(CheckVital){
                        case 1:
                            if (ispatientnormal == true) {
                                System.out.println("The patient " +name + " is Normal");

                            } else {
                              System.out.println("The patient " +name +" is Abnormal");  

                            }
                            CheckVital = 5;
                          break;
  
                        case 2:
                            System.out.println("Enter one among the below Vital Sign \n");
                            System.out.println("Blood Pressure  Heart Rate  Respiratory Rate  Weight in Kg  Weight in Pounds\n");
                            System.out.println("Enter Your input: \n");
                           String  VitalSign = input.next();
                           Boolean isThisVitalSignNormal = currentVital.isThisVitalSignNormal(VitalSign,age);
                            if (isThisVitalSignNormal == true) {
                           System.out.println("The Vital Sign " +VitalSign + " is Normal");
                            }
                            else {
                         System.out.println("The patient Vital Sign" +VitalSign +" is Abnormal");
                            }
                        CheckVital = 5;
                        break;    
       
                        case 3:
                             CheckVital = 5;
                            break;
                    }
                }while (CheckVital <= 3);
  
            break;*/

        case 2:
            System.out.println("Enter PatientID: ");
            int  patientid = input.nextInt();
   
            Patient checkpatient = GetPatient(patientarray, patientid);
            if(checkpatient != null){
                // System.out.println(checkpatient.toString());
           // System.out.println(checkpatient.getCurrentVital());
            System.out.println("Data for Patient "+checkpatient.getPatientId());
           // System.out.println("Patient's ID"+checkpatient.getPatientId());
     System.out.println("Patient's Name: "+checkpatient.getName());
     System.out.println("Patient's Age: "+checkpatient.getAge());
    System.out.println("Blood Pressure: "+checkpatient.getCurrentVital().getBlood_presure());
    System.out.println("Heart Rate: "+checkpatient.getCurrentVital().getHeart_rate());
    System.out.println("Respiratory Rate: "+checkpatient.getCurrentVital().getRespiratory_rate());
    System.out.println("Weight: "+checkpatient.getCurrentVital().getWeight());
    System.out.println("Pound: "+checkpatient.getCurrentVital().getPounds());
     System.out.println("DateTimeStamp: "+checkpatient.getCurrentVital().getDate());
            for(VitalSigns view: checkpatient.getHistory()){
               // System.out.println(v.toString());
               System.out.println("***************************************************");
               System.out.println("The Following Data are History Data of the Patient");
               System.out.println("Blood Pressure: "+view.getBlood_presure());
               System.out.println("Heart Rate: "+view.getHeart_rate());
               System.out.println("Respiratory Rate: "+view.getRespiratory_rate());
               System.out.println("Weight: "+view.getWeight());
               System.out.println("Pound: "+view.getPounds());
               System.out.println("DateTimeStamp: "+view.getDate());
               System.out.println("***************************************************");
                }
            }
            else{
                System.out.println("The patient is not present.");
            }
            
            break;
            
        case 3:
            System.out.println("Invalid Entry");
            System.exit(0);
            break;
    }

  
        

  
  }while(userinput <= 3);
         
 
   
  /*System.out.println("Enter patients age: ");
   = input.nextInt();
  
  isThisVitalSignNormal();*/
  
  
  /*for (int i = 0; i < patientarray.size();i++) 
	      { 
                 
	          System.out.println(patientarray.get(i).toString()); 
                  System.out.println(patientarray.get(i).currentVital.toString());
                  for (int j = 0; j < patientarray.size();j++){
                  System.out.println(patientarray.get(i).history.get(j).toString());
                  }
                                //System.out.println(patientarray.get(i).getHistory());
              
                  }*/
  
  
  for(Patient p: patientarray){
     // System.out.println(p.toString());
     // System.out.println(p.getCurrentVital());
      System.out.println("Patient's ID"+p.getPatientId());
     System.out.println("Patient's Name: "+p.getName());
     System.out.println("Patient's Age: "+p.getAge());
    System.out.println("Patient's Age: "+p.getCurrentVital().getBlood_presure());
      for(VitalSigns v: p.history){
          System.out.println(v.toString());
      }
  }
 
 /* for (int i = 0; i < patientarray.size();i++) 
	      { 
                  if (patientarray.get(i).patientId == patientID){
	          System.out.println(patientID); 
                  }
	      }*/ 
     }

    
}
