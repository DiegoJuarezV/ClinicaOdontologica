package com.dh.services.Tests;

import com.dh.odontologia.model.Domicilio;
import com.dh.odontologia.model.Paciente;
import com.dh.odontologia.service.DomicilioService;
import com.dh.odontologia.service.PacienteService;

import java.sql.Date;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteServiceTest {

    @org.junit.jupiter.api.Test
    public void testPacientes() {
        Domicilio domicilio = new Domicilio("Spring", 45, "Albuquerque", "Nuevo Mexico");
        Paciente paciente = new Paciente("Pedro", "Alvarez", "PA-001", Date.valueOf("2024-05-28"), domicilio);
        PacienteService pacienteService = new PacienteService();
        Paciente paciente1 = pacienteService.guardarPaciente(paciente);

        assertEquals("PA-001", paciente1.getCedula());
    }
}
