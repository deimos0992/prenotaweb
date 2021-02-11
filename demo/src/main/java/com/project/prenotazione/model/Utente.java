package com.project.prenotazione.model;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_utente;

    @NotBlank(message = "nome is required")
    private String nome;

    @NotBlank(message = "cognome is required")
    private String cognome;
    
    @NotBlank(message = "codiceFiscale is required")
    private String codiceFiscale;
    
    private LocalDate dataDiNascita;

    
	public Long getId_utente() {
		return id_utente;
	}

	public void setId_utente(Long id_utente) {
		this.id_utente = id_utente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

    
}
