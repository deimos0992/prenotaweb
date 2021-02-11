package com.project.prenotazione.dto;

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
	@Pattern(regexp="/^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]$/i")
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
