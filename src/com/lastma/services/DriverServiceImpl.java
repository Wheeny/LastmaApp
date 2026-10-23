package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.data.repositories.DriverRepository;
import com.lastma.dtos.requests.FindDriverRequest;
import com.lastma.dtos.requests.RegisterDriverRequest;
import com.lastma.dtos.responses.FindDriverResponse;
import com.lastma.dtos.responses.RegisterDriverResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public RegisterDriverResponse registerDriver(RegisterDriverRequest request) {
        Driver driver = new Driver();
        driver.setFullName(request.getFullName());
        driver.setEmail(request.getEmail());
        driver.setPhoneNumber(request.getPhoneNumber());
        driver.setPassword(request.getPassword());

        Driver savedDriver = driverRepository.save(driver);

        RegisterDriverResponse response = new RegisterDriverResponse();
        response.setId(savedDriver.getId());
        response.setFullName(savedDriver.getFullName());

        return response;
    }

    @Override
    public FindDriverResponse findDriverById(FindDriverRequest request) {


        return null;
    }

    @Override
    public List<FindDriverResponse> findAllDrivers() {
        return List.of();
    }
}
