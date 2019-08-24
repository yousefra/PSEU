/*
 * File Created: Saturday, 24th August 2019 12:49:42 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */

export class Address {
	private country: String;
	private state: String;
	private city: String;
	private street: String;
	private postalCode: String;

	public Address(country: String, state: String, city: String, street: String, postalCode: String) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.street = street;
		this.postalCode = postalCode;
	}

	public getCountry() {
		return this.country;
	}

	public getState() {
		return this.state;
	}

	public getCity() {
		return this.city;
	}

	public getStreet() {
		return this.street;
	}

	public getPostalCode() {
		return this.postalCode;
	}

	public setCountry(country: String) {
		this.country = country;
	}

	public setState(state: String) {
		this.state = state;
	}

	public setCity(city: String) {
		this.city = city;
	}

	public setStreet(street: String) {
		this.street = street;
	}

	public setPostalCode(postalCode: String) {
		this.postalCode = postalCode;
	}
}
