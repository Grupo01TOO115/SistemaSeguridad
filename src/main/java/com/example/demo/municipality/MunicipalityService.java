package com.example.demo.municipality;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MunicipalityService {

    public final MunicipalityRepository municipalityRepository;

    public MunicipalityService(MunicipalityRepository municipalityRepository){
        this.municipalityRepository=municipalityRepository;
    }

    public List<Municipality> getAll(){
        return municipalityRepository.findAll();
    }

    public Optional<Municipality> findByDepartament(Long id){
        return municipalityRepository.findByIdDepatament(id);
    }
}
