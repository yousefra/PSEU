"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Dentist_1 = require("./Dentist");
/*
 * File Created: Saturday, 24th August 2019 12:58:56 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */
var SpecialistDentist = /** @class */ (function () {
    function SpecialistDentist() {
    }
    SpecialistDentist.prototype.SpecialistDentist = function () {
        this.dentist = new Dentist_1.Dentist();
    };
    SpecialistDentist.prototype.buildPersonalInformation = function () {
        this.dentist.setPersonalInformation();
    };
    SpecialistDentist.prototype.buildEducation = function () {
        this.dentist.setEducation();
    };
    SpecialistDentist.prototype.buildAddress = function () {
        this.dentist.setAddress();
    };
    SpecialistDentist.prototype.buildSpecializationArea = function () {
        this.dentist.setSpecializationArea();
    };
    SpecialistDentist.prototype.getDentist = function () {
        return this.dentist;
    };
    return SpecialistDentist;
}());
exports.SpecialistDentist = SpecialistDentist;
//# sourceMappingURL=SpecialistDentist.js.map