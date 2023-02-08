package com.pixelplay.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pixelplay.model.Tema;

@Repository
public interface TemaController extends JpaRepository<Tema, Long> {
   
 public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
