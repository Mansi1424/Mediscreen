package com.mansi.mediscreen.mediscreen.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patients", schema="PATIENT_DB")
public class PatientEntity {

    @Id
    private long patient_id;
    private String name;
    private String family_name;
    private String DOB;
    private String sex;
    private String home_address;
    private String phone_number;

    @Override
    public String toString() {
        return "PatientEntity{" +
                "patient_id=" + patient_id +
                ", name='" + name + '\'' +
                ", family_name='" + family_name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", sex='" + sex + '\'' +
                ", home_address='" + home_address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
