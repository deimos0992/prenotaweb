package com.project.prenotazione.controller;

import com.project.prenotazione.dto.UtenteDto;
import com.project.prenotazione.model.Utente;
import com.project.prenotazione.service.UtenteService;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/utente")
public class UserController {

	@Autowired
	private UtenteService service;

	@GetMapping("/utente")
	public ResponseEntity<List<Utente>> getAllUtenti() {
		List<Utente> utentiList = service.getAllUser();
		return ResponseEntity.ok(utentiList);
	}

	@PostMapping("/utente")
	public ResponseEntity<Utente> saveSingleUtente(@Validated @RequestBody UtenteDto utenteDto) {
		Utente utente = service.saveUser(utenteDto);
		return ResponseEntity.ok(utente);
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<Utente> putSingleUser(@RequestParam Long id, @RequestBody UtenteDto utenteDto) {
		Utente utente = service.modifySingleUser(id, utenteDto);
		return ResponseEntity.ok(utente);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteSingleUtente(@RequestParam Long id){
		
		service.deleteUtente(id);
		return ResponseEntity.ok("ok");
		
	}

}
