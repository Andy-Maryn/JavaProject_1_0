package com.company;

import com.company.my_classes.Disease;
import com.company.my_classes.Hospital;
import com.company.my_classes.Patient;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Patient patient1 = new Patient("Patient1", Disease.STOMACH_ACHE);
        Patient patient2 = new Patient("Patient2", Disease.HEADACHE);
        Patient patient3 = new Patient("Patient3", Disease.BACKACHE);

        Hospital hospital = new Hospital();


        hospital.newPatient(patient1);
        hospital.newPatient(patient2);
        hospital.newPatient(patient3);

    }
}
