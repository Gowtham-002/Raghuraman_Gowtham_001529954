/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gowth
 */
public class DriverLicenseInfo {
    public String LicenseNumber;
    public String DateIssued;
    public String DateOfExpiry;
    public String BloodType;

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    public String getDateIssued() {
        return DateIssued;
    }

    public void setDateIssued(String DateIssued) {
        this.DateIssued = DateIssued;
    }

    public String getDateOfExpiry() {
        return DateOfExpiry;
    }

    public void setDateOfExpiry(String DateOfExpiry) {
        this.DateOfExpiry = DateOfExpiry;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }
}
