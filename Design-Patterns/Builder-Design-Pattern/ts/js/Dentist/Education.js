"use strict";
/*
 * File Created: Saturday, 24th August 2019 12:49:42 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */
Object.defineProperty(exports, "__esModule", { value: true });
var Education = /** @class */ (function () {
    function Education() {
    }
    Education.prototype.Education = function (degree, major, school, year) {
        this.degree = degree;
        this.major = major;
        this.school = school;
        this.year = year;
    };
    Education.prototype.getDegree = function () {
        return this.degree;
    };
    Education.prototype.setDegree = function (degree) {
        this.degree = degree;
    };
    Education.prototype.getMajor = function () {
        return this.major;
    };
    Education.prototype.setMajor = function (major) {
        this.major = major;
    };
    Education.prototype.getSchool = function () {
        return this.school;
    };
    Education.prototype.setSchool = function (school) {
        this.school = school;
    };
    Education.prototype.getYear = function () {
        return this.year;
    };
    Education.prototype.setYear = function (year) {
        this.year = year;
    };
    return Education;
}());
exports.Education = Education;
//# sourceMappingURL=Education.js.map