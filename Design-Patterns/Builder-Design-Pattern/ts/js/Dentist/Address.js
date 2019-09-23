"use strict";
/*
 * File Created: Saturday, 24th August 2019 12:49:42 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */
Object.defineProperty(exports, "__esModule", { value: true });
var Address = /** @class */ (function () {
    function Address() {
    }
    Address.prototype.Address = function (country, state, city, street, postalCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    };
    Address.prototype.getCountry = function () {
        return this.country;
    };
    Address.prototype.getState = function () {
        return this.state;
    };
    Address.prototype.getCity = function () {
        return this.city;
    };
    Address.prototype.getStreet = function () {
        return this.street;
    };
    Address.prototype.getPostalCode = function () {
        return this.postalCode;
    };
    Address.prototype.setCountry = function (country) {
        this.country = country;
    };
    Address.prototype.setState = function (state) {
        this.state = state;
    };
    Address.prototype.setCity = function (city) {
        this.city = city;
    };
    Address.prototype.setStreet = function (street) {
        this.street = street;
    };
    Address.prototype.setPostalCode = function (postalCode) {
        this.postalCode = postalCode;
    };
    return Address;
}());
exports.Address = Address;
//# sourceMappingURL=Address.js.map