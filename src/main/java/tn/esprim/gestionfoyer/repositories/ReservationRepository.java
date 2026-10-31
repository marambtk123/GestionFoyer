package tn.esprim.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestionfoyer.entities.Reservation;

import java.util.List;

@Repository

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    List<Reservation> findByEstValideTrue();
    List<Reservation> findByEtudiantsCin(long cin);



}

