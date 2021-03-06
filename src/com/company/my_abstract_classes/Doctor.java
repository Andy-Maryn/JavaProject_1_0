package com.company.my_abstract_classes;

import com.company.my_classes.Patient;
import com.company.my_interfaces.DoctorsInterface;

public abstract class Doctor implements DoctorsInterface {

    @Override
    public void meetThePatient(Patient patient) {
        System.out.println(patient.getName() + ": The patient was met");
    }

    @Override
    public void prescribeTreatment(Patient patient) {}

    @Override
    public void completeResearch(Patient patient) {
        System.out.println(patient.getName() + ": The research was completed");
    }
}
