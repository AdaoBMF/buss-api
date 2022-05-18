package br.com.bussApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bussApp.domain.Linha;

public interface LinhaRepository extends JpaRepository<Linha, String> {

}
