package com.example.segundoProyecto.consumidorControl.dao;


import com.example.segundoProyecto.consumidorControl.domain.Individuo;
import org.springframework.data.repository.CrudRepository;

public interface IndividuoDao extends CrudRepository<Individuo, Long> {
}
