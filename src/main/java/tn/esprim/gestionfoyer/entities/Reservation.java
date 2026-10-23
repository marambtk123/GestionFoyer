package tn.esprim.gestionfoyer.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    private String idReservation;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date anneeUniversitaire;

    private boolean estValide;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;

}
