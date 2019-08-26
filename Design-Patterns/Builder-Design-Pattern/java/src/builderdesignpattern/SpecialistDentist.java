/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import dentist.PersonalInformation;
import dentist.Education;
import dentist.Address;
import dentist.SpecializationArea;
import java.util.ArrayList;

/**
 *
 * @author yousef
 */
public class SpecialistDentist implements DentistBuilder {
    
    private Dentist dentist;
    private PersonalInformation personalInformation;
    private ArrayList<Education> educations;
    private ArrayList<Address> addresses;
    private ArrayList<SpecializationArea> specializationAreas;

    public SpecialistDentist(PersonalInformation personalInformation, ArrayList<Education> educations, ArrayList<Address> addresses, ArrayList<SpecializationArea> specializationAreas) {
        this.dentist = new Dentist();
        this.personalInformation = personalInformation;
        this.educations = educations;
        this.addresses = addresses;
        this.specializationAreas = specializationAreas;
    }
    
    @Override
    public void buildPersonalInformation() {
        dentist.setPersonalInformation(personalInformation);
    }

    @Override
    public void buildEducation() {
        dentist.setEducation(educations);
    }

    @Override
    public void buildAddress() {
        dentist.setAddress(addresses);
    }

    public void buildSpecializationArea() {
        dentist.setSpecializationArea(specializationAreas);
    }

    @Override
    public Dentist getDentist() {
        return dentist;
    }
}
