/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import dentist.Address;
import dentist.Education;
import java.util.ArrayList;

import dentist.PersonalInformation;

/**
 *
 * @author yousef
 */
public class GeneralDentist implements DentistBuilder {
    
    private Dentist dentist;
    private PersonalInformation personalInformation;
    private ArrayList<Education> educations;
    private ArrayList<Address> addresses;

    public GeneralDentist(PersonalInformation personalInformation, ArrayList<Education> educations, ArrayList<Address> addresses) {
        this.dentist = new Dentist();
        this.personalInformation = personalInformation;
        this.educations = educations;
        this.addresses = addresses;
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

    @Override
    public Dentist getDentist() {
        return dentist;
    }
}
