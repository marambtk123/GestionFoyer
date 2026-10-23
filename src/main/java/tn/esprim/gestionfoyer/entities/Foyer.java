package tn.esprim.gestionfoyer.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;

    private Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;


    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "foyer")
    private List<Bloc> blocs;

}
