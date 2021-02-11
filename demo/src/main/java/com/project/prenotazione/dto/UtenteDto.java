package com.project.prenotazione.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import io.swagger.annotations.ApiModelProperty;

public class UtenteDto {
   
    @ApiModelProperty(position = 1, value = "nome", dataType = "String", example = "mario")
	@NotBlank
    private String nome;
	
    @ApiModelProperty(position = 2, value = "cognome", dataType = "String", example = "rossi")
	@NotBlank
    private String cognome;
	
    @ApiModelProperty(position = 3, value = "codiceFiscale", dataType = "String", example = "RSSMRA85T10A562S")
	@Pattern(regexp="^([A-Za-z]{6}[0-9lmnpqrstuvLMNPQRSTUV]{2}[abcdehlmprstABCDEHLMPRST]{1}[0-9lmnpqrstuvLMNPQRSTUV]{2}[A-Za-z]{1}[0-9lmnpqrstuvLMNPQRSTUV]{3}[A-Za-z]{1})|([0-9]{11})$", message = "Incorrect format")
    @NotBlank
    private String codiceFiscale;
	
    @ApiModelProperty(position = 4, value = "dataDiNascita", dataType = "String", example = "1985-12-10")
    @NotBlank
    private String dataDiNascita;

    
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

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
    
    
	
	

}
