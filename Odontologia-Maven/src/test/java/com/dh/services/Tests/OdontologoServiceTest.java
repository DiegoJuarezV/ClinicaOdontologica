package com.dh.services.Tests;

import com.dh.odontologia.dao.BD;
import com.dh.odontologia.model.Odontologo;
import com.dh.odontologia.service.OdontologoService;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OdontologoServiceTest {
    @org.junit.jupiter.api.Test

    public void testListarTodosLosOdontologos() {
        BD.crearTablas();
        Odontologo odontologo = new Odontologo(12, "Diego", "Juarez");
        Odontologo odontologo1 = new Odontologo(456, "Juana", "De Arco");
        OdontologoService odontologoService = new OdontologoService();
        Odontologo odontologo01 = odontologoService.guardarOdontologo(odontologo);
        Odontologo odontologo02 = odontologoService.guardarOdontologo(odontologo1);

        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        assertEquals(2, odontologos.size());
    }
}