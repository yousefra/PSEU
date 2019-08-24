/*
 * File Created: Saturday, 24th August 2019 12:49:42 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */

export class PersonalInformation {
    // Personal Information
    private firstName: String;
    private lastName: String;
    private email: String;
    private website: String;
    private phoneNo: String;
    
    // Biography Section
    private licenceCountryName: String;
    private licenceNo: String;
    private yearsInPractice: Number;
    private gender: String;

    public PersonalInformation(firstName: String, lastName: String, email: String, website: String, phoneNo: String, licenceCountryName: String, licenceNo: String, yearsInPractice: Number, gender: String) {
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

    public getFirstName() {
        return this.firstName;
    }

    public setFirstName(firstName: String) {
        this.firstName = firstName;
    }

    public getLastName() {
        return this.lastName;
    }

    public setLastName(lastName: String) {
        this.lastName = lastName;
    }

    public getEmail() {
        return this.email;
    }

    public setEmail(email: String) {
        this.email = email;
    }

    public getWebsite() {
        return this.website;
    }

    public setWebsite(website: String) {
        this.website = website;
    }

    public getPhoneNo() {
        return this.phoneNo;
    }

    public setPhoneNo(phoneNo: String) {
        this.phoneNo = phoneNo;
    }

    public getLicenceCountryName() {
        return this.licenceCountryName;
    }

    public setLicenceCountryName(licenceCountryName: String) {
        this.licenceCountryName = licenceCountryName;
    }

    public getLicenceNo() {
        return this.licenceNo;
    }

    public setLicenceNo(licenceNo: String) {
        this.licenceNo = licenceNo;
    }

    public getYearsInPractice() {
        return this.yearsInPractice;
    }

    public setYearsInPractice(yearsInPractice: Number) {
        this.yearsInPractice = yearsInPractice;
    }

    public getGender() {
        return this.gender;
    }

    public setGender(gender: String) {
        this.gender = gender;
    }
}
