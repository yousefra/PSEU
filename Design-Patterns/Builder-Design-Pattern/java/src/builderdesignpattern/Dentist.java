/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import dentist.Address;
import dentist.Education;
import dentist.PersonalInformation;
import dentist.SpecializationArea;
import java.util.ArrayList;

/**
 *
 * @author yousef
 */
public class Dentist implements DentistPlan {

    private PersonalInformation personalInformation;
    private ArrayList<Education> education;
    private ArrayList<Address> address;
    private ArrayList<SpecializationArea> specializationArea;
    
    public Dentist() {
//        this.input = new Scanner(System.in);
    }

    @Override
    public void setPersonalInformation(PersonalInformation personalInformation) {
       this.personalInformation = personalInformation;
    }

    @Override
    public void setEducation(ArrayList<Education> educations) {
        this.education = educations;
    }

    @Override
    public void setAddress(ArrayList<Address> addresses) {
        this.address = addresses;
    }

    public void setSpecializationArea(ArrayList<SpecializationArea> specializationAreas) {
        this.specializationArea = specializationAreas;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public ArrayList<SpecializationArea> getSpecializationArea() {
        return specializationArea;
    }

}
