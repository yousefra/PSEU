import { DentistBuilder } from './DentistBuilder';
import { SpecialistDentist } from './SpecialistDentist';

/*
 * File Created: Saturday, 24th August 2019 12:58:56 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */

export class DentistEngineer {
	private dentistBuilder: DentistBuilder;

	public DentistEngineer(dentistBuilder: DentistBuilder) {
		this.dentistBuilder = dentistBuilder;
	}

	public getDentist() {
		return this.dentistBuilder.getDentist();
	}

	public constructDentist() {
		this.dentistBuilder.buildPersonalInformation();
		this.dentistBuilder.buildEducation();
		this.dentistBuilder.buildAddress();
		if (this.dentistBuilder instanceof SpecialistDentist)
			this.dentistBuilder.buildSpecializationArea();
	}
}
