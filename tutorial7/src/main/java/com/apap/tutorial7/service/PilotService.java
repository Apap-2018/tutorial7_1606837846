package com.apap.tutorial7.service;

import java.util.Optional;

import com.apap.tutorial7.model.PilotModel;

/**
 * PilotService
 */
public interface PilotService {
    PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
    PilotModel addPilot(PilotModel pilot);
    void updatePilot (long id, PilotModel pilot);
    void deletePilotByLicenseNumber(String licenseNumber);
    void deletePilot (PilotModel pilot);
    PilotModel getPilotDetailById(long id);
}