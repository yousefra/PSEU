<?php
 

class Dentist implements DentistPlan {

    private $personalInformation;
    private $education;
    private $address;
    private $specializationArea;
    
    public function __construct() { }

    public function setPersonalInformation() {
        // this.personalInformation = personalInformation;
    }

    public function setEducation() {
        // this.education = educations;
    }

    public function setAddress() {
        // this.address = addresses;
    }

    public function setSpecializationArea() {
        // this.specializationArea = specializationAreas;
    }

    public function getPersonalInformation() {
        return $this->personalInformation;
    }

    public function getEducation() {
        return $this->education;
    }

    public function getAddress() {
        return $this->address;
    }

    public function getSpecializationArea() {
        return $this->specializationArea;
    }

}
