package com.care.aged.AgedCareArt.service;

import com.care.aged.AgedCareArt.entity.Patient;
import com.care.aged.AgedCareArt.jpa.PatientRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService implements GenericService<Patient, Long> {

    private final PatientRepository patientRepository;

    public PatientService(final PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Long getId(Patient entity) {
        return entity.getPatientId();
    }

    @Override
    public CrudRepository<Patient, Long> getRepository() {
        return this.patientRepository;
    }

    public Patient search(String name) {
        return patientRepository.findByName(name);
    }
}
