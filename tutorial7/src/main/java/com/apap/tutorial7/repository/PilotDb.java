package com.apap.tutorial7.repository;

import java.util.Optional;

import com.apap.tutorial7.model.PilotModel;
import com.apap.tutorial7.service.PilotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * PilotDb
 */
@Repository
public interface PilotDb extends JpaRepository<PilotModel, Long> {
    PilotModel findByLicenseNumber(String licenseNumber);
    PilotModel findById(long id);
    void deleteByLicenseNumber(String licenseNumber);
}