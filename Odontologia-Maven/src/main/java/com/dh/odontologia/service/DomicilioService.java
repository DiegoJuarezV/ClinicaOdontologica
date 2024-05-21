package com.dh.odontologia.service;

import com.dh.odontologia.dao.DomicilioDaoH2;
import com.dh.odontologia.model.Domicilio;
import com.dh.odontologia.dao.iDao;

import java.util.List;
import java.util.Map;

public class DomicilioService {
    private iDao<Domicilio> domicilioiDao;

    public DomicilioService() {
        domicilioiDao = new DomicilioDaoH2();
    }
    public Domicilio guardarDomicilio(Domicilio domicilio){
        return domicilioiDao.guardar(domicilio);
    }
    public Domicilio buscarDomicilio(Integer id){
        return domicilioiDao.buscarPorID(id);
    }

    public void actualizarDomicilio(Map<String, Object> dato, Integer id) {
        domicilioiDao.actualizar(dato, id);
    }

    public void eliminarDomicilio(Integer id) {
        domicilioiDao.eliminar(id);
    }

    public List<Domicilio> buscarTodos(){
        return domicilioiDao.buscarTodos();
    }
}
