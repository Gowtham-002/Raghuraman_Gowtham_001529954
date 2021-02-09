/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.PersonInfo;
import Model.AddressInfo;
import Model.BankAccountInfo;
import Model.DriverLicenseInfo;
import Model.MedicalRecord;

/**
 *
 * @author gowth
 */
public class ViewReport {
    private PersonInfo person;
    private AddressInfo address;
    private BankAccountInfo bankaccount;
    private BankAccountInfo bankaccount_chk;
    private DriverLicenseInfo driverlicense;
    private MedicalRecord medicalrecord;

    public BankAccountInfo getBankaccount_chk() {
        return bankaccount_chk;
    }

    public void setBankaccount_chk(BankAccountInfo bankaccount_chk) {
        this.bankaccount_chk = bankaccount_chk;
    }

    public PersonInfo getPerson() {
        return person;
    }

    public void setPerson(PersonInfo person) {
        this.person = person;
    }

    public AddressInfo getAddress() {
        return address;
    }

    public void setAddress(AddressInfo address) {
        this.address = address;
    }

    public BankAccountInfo getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(BankAccountInfo bankaccount) {
        this.bankaccount = bankaccount;
    }

    public DriverLicenseInfo getDriverlicense() {
        return driverlicense;
    }

    public void setDriverlicense(DriverLicenseInfo driverlicense) {
        this.driverlicense = driverlicense;
    }

    public MedicalRecord getMedicalrecord() {
        return medicalrecord;
    }

    public void setMedicalrecord(MedicalRecord medicalrecord) {
        this.medicalrecord = medicalrecord;
    }
    
    
    
}
