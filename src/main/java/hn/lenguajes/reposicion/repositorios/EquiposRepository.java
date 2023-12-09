package hn.lenguajes.reposicion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.reposicion.modelos.Equipos;

public interface EquiposRepository extends JpaRepository <Equipos, Integer> {
    
}
