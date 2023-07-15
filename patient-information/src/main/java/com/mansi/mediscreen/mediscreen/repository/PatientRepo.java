package com.mansi.mediscreen.mediscreen.repository;

import com.mansi.mediscreen.mediscreen.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface PatientRepo extends JpaRepository<PatientEntity,Integer> {

    PatientEntity findByName(String name);

    List<PatientEntity> findAll();

    PatientEntity findByNameAndFamilyName(String name, String familyName);

}
