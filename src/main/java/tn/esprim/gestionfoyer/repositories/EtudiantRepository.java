package tn.esprim.gestionfoyer.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import tn.esprim.gestionfoyer.entities.Etudiant;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findBydateNaissance(LocalDate dateDebut, LocalDate dateFin);
    List<Etudiant> findBydateNaissance(Date dFrom, Date dTo);


}
