<?php
 

class DentistEngineer {
    private $dentistBuilder;
    
    public function __construct($dentistBuilder) {
        $this->dentistBuilder = $dentistBuilder;
    }
    
    public function getDentist() {
        return $this->dentistBuilder.getDentist();
    }
    
    public function constructDentist() {
        $this->dentistBuilder.buildPersonalInformation();
        $this->dentistBuilder.buildEducation();
        $this->dentistBuilder.buildAddress();
        if($this->dentistBuilder instanceof SpecialistDentist)
            $this->dentistBuilder.buildSpecializationArea();
    }
}
