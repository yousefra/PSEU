import { PersonalInformation } from '../Dentist/PersonalInformation';
import { Education } from '../Dentist/Education';
import { Address } from '../Dentist/Address';
import { SpecializationArea } from '../Dentist/SpecializationArea';

import { DentistPlan } from './DentistPlan';

/*
 * File Created: Saturday, 24th August 2019 12:58:56 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */

export class Dentist implements DentistPlan {
	private personalInformation: PersonalInformation;
	private education: Education;
	private address: Address;
	private specializationArea: SpecializationArea;

	public setPersonalInformation() {
		document.getElementById("personalInformation").setAttribute("style", "display: block;")
		const personalInfo = new PersonalInformation();
		// this.personalInformation = personalInformation;
	}

	public setEducation() {
		// this.education = educations;
	}

	public setAddress() {
		// this.address = addresses;
	}

	public setSpecializationArea() {
		// this.specializationArea = specializationAreas;
	}

	public getPersonalInformation() {
		return this.personalInformation;
	}

	public getEducation() {
		return this.education;
	}

	public getAddress() {
		return this.address;
	}

	public getSpecializationArea() {
		return this.specializationArea;
	}
}
