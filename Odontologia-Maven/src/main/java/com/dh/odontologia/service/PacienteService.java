package com.dh.odontologia.service;

import com.dh.odontologia.dao.PacienteDAOH2;
import com.dh.odontologia.model.Paciente;
import com.dh.odontologia.dao.iDao;

import java.util.List;
import java.util.Map;

public class PacienteService {
    //relacion de asociacion directa con el DAO
    private iDao<Paciente> pacienteiDao;

    public PacienteService() {
        pacienteiDao= new PacienteDAOH2();
    }
    public Paciente guardarPaciente(Paciente paciente){
        return pacienteiDao.guardar(paciente);
    }
    public Paciente buscarPaciente(Integer id){
        return pacienteiDao.buscarPorID(id);
    }

    public void actualizarPaciente(Map<String, Object> dato, Integer id) {
        pacienteiDao.actualizar(dato, id);
    }

    public void eliminarPaciente(Integer id) {
        pacienteiDao.eliminar(id);
    }

    public List<Paciente> buscarTodos(){
        return pacienteiDao.buscarTodos();
    }
}