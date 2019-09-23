<?php
 

class PersonalInformation {
    // Personal Information
    private $firstName;
    private $lastName;
    private $email;
    private $website;
    private $phoneNo;
    
    // Biography Section
    private $licenceCountryName;
    private $licenceNo;
    private $yearsInPractice;
    private $gender;

    public function __construct($firstName, $lastName, $email, $website, $phoneNo, $licenceCountryName, $licenceNo, $yearsInPractice, $gender) {
        $this->firstName = $firstName;
        $this->lastName = $lastName;
        $this->email = $email;
        $this->website = $website;
        $this->phoneNo = $phoneNo;
        $this->licenceCountryName = $licenceCountryName;
        $this->licenceNo = $licenceNo;
        $this->yearsInPractice = $yearsInPractice;
        $this->gender = $gender;
    }

    public function getFirstName() {
        return $this->firstName;
    }

    public function setFirstName($firstName) {
        $this->firstName = $firstName;
    }

    public function getLastName() {
        return $this->lastName;
    }

    public function setLastName($lastName) {
        $this->lastName = $lastName;
    }

    public function getEmail() {
        return $this->email;
    }

    public function setEmail($email) {
        $this->email = $email;
    }

    public function getWebsite() {
        return $this->website;
    }

    public function setWebsite($website) {
        $this->website = $website;
    }

    public function getPhoneNo() {
        return $this->phoneNo;
    }

    public function setPhoneNo($phoneNo) {
        $this->phoneNo = $phoneNo;
    }

    public function getLicenceCountryName() {
        return $this->licenceCountryName;
    }

    public function setLicenceCountryName($licenceCountryName) {
        $this->licenceCountryName = $licenceCountryName;
    }

    public function getLicenceNo() {
        return $this->licenceNo;
    }

    public function setLicenceNo($licenceNo) {
        $this->licenceNo = $licenceNo;
    }

    public function getYearsInPractice() {
        return $this->yearsInPractice;
    }

    public function setYearsInPractice($yearsInPractice) {
        $this->yearsInPractice = $yearsInPractice;
    }

    public function getGender() {
        return $this->gender;
    }

    public function setGender($gender) {
        $this->gender = $gender;
    }
    
}
