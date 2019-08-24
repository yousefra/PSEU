import { Dentist } from './Dentist';

/*
 * File Created: Saturday, 24th August 2019 12:58:56 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */

export interface DentistBuilder {
	buildPersonalInformation(): void;
	buildEducation(): void;
	buildAddress(): void;
	buildSpecializationArea(): void;
	getDentist(): Dentist;
}
