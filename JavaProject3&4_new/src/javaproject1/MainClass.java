/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject1;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author gowth
 */
public class MainClass {

    //public Patient patient;

    /*public static Patient GetPatient(ArrayList<Patient> patientArray, int patientId){
        Patient pa = null;
        for (int i = 0; i < patientArray.size();i++) 
	      { 
                  if (patientArray.get(i).patientId == patientId){
                      pa = patientArray.get(i);
                      }
                  
	      }
        return pa;
    }*/
    public static void main(String[] args) {

        //  ArrayList<Patient> patientarray = new ArrayList<Patient>();
        PatientDirectory patienthistory = new PatientDirectory();
        PersonDirectory persond = new PersonDirectory();
        EncounterHistory encounterHistory = new EncounterHistory();
        City c = new City();

        Encounter encounter = new Encounter();
        VitalSigns vital = new VitalSigns();

        Person person2 = new Person();
        person2.setPersonFname("Aditya");
        person2.setPersonLname("Ganesh");
        person2.setAge(20);
        person2.setPersonID(104);
        persond.addperson(person2);

        Person person = new Person();
        person.setPersonFname("Gowtham");
        person.setPersonLname("Raghuraman");
        person.setAge(13);
        person.setPersonID(100);
        persond.addperson(person);

        Person person3 = new Person();
        person3.setPersonFname("Virat");
        person3.setPersonLname("Kohli");
        person3.setAge(50);
        person3.setPersonID(102);
        persond.addperson(person3);

        Person person4 = new Person();
        person4.setPersonFname("Kenu");
        person4.setPersonLname("Reves");
        person4.setAge(30);
        person4.setPersonID(103);
        persond.addperson(person4);

        Person person5 = new Person();
        person5.setPersonFname("Viru");
        person5.setPersonLname("Sehwag");
        person5.setAge(10);
        person5.setPersonID(105);
        persond.addperson(person5);

        Person person6 = new Person();
        person6.setPersonFname("Sachin");
        person6.setPersonLname("Tendulkar");
        person6.setAge(3);
        person6.setPersonID(106);
        persond.addperson(person6);

        Person person7 = new Person();
        person7.setPersonFname("Chris");
        person7.setPersonLname("Lynn");
        person7.setAge(1);
        person7.setPersonID(107);
        persond.addperson(person7);

        Patient patient1 = new Patient(person);
        patienthistory.addpatient(patient1);

        VitalSigns vits1 = new VitalSigns();
        vits1.setBlood_presure(112);
        vits1.setHeart_rate(78);
        vits1.setRespiratory_rate(13);
        vits1.setWeight(80);
        vits1.setPounds(120);
        vits1.setDate(LocalDateTime.now());
        Encounter enc = new Encounter();
        enc.setVitalsigns(vits1);
        enc.setDate(new Date());
        patient1.encounterhistory.addencounter(enc);

        Patient patient2 = new Patient(person2);
        patienthistory.addpatient(patient2);

        VitalSigns vits2 = new VitalSigns();
        vits2.setBlood_presure(115);
        vits2.setHeart_rate(60);
        vits2.setRespiratory_rate(18);
        vits2.setWeight(100);
        vits2.setPounds(120);
        vits2.setDate(LocalDateTime.now());

        Encounter enc1 = new Encounter();
        enc1.setVitalsigns(vits2);
        enc1.setDate(new Date());
        patient2.encounterhistory.addencounter(enc1);

        Patient patient3 = new Patient(person3);
        patienthistory.addpatient(patient3);

        VitalSigns vits3 = new VitalSigns();
        vits3.setBlood_presure(110);
        vits3.setHeart_rate(72);
        vits3.setRespiratory_rate(13);
        vits3.setWeight(90);
        vits3.setPounds(120);
        vits3.setDate(LocalDateTime.now());
        Encounter enc2 = new Encounter();
        enc2.setVitalsigns(vits3);
        enc2.setDate(new Date());
        patient3.encounterhistory.addencounter(enc2);

        Patient patient4 = new Patient(person4);
        patienthistory.addpatient(patient4);

        VitalSigns vits4 = new VitalSigns();
        vits4.setBlood_presure(118);
        vits4.setHeart_rate(60);
        vits4.setRespiratory_rate(13);
        vits4.setWeight(100);
        vits4.setPounds(120);
        vits4.setDate(LocalDateTime.now());
        Encounter enc3 = new Encounter();
        enc3.setVitalsigns(vits4);
        enc3.setDate(new Date());
        patient4.encounterhistory.addencounter(enc3);

        Patient patient5 = new Patient(person5);
        patienthistory.addpatient(patient5);

        VitalSigns vits5 = new VitalSigns();
        vits5.setBlood_presure(105);
        vits5.setHeart_rate(78);
        vits5.setRespiratory_rate(13);
        vits5.setWeight(80);
        vits5.setPounds(120);
        vits5.setDate(LocalDateTime.now());
        Encounter enc4 = new Encounter();
        enc4.setVitalsigns(vits5);
        enc4.setDate(new Date());
        patient5.encounterhistory.addencounter(enc4);

        Patient patient6 = new Patient(person6);
        patienthistory.addpatient(patient6);

        VitalSigns vits6 = new VitalSigns();
        vits6.setBlood_presure(105);
        vits6.setHeart_rate(78);
        vits6.setRespiratory_rate(13);
        vits6.setWeight(80);
        vits6.setPounds(120);
        vits6.setDate(LocalDateTime.now());
        Encounter enc5 = new Encounter();
        enc5.setVitalsigns(vits6);
        enc5.setDate(new Date());
        patient6.encounterhistory.addencounter(enc5);

        Patient patient7 = new Patient(person7);
        patienthistory.addpatient(patient7);

        VitalSigns vits7 = new VitalSigns();
        vits7.setBlood_presure(80);
        vits7.setHeart_rate(78);
        vits7.setRespiratory_rate(13);
        vits7.setWeight(80);
        vits7.setPounds(120);
        vits7.setDate(LocalDateTime.now());
        Encounter enc6 = new Encounter();
        enc6.setVitalsigns(vits7);
        enc6.setDate(new Date());
        patient7.encounterhistory.addencounter(enc6);

        House h = new House();
        h.setHouseNo(001);
        h.addpersonhouse(person);
        h.addpersonhouse(person2);

        House h1 = new House();
        h1.setHouseNo(002);
        h1.addpersonhouse(person3);
        h1.addpersonhouse(person4);

        House h2 = new House();
        h2.setHouseNo(003);
        h2.addpersonhouse(person5);
        h2.addpersonhouse(person6);
       // h2.addpersonhouse(person7);
        
        House h3 = new House();
        h3.setHouseNo(004);
        h3.addpersonhouse(person7);

        Community com = new Community();
        com.setCommunity("Roxbury Crossing");
        com.addHousetocommunity(h);
        com.addHousetocommunity(h1);

        Community com1 = new Community();
        com1.setCommunity("Downtown");
        com1.addHousetocommunity(h2);
        com1.addHousetocommunity(h3);

        c.setCity("Boston");
        c.addcommunitytohistory(com);
        c.addcommunitytohistory(com1);

        Scanner input = new Scanner(System.in);
        System.out.print("-------------------------------------------------------------\n");
        System.out.print("--------------Welcome to Harvard Medical Center--------------\n");
        System.out.print("-------------------------------------------------------------\n");
        boolean mainCheck = true;
        while (mainCheck) {
            System.out.print("Select one among the below option to proceed further \n");
            System.out.print("Enter 1.To create Patient Data \n");
            System.out.print("      2.To View Patient Data \n");
            System.out.print("      3.To View No of People in a Community has Abnormal Blood Pressure \n");
            System.out.print("      4.To Exit \n");
            System.out.print("Enter Your Input: \n");
            int menuinput = input.nextInt();
            /*  int count = 0;
        

        encounter.setVitalsigns(vital);

        for (int i = 0; i < patienthistory.patientdirectory.size(); i++) {
            if (patienthistory.patientdirectory.get(i).PersonID == personId) {
                System.out.println(personId);
            }
        }
        patient.
             */

            if (menuinput == 1) {
                System.out.print("--------------Enter the patients details--------------\n");

                System.out.print("Provide Person ID of the patient:");
                int personId = input.nextInt();
                // boolean personexist = false;
                for (Patient per : patienthistory.getPatientdirectory()) {
                    //  System.out.println(per.PersonID);
                    if (per.PersonID == personId) {
                        //personexist = true;
                        System.out.println("Enter Patient " + per.PersonFname + " " + per.PersonLname + " vital sign data:");
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
                        Encounter currentEncounter = per.getEncounterhistory().addEncounterHistory();
                        currentEncounter.Vitalsigns.setBlood_presure(blood_presure);
                        currentEncounter.Vitalsigns.setHeart_rate(heart_rate);
                        currentEncounter.Vitalsigns.setRespiratory_rate(respiratory_rate);
                        currentEncounter.Vitalsigns.setWeight(weight);
                        currentEncounter.Vitalsigns.setPounds(pounds);
                        currentEncounter.Vitalsigns.setDate(LocalDateTime.now());

                        boolean vitalsigncheck = true;

                        while (vitalsigncheck) {

                            System.out.println("Enter one among the below  ");
                            System.out.println("1.Check all Vital Signs are Normal");
                            System.out.println("2.Check particular Vital Sign");
                            System.out.println("3. Back");
                            System.out.println("Enter Your input: ");
                            int CheckVital = input.nextInt();
                            input.nextLine();

                            if (CheckVital == 1) {
                                boolean ispatientnormal = currentEncounter.Vitalsigns.ispatientnormal(per.Age);
                                if (ispatientnormal == true) {
                                    System.out.println("The patient " + per.PersonFname + " " + per.PersonLname + " is Normal");

                                } else {
                                    System.out.println("The patient " + per.PersonFname + " " + per.PersonLname + " is Abnormal");

                                }
                            }

                            if (CheckVital == 2) {
                                System.out.println("Enter one among the below Vital Sign \n");
                                System.out.println("Blood Pressure  Heart Rate  Respiratory Rate  Weight  Pounds\n");
                                System.out.println("Enter Your input: ");
                                String VitalSign = input.nextLine();
//                                boolean isThisVitalSignNormal = currentEncounter.Vitalsigns.isThisVitalSignNormal(VitalSign, per.Age);
                                boolean isThisVitalSignNormal = per.isThisVitalSignNormal(VitalSign);

                                if (isThisVitalSignNormal == true) {
                                    System.out.println("The Vital Sign " + VitalSign + " is Normal");
                                } else {
                                    System.out.println("The patient Vital Sign " + VitalSign + " is Abnormal");
                                }
                            }

                            if (CheckVital == 3) {
                                vitalsigncheck = false;
                            }
                        }

                    }
                }
            }

            if (menuinput == 2) {
                System.out.println("Enter Person ID to view data: ");
                int personId = input.nextInt();

                for (Patient per : patienthistory.getPatientdirectory()) {
                    //  System.out.println(per.PersonID);
                    if (per.PersonID == personId) {
                        // System.out.println(checkpatient.toString());
                        // System.out.println(checkpatient.getCurrentVital());
                        // System.out.println("Data for Patient " + checkpatient.getPatientId());
                        // System.out.println("Patient's ID"+checkpatient.getPatientId());
                        System.out.println("Patient's Name: " + per.PersonFname + " " + per.PersonLname);
                        System.out.println("Patient's Age: " + per.Age);
                        System.out.println("***************************************************");
                        System.out.println("The Following Data are History Data of the Patient");
//                        System.out.println("Blood Pressure: " + checkpatient.getCurrentVital().getBlood_presure());
//                        System.out.println("Heart Rate: " + checkpatient.getCurrentVital().getHeart_rate());
//                        System.out.println("Respiratory Rate: " + checkpatient.getCurrentVital().getRespiratory_rate());
//                        System.out.println("Weight: " + checkpatient.getCurrentVital().getWeight());
//                        System.out.println("Pound: " + checkpatient.getCurrentVital().getPounds());
//                        System.out.println("DateTimeStamp: " + checkpatient.getCurrentVital().getDate());
                        for (Encounter e : per.getEncounterhistory().getEncounterhistory()) {
                            // System.out.println(v.toString());

                            System.out.println("Blood Pressure: " + e.Vitalsigns.getBlood_presure());
                            System.out.println("Heart Rate: " + e.Vitalsigns.getHeart_rate());
                            System.out.println("Respiratory Rate: " + e.Vitalsigns.getRespiratory_rate());
                            System.out.println("Weight: " + e.Vitalsigns.getWeight());
                            System.out.println("Pound: " + e.Vitalsigns.getPounds());
                            System.out.println("DateTimeStamp: " + e.Vitalsigns.getDate());
                            System.out.println("***************************************************");
                        }
                    }
                }
            }
            int totalpersonabnormal = 0;
            if (menuinput == 3) {

//               System.out.println("Enter Community Name to view data: ");
//               String community_name = input.next();
                input.nextLine();
                for (Community community : c.getCommunityhistory()) {
                    int communityno = 0;

                    for (House house : community.getHouse()) {
                        for (Person p : house.getPerson()) {
                            Patient patient = patienthistory.GetPatient(p.PersonID);
                            if (patient != null) {
                                if (!patient.isThisVitalSignNormal("Blood Pressure")) {

                                    communityno++;
                                    totalpersonabnormal++;

                                }
                            }
                        }
                    }
                    System.out.println("No of people having Abnormal Blood pressure in " + community.getCommunity() + " are " + communityno);
                    communityno = 0;
                }
                System.out.println("No of people having Abnormal Blood pressure in Boston city are " + totalpersonabnormal);
            }
            
             if (menuinput == 4){
                 System.exit(0);
             }
        }
    }
}

//            
//
//            System.out.print("Provide your input:");
//            personId = input.nextInt();
//            System.out.print("Provide your input:");
//            personId = input.nextInt();
//
//            System.out.print("Enter the below option to access patient data \n");
//            System.out.print("press 1.To create new patient Data \n");
//            System.out.print("      2.To view patient Data \n");
//            System.out.print("      3.To Quit \n");
//            System.out.print("Provide your input:");
//            userinput = input.nextInt();
//            //System.out.print("Enter Values from 1 to 3: ");
//            //count = input.nextInt();
//            switch (userinput) {
//                case 1:
//                    System.out.print("Enter patient ID: ");
//                    int patientId = input.nextInt();
//                    System.out.print("Enter patient's name: ");
//                    String name = input.next();
//                    System.out.println("Enter patient's age: ");
//                    int age = input.nextInt();
//                    System.out.println("Enter patients repiratory rate: ");
//                    int respiratory_rate = input.nextInt();
//                    System.out.println("Enter patient's heart rate: ");
//                    int heart_rate = input.nextInt();
//                    System.out.println("Enter patient's blood presure: ");
//                    int blood_presure = input.nextInt();
//
//                    System.out.println("Enter patients Weight: ");
//                    double weight = input.nextDouble();
//
//                    System.out.println("Enter patient's Pounds: ");
//                    double pounds = input.nextDouble();
//                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//                    Date date = new Date();
//
//                    VitalSigns currentVital = new VitalSigns();
//                    currentVital.setBlood_presure(blood_presure);
//                    currentVital.setHeart_rate(heart_rate);
//                    currentVital.setRespiratory_rate(respiratory_rate);
//                    currentVital.setWeight(weight);
//                    currentVital.setPounds(pounds);
//                    currentVital.setDate(formatter.format(date));
//
//                    Patient existingPatient = GetPatient(patientarray, patientId);
//
//                    if (existingPatient != null) {
//                        existingPatient.addVitals(currentVital);
//
//                    } else {
//                        Patient patient = new Patient();
//                        patient.setPatientId(patientId);
//                        patient.setAge(age);
//                        patient.setName(name);
//                        patient.addVitals(currentVital);
//                        patientarray.add(patient);
//                    }
//                    //patient.addpatient(patient);
//
//                    Boolean ispatientnormal = currentVital.ispatientnormal(age);
//
//                    System.out.println("Enter one among the below  ");
//                    System.out.println("1.Check all Vital Signs are Normal");
//                    System.out.println("2.Check particular Vital Sign");
//                    System.out.println("3.To Exit");
//                    System.out.println("Enter Your input: ");
//                    int CheckVital = input.nextInt();
//                    input.nextLine();
//                    if (CheckVital == 1) {
//                        if (ispatientnormal == true) {
//                            System.out.println("The patient " + name + " is Normal");
//
//                        } else {
//                            System.out.println("The patient " + name + " is Abnormal");
//
//                        }
//                    } else {
//                        System.out.println("Enter one among the below Vital Sign \n");
//                        System.out.println("Blood Pressure  Heart Rate  Respiratory Rate  Weight  Pounds\n");
//                        System.out.println("Enter Your input: ");
//                        String VitalSign = input.nextLine();
//                        Boolean isThisVitalSignNormal = currentVital.isThisVitalSignNormal(VitalSign, age);
//                        if (isThisVitalSignNormal == true) {
//                            System.out.println("The Vital Sign " + VitalSign + " is Normal");
//                        } else {
//                            System.out.println("The patient Vital Sign " + VitalSign + " is Abnormal");
//                        }
//                    }
//
//                    break;
//
//                /*do{
//                    switch(CheckVital){
//                        case 1:
//                            if (ispatientnormal == true) {
//                                System.out.println("The patient " +name + " is Normal");
//
//                            } else {
//                              System.out.println("The patient " +name +" is Abnormal");  
//
//                            }
//                            CheckVital = 5;
//                          break;
//  
//                        case 2:
//                            System.out.println("Enter one among the below Vital Sign \n");
//                            System.out.println("Blood Pressure  Heart Rate  Respiratory Rate  Weight in Kg  Weight in Pounds\n");
//                            System.out.println("Enter Your input: \n");
//                           String  VitalSign = input.next();
//                           Boolean isThisVitalSignNormal = currentVital.isThisVitalSignNormal(VitalSign,age);
//                            if (isThisVitalSignNormal == true) {
//                           System.out.println("The Vital Sign " +VitalSign + " is Normal");
//                            }
//                            else {
//                         System.out.println("The patient Vital Sign" +VitalSign +" is Abnormal");
//                            }
//                        CheckVital = 5;
//                        break;    
//       
//                        case 3:
//                             CheckVital = 5;
//                            break;
//                    }
//                }while (CheckVital <= 3);
//  
//            break;*/
//                case 2:
//                    System.out.println("Enter PatientID: ");
//                    int patientid = input.nextInt();
//
//                    Patient checkpatient = GetPatient(patientarray, patientid);
//                    if (checkpatient != null) {
//                        // System.out.println(checkpatient.toString());
//                        // System.out.println(checkpatient.getCurrentVital());
//                        System.out.println("Data for Patient " + checkpatient.getPatientId());
//                        // System.out.println("Patient's ID"+checkpatient.getPatientId());
//                        System.out.println("Patient's Name: " + checkpatient.getName());
//                        System.out.println("Patient's Age: " + checkpatient.getAge());
//                        System.out.println("Blood Pressure: " + checkpatient.getCurrentVital().getBlood_presure());
//                        System.out.println("Heart Rate: " + checkpatient.getCurrentVital().getHeart_rate());
//                        System.out.println("Respiratory Rate: " + checkpatient.getCurrentVital().getRespiratory_rate());
//                        System.out.println("Weight: " + checkpatient.getCurrentVital().getWeight());
//                        System.out.println("Pound: " + checkpatient.getCurrentVital().getPounds());
//                        System.out.println("DateTimeStamp: " + checkpatient.getCurrentVital().getDate());
//                        for (VitalSigns view : checkpatient.getHistory()) {
//                            // System.out.println(v.toString());
//                            System.out.println("***************************************************");
//                            System.out.println("The Following Data are History Data of the Patient");
//                            System.out.println("Blood Pressure: " + view.getBlood_presure());
//                            System.out.println("Heart Rate: " + view.getHeart_rate());
//                            System.out.println("Respiratory Rate: " + view.getRespiratory_rate());
//                            System.out.println("Weight: " + view.getWeight());
//                            System.out.println("Pound: " + view.getPounds());
//                            System.out.println("DateTimeStamp: " + view.getDate());
//                            System.out.println("***************************************************");
//                        }
//                    } else {
//                        System.out.println("The patient is not present.");
//                    }
//
//                    break;
//
//                case 3:
//                    System.out.println("Invalid Entry");
//                    System.exit(0);
//                    break;
//            }
//
//        }
//
//        /*System.out.println("Enter patients age: ");
//   = input.nextInt();
//  
//  isThisVitalSignNormal();*/
// /*for (int i = 0; i < patientarray.size();i++) 
//	      { 
//                 
//	          System.out.println(patientarray.get(i).toString()); 
//                  System.out.println(patientarray.get(i).currentVital.toString());
//                  for (int j = 0; j < patientarray.size();j++){
//                  System.out.println(patientarray.get(i).history.get(j).toString());
//                  }
//                                //System.out.println(patientarray.get(i).getHistory());
//              
//                  }*/
//        for (Patient p : patientarray) {
//            // System.out.println(p.toString());
//            // System.out.println(p.getCurrentVital());
//            System.out.println("Patient's ID" + p.getPatientId());
//            System.out.println("Patient's Name: " + p.getName());
//            System.out.println("Patient's Age: " + p.getAge());
//            System.out.println("Patient's Age: " + p.getCurrentVital().getBlood_presure());
//            for (VitalSigns v : p.history) {
//                System.out.println(v.toString());
//            }
//        }
//
//        /* for (int i = 0; i < patientarray.size();i++) 
//	      { 
//                  if (patientarray.get(i).patientId == patientID){
//	          System.out.println(patientID); 
//                  }
//	      }*/
//    }
//
//}
