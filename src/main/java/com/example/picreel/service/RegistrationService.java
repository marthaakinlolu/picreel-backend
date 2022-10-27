package com.example.picreel.service;

import com.example.picreel.model.RegistrationModel;
import com.example.picreel.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public RegistrationModel addData(RegistrationModel request) {
        RegistrationModel user = registrationRepository.save(request);
        return user;
    }
}
