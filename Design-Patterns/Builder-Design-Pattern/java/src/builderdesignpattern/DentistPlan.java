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
public interface DentistPlan {
    
    void setPersonalInformation();
    void setEducation();
    void setAddress();
    void setSpecializationArea();
    
}
