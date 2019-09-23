<?php
 

class SpecializationArea {
    private $areaOfSpecialization;
    private $startYear;

    public function __construct($areaOfSpecialization, $startYear) {
        $this->areaOfSpecialization = $areaOfSpecialization;
        $this->startYear = $startYear;
    }

    public function getAreaOfSpecialization() {
        return $this->areaOfSpecialization;
    }

    public function setAreaOfSpecialization($areaOfSpecialization) {
        $this->areaOfSpecialization = $areaOfSpecialization;
    }

    public function getStartYear() {
        return $this->startYear;
    }

    public function setStartYear($startYear) {
        $this->startYear = $startYear;
    }
    
    
}
