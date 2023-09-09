package com.example.segundoProyecto.agregarCRUD.dao;


import com.example.segundoProyecto.agregarCRUD.domain.Individuo;
import org.springframework.data.repository.CrudRepository;

public interface IndividuoDao extends CrudRepository<Individuo, Long> {
}
