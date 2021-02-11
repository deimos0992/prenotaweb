package com.project.prenotazione.repository;

import com.project.prenotazione.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
