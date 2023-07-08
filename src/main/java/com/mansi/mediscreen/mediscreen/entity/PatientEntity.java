package com.mansi.mediscreen.mediscreen.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Repository;

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
