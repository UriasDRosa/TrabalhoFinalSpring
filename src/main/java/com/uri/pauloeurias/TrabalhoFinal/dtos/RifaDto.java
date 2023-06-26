package com.uri.pauloeurias.TrabalhoFinal.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class RifaDto {
    @NotBlank
    @Size(max = 3)
    private Integer RifaNumber;
    @NotBlank
    @Size(max = 50)
    private String RifaNome;
    @NotBlank
    @Size(max = 10)
    private Date RifaDataSorteio;
    @NotBlank
    @Size(max = 7)
    private Double RifaPreco;

    public Integer getRifaNumber() {
        return RifaNumber;
    }

    public void setRifaNumber(Integer rifaNumber) {
        RifaNumber = rifaNumber;
    }

    public String getRifaNome() {
        return RifaNome;
    }

    public void setRifaNome(String rifaNome) {
        RifaNome = rifaNome;
    }

    public Date getRifaDataSorteio() {
        return RifaDataSorteio;
    }

    public void setRifaDataSorteio(Date rifaDataSorteio) {
        RifaDataSorteio = rifaDataSorteio;
    }

    public Double getRifaPreco() {
        return RifaPreco;
    }

    public void setRifaPreco(Double rifaPreco) {
        RifaPreco = rifaPreco;
    }
}
