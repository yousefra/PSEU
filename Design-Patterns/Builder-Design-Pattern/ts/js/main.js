"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var SpecialistDentist_1 = require("./DentistBuilder/SpecialistDentist");
var GeneralDentist_1 = require("./DentistBuilder/GeneralDentist");
var DentistEngineer_1 = require("./DentistBuilder/DentistEngineer");
var builder = null;
function generalDentistOnClick() {
    builder = new GeneralDentist_1.GeneralDentist();
    build();
}
function specialistDentistOnClick() {
    builder = new SpecialistDentist_1.SpecialistDentist();
    build();
}
function build() {
    var engineer = new DentistEngineer_1.DentistEngineer();
    engineer.constructDentist();
    var dentist = engineer.getDentist();
}
//# sourceMappingURL=main.js.map