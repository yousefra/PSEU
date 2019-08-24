/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentist;

/**
 *
 * @author yousef
 */
public class SpecializationArea {
    private String areaOfSpecialization;
    private int startYear;

    public SpecializationArea(String areaOfSpecialization, int startYear) {
        this.areaOfSpecialization = areaOfSpecialization;
        this.startYear = startYear;
    }

    public String getAreaOfSpecialization() {
        return areaOfSpecialization;
    }

    public void setAreaOfSpecialization(String areaOfSpecialization) {
        this.areaOfSpecialization = areaOfSpecialization;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }
    
    
}
