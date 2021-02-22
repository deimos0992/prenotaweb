package com.project.prenotazione.service;

import com.project.prenotazione.dto.UserDto;
import com.project.prenotazione.dto.UtenteDto;
import com.project.prenotazione.exception.UtenteException;
import com.project.prenotazione.model.Utente;
import com.project.prenotazione.repository.UtenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository utenteRepository;
/**
 * <h1> Nuova </h1>*/
	
	public List<Utente> getAllUser() {
		return utenteRepository.findAll();
	}

	public Utente getSingleUser(Long id) {
		Optional<Utente> user = utenteRepository.findById(id);
		return user.orElseThrow(() -> new UtenteException("utente con id: " + id + " non trovato"));
	}

	public Utente saveUser(UtenteDto utenteDto) {

		Utente utente = new Utente();
		
		utente.setNome(utenteDto.getNome());
		utente.setCognome(utenteDto.getCognome());
		utente.setCodiceFiscale(utenteDto.getCodiceFiscale());
		utente.setDataDiNascita(LocalDate.parse(utenteDto.getDataDiNascita()));
		utenteRepository.save(utente);
		
		return utente;
	}

	public Utente modifySingleUser(Long id, UtenteDto utenteDto) {
		
		Utente utente = getSingleUser(id);
		utente.setNome(utenteDto.getNome());
		utente.setCognome(utenteDto.getCognome());
		utente.setCodiceFiscale(utenteDto.getCodiceFiscale());
		utente.setDataDiNascita(LocalDate.parse(utenteDto.getDataDiNascita()));
		
		utenteRepository.save(utente);
		
		return utente;
	}

	public void deleteUtente(Long id) {
		
		utenteRepository.deleteById(id);
		
	}
}
