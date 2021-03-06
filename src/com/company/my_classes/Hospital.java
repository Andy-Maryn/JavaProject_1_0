package com.company.my_classes;

import com.company.my_abstract_classes.Doctor;

public class Hospital {

    public Doctor newPatient(Patient patient){
        Doctor doctor = null;

        System.out.println("_________________________");
        System.out.println("New patient was came");
        switch (patient.getDisease()){
            case BACKACHE:
                doctor = new BackacheDoctor();
                System.out.println(patient.getName() + ": The patient has backache");
                break;
            case STOMACH_ACHE:
                doctor = new StomachAcheDoctor();
                System.out.println(patient.getName() + ": The patient has stomach ache");
                break;
            case HEADACHE:
                doctor = new HeadacheDoctor();
                System.out.println(patient.getName() + ": The patient has head ache");
                break;
            default:
                System.out.println(patient.getName() + ": We can't help the patient");
                return doctor;
        }
        doctor.meetThePatient(patient);
        doctor.prescribeTreatment(patient);
        doctor.completeResearch(patient);
        return doctor;
    }
}
