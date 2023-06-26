package com.uri.pauloeurias.TrabalhoFinal.controllers;

import com.uri.pauloeurias.TrabalhoFinal.dtos.RifaDto;
import com.uri.pauloeurias.TrabalhoFinal.models.RifaModel;
import com.uri.pauloeurias.TrabalhoFinal.services.RifaService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/Rifas")
public class RifaController {

    final RifaService rifaService;

    public RifaController(RifaService rifaService) {
        this.rifaService = rifaService;
    }

    @PostMapping
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid RifaDto rifaDto){
        var rifaModel = new RifaModel();
        BeanUtils.copyProperties(rifaDto, rifaModel);
        rifaModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(rifaService.save(rifaModel));
    }
}
