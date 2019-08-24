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
public class DentistEngineer {
    private DentistBuilder dentistBuilder;
    
    public DentistEngineer(DentistBuilder dentistBuilder) {
        this.dentistBuilder = dentistBuilder;
    }
    
    public Dentist getDentist() {
        return this.dentistBuilder.getDentist();
    }
    
    public void constructDentist() {
        this.dentistBuilder.buildPersonalInformation();
        this.dentistBuilder.buildEducation();
        this.dentistBuilder.buildAddress();
        if(this.dentistBuilder instanceof SpecialistDentist)
            this.dentistBuilder.buildSpecializationArea();
    }
}
