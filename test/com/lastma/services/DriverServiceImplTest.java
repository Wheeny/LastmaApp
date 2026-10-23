package com.lastma.services;

import com.lastma.data.repositories.DriverRepository;
import com.lastma.dtos.requests.RegisterDriverRequest;
import com.lastma.dtos.responses.RegisterDriverResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DriverServiceImplTest {
    private DriverService driverService = new DriverServiceImpl();
//    private DriverRepository driverRepository = new DriverRepository();
    @Autowired
    private DriverRepository driverRepository;

    @Test
    public void testThatDriverCanBeRegistered() {
//        assertEquals(0, driverRepository.count());

        RegisterDriverRequest request = new RegisterDriverRequest();
        request.setFullName("Winifred Nnaji");
        request.setPhoneNumber("08012345678");
        request.setEmail("winifred@gmail.com");

        RegisterDriverResponse response = driverService.registerDriver(request);

//        assertEquals(1, driverRepository.count());
        assertNotNull(response);
        assertEquals("Winifred Nnaji", response.getFullName());
        assertEquals("winifred@gmail.com", response.getEmail());


    }

}
