package com.example.segundoProyecto.consumidorControl.services;

import com.example.segundoProyecto.consumidorControl.dao.IndividuoDao;
import com.example.segundoProyecto.consumidorControl.domain.Individuo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndividuoServicesImp implements IndividuoServices{

    @Autowired
    private IndividuoDao individuoDao;
    @Override
    public List<Individuo> listaIndividuos() {
        return (List<Individuo>) individuoDao.findAll();
    }

    @Override
    public void salvar(Individuo individuo) {
        individuoDao.save(individuo);

    }

    @Override
    public void borrar(Individuo individuo) {

        individuoDao.delete(individuo);
    }

    @Override
    public Individuo localizarIndividuo(Individuo individuo) {
        return individuoDao.findById(individuo.getId_individuo()).orElse(null);
    }
}
