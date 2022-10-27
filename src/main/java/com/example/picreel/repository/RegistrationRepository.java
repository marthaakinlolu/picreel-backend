package com.example.picreel.repository;

import com.example.picreel.model.RegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<RegistrationModel, Long> {
}
