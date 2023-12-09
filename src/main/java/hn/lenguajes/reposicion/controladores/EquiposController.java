package hn.lenguajes.reposicion.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes.reposicion.modelos.Equipos;
import hn.lenguajes.reposicion.servicios.Impl.EquiposServiceImpl;

@RestController
@RequestMapping("/api/Equipos")
public class EquiposController {

    @Autowired
    private EquiposServiceImpl equiposServiceImpl;

    @PostMapping("/crear")
    public Equipos crearEquipo(@RequestBody Equipos nvoEquipos){

        return this.equiposServiceImpl.crearEquipo(nvoEquipos);
    }

    @DeleteMapping("/eliminar")
    public String eliminarEquipoPorCodigo(@RequestParam(name= "codigoEquipo") Integer codigoEquipo){ 
        return this.equiposServiceImpl.eliminarEquipoPorCodigo(codigoEquipo); 
    }

    @GetMapping("/BuscarEquipo")
    public Equipos obtenerEquipoPorCodigo(@RequestParam int codigoEquipo) {
    return this.equiposServiceImpl.obtenerEquipoPorCodigo(codigoEquipo);
    }
    
}
