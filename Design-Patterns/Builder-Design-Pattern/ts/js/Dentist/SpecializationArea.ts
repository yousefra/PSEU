/*
 * File Created: Saturday, 24th August 2019 12:49:42 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */

export class SpecializationArea {
	private areaOfSpecialization: String;
	private startYear: Number;

	public SpecializationArea(areaOfSpecialization: String, startYear: Number) {
		this.areaOfSpecialization = areaOfSpecialization;
		this.startYear = startYear;
	}

	public getAreaOfSpecialization() {
		return this.areaOfSpecialization;
	}

	public setAreaOfSpecialization(areaOfSpecialization: String) {
		this.areaOfSpecialization = areaOfSpecialization;
	}

	public getStartYear() {
		return this.startYear;
	}

	public setStartYear(startYear: Number) {
		this.startYear = startYear;
	}
}
