package br.com.bussApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bussApp.domain.Intinerario;

public interface IntinerarioRepository extends JpaRepository<Intinerario, Integer> {

}
