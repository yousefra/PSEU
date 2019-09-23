"use strict";
/*
 * File Created: Saturday, 24th August 2019 12:49:42 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */
Object.defineProperty(exports, "__esModule", { value: true });
var PersonalInformation = /** @class */ (function () {
    function PersonalInformation() {
    }
    PersonalInformation.prototype.PersonalInformation = function (firstName, lastName, email, website, phoneNo, licenceCountryName, licenceNo, yearsInPractice, gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.website = website;
        this.phoneNo = phoneNo;
        this.licenceCountryName = licenceCountryName;
        this.licenceNo = licenceNo;
        this.yearsInPractice = yearsInPractice;
        this.gender = gender;
    };
    PersonalInformation.prototype.getFirstName = function () {
        return this.firstName;
    };
    PersonalInformation.prototype.setFirstName = function (firstName) {
        this.firstName = firstName;
    };
    PersonalInformation.prototype.getLastName = function () {
        return this.lastName;
    };
    PersonalInformation.prototype.setLastName = function (lastName) {
        this.lastName = lastName;
    };
    PersonalInformation.prototype.getEmail = function () {
        return this.email;
    };
    PersonalInformation.prototype.setEmail = function (email) {
        this.email = email;
    };
    PersonalInformation.prototype.getWebsite = function () {
        return this.website;
    };
    PersonalInformation.prototype.setWebsite = function (website) {
        this.website = website;
    };
    PersonalInformation.prototype.getPhoneNo = function () {
        return this.phoneNo;
    };
    PersonalInformation.prototype.setPhoneNo = function (phoneNo) {
        this.phoneNo = phoneNo;
    };
    PersonalInformation.prototype.getLicenceCountryName = function () {
        return this.licenceCountryName;
    };
    PersonalInformation.prototype.setLicenceCountryName = function (licenceCountryName) {
        this.licenceCountryName = licenceCountryName;
    };
    PersonalInformation.prototype.getLicenceNo = function () {
        return this.licenceNo;
    };
    PersonalInformation.prototype.setLicenceNo = function (licenceNo) {
        this.licenceNo = licenceNo;
    };
    PersonalInformation.prototype.getYearsInPractice = function () {
        return this.yearsInPractice;
    };
    PersonalInformation.prototype.setYearsInPractice = function (yearsInPractice) {
        this.yearsInPractice = yearsInPractice;
    };
    PersonalInformation.prototype.getGender = function () {
        return this.gender;
    };
    PersonalInformation.prototype.setGender = function (gender) {
        this.gender = gender;
    };
    return PersonalInformation;
}());
exports.PersonalInformation = PersonalInformation;
//# sourceMappingURL=PersonalInformation.js.map