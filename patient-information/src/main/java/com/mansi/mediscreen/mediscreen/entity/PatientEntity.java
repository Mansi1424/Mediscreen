package com.mansi.mediscreen.mediscreen.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientEntity {

    @Id
    private long id;

    private String name;
    private String familyName;
    private String dateOfBirth;
    private String sex;
    private String homeAddress;
    private String phoneNumber;

}
