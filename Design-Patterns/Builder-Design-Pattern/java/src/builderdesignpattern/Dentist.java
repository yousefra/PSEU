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
import java.util.Scanner;

/**
 *
 * @author yousef
 */
public class Dentist implements DentistPlan {

    private PersonalInformation personalInformation;
    private ArrayList<Education> education;
    private ArrayList<Address> address;
    private ArrayList<SpecializationArea> specializationArea;
    private Scanner input;
    
    public Dentist() {
        this.input = new Scanner(System.in);
    }

    @Override
    public void setPersonalInformation() {
        
        String firstName, lastName, email, website, phoneNo, licenceCountryName, licenceNo, gender;
        int yearsInPractice;
        
        System.out.println("<< Personal Information >>");
        System.out.print("First Name: ");
        firstName = input.next();
        System.out.print("Last Name: ");
        lastName = input.next();
        System.out.print("Email: ");
        email = input.next();
        System.out.print("Website: ");
        website = input.next();
        System.out.print("Phone Number: ");
        phoneNo = input.next();
        
        System.out.println("<< Biography Section >>");
        System.out.print("Licence Country Name: ");
        licenceCountryName = input.next();
        System.out.print("Licence Number: ");
        licenceNo = input.next();
        System.out.print("Years In Practice: ");
        yearsInPractice = input.nextInt();
        System.out.print("Gender: ");
        gender = input.next();
        
        PersonalInformation personalInformation = new PersonalInformation(firstName, lastName, email, website, phoneNo, licenceCountryName, licenceNo, yearsInPractice, gender);
        this.personalInformation = personalInformation;
    }

    @Override
    public void setEducation() {
        ArrayList<Education> educations = new ArrayList<>();
        String degree, major, school;
        int year;
        
        System.out.println("<< Education Section >>");
        System.out.print("Degree: ");
        degree = input.next();
        System.out.print("Major: ");
        major = input.next();
        System.out.print("School: ");
        school = input.next();
        System.out.print("Year: ");
        year = input.nextInt();
        
        Education newEducation = new Education(degree, major, school, year);
        educations.add(newEducation);
        
        this.education = educations;
    }

    @Override
    public void setAddress() {
        ArrayList<Address> addresses = new ArrayList<>();
        String country, state, city, street, postalCode;
        
        System.out.println("<< Address Section >>");
        System.out.print("Country: ");
        country = input.next();
        System.out.print("State: ");
        state = input.next();
        System.out.print("City: ");
        city = input.next();
        System.out.print("Street: ");
        street = input.next();
        System.out.print("Postal Code: ");
        postalCode = input.next();
        
        Address newAddress = new Address(country, state, city, street, postalCode);
        addresses.add(newAddress);
        
        this.address = addresses;
    }

    @Override
    public void setSpecializationArea() {
        ArrayList<SpecializationArea> specializationAreas = new ArrayList<>();
        String areaOfSpecialization;
        int startYear;
        
        System.out.println("<< Specialization Area Section >>");
        System.out.print("Area Of Specialization: ");
        areaOfSpecialization = input.next();
        System.out.print("Start Year: ");
        startYear = input.nextInt();
        
        SpecializationArea newSpecializationArea = new SpecializationArea(areaOfSpecialization, startYear);
        specializationAreas.add(newSpecializationArea);
        
        this.specializationArea = specializationAreas;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public ArrayList<SpecializationArea> getSpecializationArea() {
        return specializationArea;
    }

}
