package hn.lenguajes.reposicion.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.reposicion.modelos.Equipos;
import hn.lenguajes.reposicion.repositorios.EquiposRepository;
import hn.lenguajes.reposicion.servicios.EquiposService;

@Service
public class EquiposServiceImpl implements EquiposService {

    @Autowired
    private EquiposRepository EquiposRepository;

    @Override
    public Equipos crearEquipo(Equipos nvoequipos) {
        Equipos EquipoGuardado = EquiposRepository.save(nvoequipos);
        return EquipoGuardado; 
    }

    @Override
    public String eliminarEquipoPorCodigo(Integer codigoEquipo) {
        Equipos EquipoEliminar = this.EquiposRepository.findById(codigoEquipo).get();

        if(EquipoEliminar != null){
            this.EquiposRepository.delete(EquipoEliminar);
            return "Se ha eliminado el equipo que tiene codigo " + EquipoEliminar.getCodigoEquipo();
        }

        return "No existe el equipo con codigo " + codigoEquipo;
    }

    @Override
    public Equipos obtenerEquipoPorCodigo(Integer codigoEquipo) {
        Equipos EquipoEncontrado = this.EquiposRepository.findById(codigoEquipo).get();
        return EquipoEncontrado;
    }
    
}
