"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Dentist_1 = require("./Dentist");
/*
 * File Created: Saturday, 24th August 2019 12:58:56 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */
var GeneralDentist = /** @class */ (function () {
    function GeneralDentist() {
    }
    GeneralDentist.prototype.GeneralDentist = function () {
        this.dentist = new Dentist_1.Dentist();
    };
    GeneralDentist.prototype.buildPersonalInformation = function () {
        this.dentist.setPersonalInformation();
    };
    GeneralDentist.prototype.buildEducation = function () {
        this.dentist.setEducation();
    };
    GeneralDentist.prototype.buildAddress = function () {
        this.dentist.setAddress();
    };
    GeneralDentist.prototype.buildSpecializationArea = function () {
        this.dentist.setSpecializationArea();
    };
    GeneralDentist.prototype.getDentist = function () {
        return this.dentist;
    };
    return GeneralDentist;
}());
exports.GeneralDentist = GeneralDentist;
//# sourceMappingURL=GeneralDentist.js.map