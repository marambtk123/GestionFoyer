package tn.esprim.gestionfoyer.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;

    private String prenomEt;

    private Long cin;

    private String ecole;
    @JsonFormat(pattern="yyyy-MM-dd")

    private Date dateNaissance;
    @ManyToMany(mappedBy = "etudiants",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Reservation>reservations;
}
