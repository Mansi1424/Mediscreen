package com.mansi.mediscreen.mediscreen.repository;

import com.mansi.mediscreen.mediscreen.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<PatientEntity,Integer> {

}
