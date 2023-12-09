package hn.lenguajes.reposicion.servicios;

import hn.lenguajes.reposicion.modelos.Equipos;

public interface EquiposService {
    public Equipos crearEquipo(Equipos equipos);

    public String eliminarEquipoPorCodigo (Integer codigoEquipo);

    public Equipos obtenerEquipoPorCodigo(Integer codigoEquipo);


}
