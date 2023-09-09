package com.example.segundoProyecto.consumidorControl.services;

import com.example.segundoProyecto.consumidorControl.domain.Individuo;

public abstract class IndividuoServices {
    public abstract Iterable<Individuo> listaIndividuos();
    public abstract void salvar(Individuo individuo);
    public abstract void borrar(Individuo individuo);
    public abstract Individuo localizarIndividuo(Individuo individuo);
}
