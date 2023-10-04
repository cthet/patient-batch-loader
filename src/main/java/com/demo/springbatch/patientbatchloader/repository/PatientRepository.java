package com.demo.springbatch.patientbatchloader.repository;

import com.demo.springbatch.patientbatchloader.domain.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository  extends JpaRepository<PatientEntity, Long> {
}
