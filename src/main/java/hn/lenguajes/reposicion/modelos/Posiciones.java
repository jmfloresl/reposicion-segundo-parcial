package hn.lenguajes.reposicion.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Posiciones {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "empates")
    private int empates;

    @Column(name = "ganados")
    private int ganados;

    @Column(name = "perdidos")
    private int perdidos;

    @Column(name = "golesFavor")
    private int golesFavor;
    
    @Column(name = "golesContra")
    private int golesContra;

    @Column(name = "puntos")
    private int puntos;
    
    @OneToOne
    @JoinColumn(name = "codigoEquipo", unique = true)
    private Equipos equipos;
}
