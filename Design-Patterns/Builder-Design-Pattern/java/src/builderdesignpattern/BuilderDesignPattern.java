/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import java.util.Scanner;

/**
 *
 * @author yousef
 */
public class BuilderDesignPattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. General Dentist\n"
                         + "2. Specialist Dentist\n"
                         + "Choice: ");
        
        int choice = input.nextInt();
        DentistBuilder builder;
        if(choice == 1)
            builder = new GeneralDentist();
        else 
            builder = new SpecialistDentist();
        
        DentistEngineer dentistEngineer = new DentistEngineer(builder);
        dentistEngineer.constructDentist();
        Dentist dentist = dentistEngineer.getDentist();
    }
}
