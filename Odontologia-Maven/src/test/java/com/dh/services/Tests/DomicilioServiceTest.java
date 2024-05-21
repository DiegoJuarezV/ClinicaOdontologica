package com.dh.services.Tests;

import com.dh.odontologia.model.Domicilio;
import com.dh.odontologia.service.DomicilioService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomicilioServiceTest {
    @org.junit.jupiter.api.Test
    public void testDomicilios() {
        Domicilio domicilio = new Domicilio("Atenas", 125, "San Antonio", "Texas");
        DomicilioService domicilioService = new DomicilioService();
        Domicilio domicilio1 = domicilioService.guardarDomicilio(domicilio);

        assertEquals(125, domicilio1.getNumero());
    }
}
