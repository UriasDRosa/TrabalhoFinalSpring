package com.uri.pauloeurias.TrabalhoFinal.services;

import com.uri.pauloeurias.TrabalhoFinal.models.RifaModel;
import com.uri.pauloeurias.TrabalhoFinal.repositories.RifaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class RifaService {

    final RifaRepository rifaRepository;

    public RifaService(RifaRepository rifaRepository){
        this.rifaRepository = rifaRepository;
    }

    @Transactional
    public RifaModel save(RifaModel rifaModel) {
        return rifaRepository.save(rifaModel);
    }
}
