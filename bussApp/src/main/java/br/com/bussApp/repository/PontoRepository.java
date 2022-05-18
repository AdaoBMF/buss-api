package br.com.bussApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bussApp.domain.Ponto;

public interface PontoRepository extends JpaRepository<Ponto, Integer>{

}
