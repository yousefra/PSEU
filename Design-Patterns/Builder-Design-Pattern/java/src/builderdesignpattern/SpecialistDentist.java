/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

/**
 *
 * @author yousef
 */
public class SpecialistDentist implements DentistBuilder {
    
    private Dentist dentist;

    public SpecialistDentist() {
        this.dentist = new Dentist();
    }
    
    @Override
    public void buildPersonalInformation() {
        dentist.setPersonalInformation();
    }

    @Override
    public void buildEducation() {
        dentist.setEducation();
    }

    @Override
    public void buildAddress() {
        dentist.setAddress();
    }

    @Override
    public void buildSpecializationArea() {
        dentist.setSpecializationArea();
    }

    @Override
    public Dentist getDentist() {
        return dentist;
    }
}
