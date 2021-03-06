package com.company.my_classes;

public class Patient  {
    private String name;
    private Disease disease;

    public Patient(String name){
        this.name = name;
    }

    public Patient(String name, Disease disease){
        this.name = name;
        this.disease = disease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }
}
