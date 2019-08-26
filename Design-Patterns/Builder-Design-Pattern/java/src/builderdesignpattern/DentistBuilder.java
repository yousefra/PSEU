/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import java.util.ArrayList;

import dentist.Address;
import dentist.Education;
import dentist.PersonalInformation;

/**
 *
 * @author yousef
 */
public interface DentistBuilder {
    
    public void buildPersonalInformation();
    public void buildEducation();
    public void buildAddress();
    public void buildSpecializationArea();
    public Dentist getDentist(); 

}
