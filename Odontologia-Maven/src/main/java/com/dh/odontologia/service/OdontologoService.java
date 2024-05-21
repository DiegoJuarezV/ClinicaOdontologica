package com.dh.odontologia.service;

import com.dh.odontologia.dao.OdontologoDaoH2;
import com.dh.odontologia.model.Odontologo;

import java.util.List;
import java.util.Map;
import com.dh.odontologia.dao.iDao;

public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        this.odontologoiDao = new OdontologoDaoH2();
    }

    public Odontologo guardarOdontologo(Odontologo odontologo) {
        return odontologoiDao.guardar(odontologo);
    }

    public Odontologo buscarOdontologo(Integer id) {
        return odontologoiDao.buscarPorID(id);
    }

    public void actualizarOdontologo(Map<String, Object> dato, Integer id) {
        odontologoiDao.actualizar(dato, id);
    }

    public void eliminarOdontologo(int id) {
        odontologoiDao.eliminar(id);
    }

    public List<Odontologo> listarOdontologos() {
        return odontologoiDao.buscarTodos();
    }
}
