/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import java.util.ArrayList;
import java.util.Scanner;

import dentist.Address;
import dentist.Education;
import dentist.PersonalInformation;
import dentist.SpecializationArea;

/**
 *
 * @author yousef
 */
public class BuilderDesignPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        DentistBuilder builder;

        String firstName, lastName, email, website, phoneNo, licenceCountryName, licenceNo, gender, degree, major,
                school, country, state, city, street, postalCode;
                int yearsInPractice, year;
        ArrayList<Education> educations = new ArrayList<>();
        ArrayList<Address> addresses = new ArrayList<>();

        char isSpecialist;
        ArrayList<SpecializationArea> specializationAreas = new ArrayList<>();
        String areaOfSpecialization;
        int startYear;

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

        // Biography

        System.out.println("<< Biography Section >>");
        System.out.print("Licence Country Name: ");
        licenceCountryName = input.next();
        System.out.print("Licence Number: ");
        licenceNo = input.next();
        System.out.print("Years In Practice: ");
        yearsInPractice = input.nextInt();
        System.out.print("Gender: ");
        gender = input.next();

        PersonalInformation personalInformation = new PersonalInformation(firstName, lastName, email, website, phoneNo,
                licenceCountryName, licenceNo, yearsInPractice, gender);

        // Education

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

        // Addresses

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

        // Specialization Areas

        System.out.print("Is Specialist? (Y/N): ");
        isSpecialist = input.next().charAt(0);

        if(isSpecialist == 'Y' || isSpecialist == 'y') {
            System.out.println("<< Specialization Area Section >>");
            System.out.print("Area Of Specialization: ");
            areaOfSpecialization = input.next();
            System.out.print("Start Year: ");
            startYear = input.nextInt();

            SpecializationArea newSpecializationArea = new SpecializationArea(areaOfSpecialization, startYear);
            specializationAreas.add(newSpecializationArea);

            builder = new SpecialistDentist(personalInformation, educations, addresses, specializationAreas);
        } else {
            builder = new GeneralDentist(personalInformation, educations, addresses);
        }
        
        DentistEngineer dentistEngineer = new DentistEngineer(builder);
        dentistEngineer.constructDentist();
        Dentist dentist = dentistEngineer.getDentist();

    }
}
