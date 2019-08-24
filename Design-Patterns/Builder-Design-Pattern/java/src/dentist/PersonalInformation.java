/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentist;

/**
 *
 * @author yousef
 */
public class PersonalInformation {
    // Personal Information
    private String firstName;
    private String lastName;
    private String email;
    private String website;
    private String phoneNo;
    
    // Biography Section
    private String licenceCountryName;
    private String licenceNo;
    private int yearsInPractice;
    private String gender;

    public PersonalInformation(String firstName, String lastName, String email, String website, String phoneNo, String licenceCountryName, String licenceNo, int yearsInPractice, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.website = website;
        this.phoneNo = phoneNo;
        this.licenceCountryName = licenceCountryName;
        this.licenceNo = licenceNo;
        this.yearsInPractice = yearsInPractice;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLicenceCountryName() {
        return licenceCountryName;
    }

    public void setLicenceCountryName(String licenceCountryName) {
        this.licenceCountryName = licenceCountryName;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public int getYearsInPractice() {
        return yearsInPractice;
    }

    public void setYearsInPractice(int yearsInPractice) {
        this.yearsInPractice = yearsInPractice;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
