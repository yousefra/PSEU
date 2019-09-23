"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var PersonalInformation_1 = require("../Dentist/PersonalInformation");
/*
 * File Created: Saturday, 24th August 2019 12:58:56 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */
var Dentist = /** @class */ (function () {
    function Dentist() {
    }
    Dentist.prototype.setPersonalInformation = function () {
        document.getElementById("personalInformation").setAttribute("style", "display: block;");
        var personalInfo = new PersonalInformation_1.PersonalInformation();
        // this.personalInformation = personalInformation;
    };
    Dentist.prototype.setEducation = function () {
        // this.education = educations;
    };
    Dentist.prototype.setAddress = function () {
        // this.address = addresses;
    };
    Dentist.prototype.setSpecializationArea = function () {
        // this.specializationArea = specializationAreas;
    };
    Dentist.prototype.getPersonalInformation = function () {
        return this.personalInformation;
    };
    Dentist.prototype.getEducation = function () {
        return this.education;
    };
    Dentist.prototype.getAddress = function () {
        return this.address;
    };
    Dentist.prototype.getSpecializationArea = function () {
        return this.specializationArea;
    };
    return Dentist;
}());
exports.Dentist = Dentist;
//# sourceMappingURL=Dentist.js.map