package tn.esprim.gestionfoyer.entities;

import jakarta.persistence.*;


@Entity

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;

    private String adresse;

    @OneToOne(cascade = CascadeType.ALL)
    private Foyer foyer;
}
