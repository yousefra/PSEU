<?php
 

class GeneralDentist implements DentistBuilder {
    
    private $dentist;

    public function __construct() {
        $this->dentist = new Dentist();
    }
    
    public function buildPersonalInformation() {
        $this->dentist.setPersonalInformation();
    }

    public function buildEducation() {
        $this->dentist.setEducation();
    }

    public function buildAddress() {
        $this->dentist.setAddress();
    }

    public function buildSpecializationArea() {
        $this->dentist.setSpecializationArea();
    }

    public function getDentist() {
        return $this->dentist;
    }
}
