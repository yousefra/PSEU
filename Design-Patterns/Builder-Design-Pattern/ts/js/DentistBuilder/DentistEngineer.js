"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var SpecialistDentist_1 = require("./SpecialistDentist");
/*
 * File Created: Saturday, 24th August 2019 12:58:56 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */
var DentistEngineer = /** @class */ (function () {
    function DentistEngineer() {
    }
    DentistEngineer.prototype.DentistEngineer = function (dentistBuilder) {
        this.dentistBuilder = dentistBuilder;
    };
    DentistEngineer.prototype.getDentist = function () {
        return this.dentistBuilder.getDentist();
    };
    DentistEngineer.prototype.constructDentist = function () {
        this.dentistBuilder.buildPersonalInformation();
        this.dentistBuilder.buildEducation();
        this.dentistBuilder.buildAddress();
        if (this.dentistBuilder instanceof SpecialistDentist_1.SpecialistDentist)
            this.dentistBuilder.buildSpecializationArea();
    };
    return DentistEngineer;
}());
exports.DentistEngineer = DentistEngineer;
//# sourceMappingURL=DentistEngineer.js.map