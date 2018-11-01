package com.apap.tutorial7.service;

import java.util.Optional;

import com.apap.tutorial7.model.PilotModel;
import com.apap.tutorial7.repository.PilotDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * PilotServiceImpl
 */
@Service
@Transactional
public class PilotServiceImpl implements PilotService {
    @Autowired
    private PilotDb pilotDb;

    @Override
    public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
        return pilotDb.findByLicenseNumber(licenseNumber);
    }

    @Override
    public PilotModel addPilot(PilotModel pilot) {
        return pilotDb.save(pilot);
    }
    
    @Override
    public void updatePilot (long id, PilotModel pilot) {
    	PilotModel oldPilot = this.getPilotDetailById(id);
		oldPilot.setName(oldPilot.getName());
		oldPilot.setFlyHour(oldPilot.getFlyHour());
    }
    
    @Override
    public void deletePilot(PilotModel pilot) {
    	pilotDb.delete(pilot);
    }
    
    @Override
    public void deletePilotByLicenseNumber(String licenseNumber) {
        pilotDb.deleteByLicenseNumber(licenseNumber);
    }

    @Override
    public PilotModel getPilotDetailById(long id) {
        return pilotDb.findById(id);
    }
}