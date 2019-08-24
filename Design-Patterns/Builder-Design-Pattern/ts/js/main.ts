import { DentistBuilder } from './DentistBuilder/DentistBuilder';
import { SpecialistDentist } from './DentistBuilder/SpecialistDentist';
import { GeneralDentist } from './DentistBuilder/GeneralDentist';
import { DentistEngineer } from './DentistBuilder/DentistEngineer';

let builder: DentistBuilder = null;

function generalDentistOnClick() {
    builder = new GeneralDentist();
    build();
}

function specialistDentistOnClick() {
    builder = new SpecialistDentist();
    build();
}

function build() {
    const engineer = new DentistEngineer();
    engineer.constructDentist();
    const dentist = engineer.getDentist();
}