import { Dentist } from './Dentist';
import { DentistBuilder } from './DentistBuilder';

/*
 * File Created: Saturday, 24th August 2019 12:58:56 pm
 * Author: yousef
 * -----
 * Copyright © 2019
 */

export class GeneralDentist implements DentistBuilder {
    
    private dentist: Dentist;

    public GeneralDentist() {
        this.dentist = new Dentist();
    }
    
    public buildPersonalInformation() {
        this.dentist.setPersonalInformation();
    }

    public buildEducation() {
        this.dentist.setEducation();
    }

    public buildAddress() {
        this.dentist.setAddress();
    }

    public buildSpecializationArea() {
        this.dentist.setSpecializationArea();
    }

    public getDentist() {
        return this.dentist;
    }
}
