<?php
 

class Education {
    private $degree;
    private $major;
    private $school;
    private $year;

    public function __construct($degree, $major, $school, $year) {
        $this->degree = $degree;
        $this->major = $major;
        $this->school = $school;
        $this->year = $year;
    }

    public function getDegree() {
        return $this->degree;
    }

    public function setDegree($degree) {
        $this->degree = $degree;
    }

    public function getMajor() {
        return $this->major;
    }

    public function setMajor($major) {
        $this->major = $major;
    }

    public function getSchool() {
        return $this->school;
    }

    public function setSchool($school) {
        $this->school = $school;
    }

    public function getYear() {
        return $this->year;
    }

    public function setYear($year) {
        $this->year = $year;
    }
    
    
}
