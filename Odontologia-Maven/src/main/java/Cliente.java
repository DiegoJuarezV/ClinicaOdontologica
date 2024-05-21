import com.dh.odontologia.dao.BD;
import com.dh.odontologia.model.Domicilio;
import com.dh.odontologia.model.Odontologo;
import com.dh.odontologia.model.Paciente;
import com.dh.odontologia.service.OdontologoService;
import com.dh.odontologia.service.PacienteService;

import java.sql.Date;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        BD.crearTablas();
        Odontologo odontologo = new Odontologo(12, "Diego", "Juarez");
        Odontologo odontologo1 = new Odontologo(456, "Juana", "De Arco");
        OdontologoService odontologoService = new OdontologoService();
        Odontologo odontologo01 = odontologoService.guardarOdontologo(odontologo);
        Odontologo odontologo02 = odontologoService.guardarOdontologo(odontologo1);
        System.out.println(odontologo01.toString());
        System.out.println(odontologo02.toString());

        Domicilio domicilio = new Domicilio("Zafiro", 2, "San Andres", "USA");
        Paciente paciente = new Paciente("Carla", "Alvarez", "123", Date.valueOf("2024-05-25"), domicilio);
        PacienteService pacienteService = new PacienteService();
        Paciente pacienteGuardado = pacienteService.guardarPaciente(paciente);
        System.out.println(pacienteGuardado.toString());

        Odontologo odontologoBuscado = odontologoService.buscarOdontologo(2);
        System.out.println(odontologoBuscado.toString());
        List<Odontologo> odontologoSearchAll = odontologoService.listarOdontologos();
        System.out.println(odontologoSearchAll.toString());
    }
}
