package com.example.demo.municipality;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MunicipalityRepository extends JpaRepository<Municipality, Long> {

    @Query(value = "SELECT m FROM Municipality m WHERE m.nameDepartament.idDepartament= ?1")
    List<Municipality> findByIdDepatament(Long id);
}
