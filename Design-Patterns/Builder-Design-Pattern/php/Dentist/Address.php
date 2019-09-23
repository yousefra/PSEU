<?php
 

class Address {
  private $country;
  private $state;
  private $city;
  private $street;
  private $postalCode;

  public function __construct($country, $state, $city, $street, $postalCode) {
    $this->country = $country;
    $this->state = $state;
    $this->city = $city;
    $this->street = $street;
    $this->postalCode = $postalCode;
  }
  
  public function getCountry()
  {
    return $this->country;
  }
  
  public function getState()
  {
    return $this->state;
  }
  
  public function getCity()
  {
    return $this->city;
  }
  
  public function getStreet()
  {
    return $this->street;
  }
  
  public function getPostalCode()
  {
    return $this->postalCode;
  }

  public function setCountry($country)
  {
    $this->country = $country;
  }

  public function setState($state)
  {
    $this->state = $state;
  }
  
  public function setCity($city)
  {
    $this->city = $city;
  }
  
  public function setStreet($street)
  {
    $this->street = $street;
  }
  
  public function setPostalCode($postalCode)
  {
    $this->postalCode = $postalCode;
  }
}
