"use strict";
/*
 * File Created: Saturday, 24th August 2019 12:49:42 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */
Object.defineProperty(exports, "__esModule", { value: true });
var SpecializationArea = /** @class */ (function () {
    function SpecializationArea() {
    }
    SpecializationArea.prototype.SpecializationArea = function (areaOfSpecialization, startYear) {
        this.areaOfSpecialization = areaOfSpecialization;
        this.startYear = startYear;
    };
    SpecializationArea.prototype.getAreaOfSpecialization = function () {
        return this.areaOfSpecialization;
    };
    SpecializationArea.prototype.setAreaOfSpecialization = function (areaOfSpecialization) {
        this.areaOfSpecialization = areaOfSpecialization;
    };
    SpecializationArea.prototype.getStartYear = function () {
        return this.startYear;
    };
    SpecializationArea.prototype.setStartYear = function (startYear) {
        this.startYear = startYear;
    };
    return SpecializationArea;
}());
exports.SpecializationArea = SpecializationArea;
//# sourceMappingURL=SpecializationArea.js.map