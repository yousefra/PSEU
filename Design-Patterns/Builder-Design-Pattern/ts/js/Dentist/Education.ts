/*
 * File Created: Saturday, 24th August 2019 12:49:42 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */

export class Education {
	private degree: String;
	private major: String;
	private school: String;
	private year: Number;

	public Education(degree: String, major: String, school: String, year: Number) {
		this.degree = degree;
		this.major = major;
		this.school = school;
		this.year = year;
	}

	public getDegree() {
		return this.degree;
	}

	public setDegree(degree: String) {
		this.degree = degree;
	}

	public getMajor() {
		return this.major;
	}

	public setMajor(major: String) {
		this.major = major;
	}

	public getSchool() {
		return this.school;
	}

	public setSchool(school: String) {
		this.school = school;
	}

	public getYear() {
		return this.year;
	}

	public setYear(year: Number) {
		this.year = year;
	}
}
