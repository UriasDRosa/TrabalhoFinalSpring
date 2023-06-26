package com.uri.pauloeurias.TrabalhoFinal.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Table_Rifa")
public class RifaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false,unique = true,length = 3)
    private Integer RifaNumber;
    @Column(nullable = false, length = 50)
    private String RifaNome;
    @Column(nullable = false,length = 10)
    private Date RifaDataSorteio;
    @Column(nullable = false, length = 7)
    private Double RifaPreco;
    @Column(nullable = false)
    private LocalDateTime registrationDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
}
