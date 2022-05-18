package br.com.bussApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bussApp.domain.Linha;
import br.com.bussApp.exception.TargetNotFoundException;
import br.com.bussApp.repository.LinhaRepository;

@Service
public class LinhaService {

	@Autowired
	private LinhaRepository repository;
	
	public Linha searchById(String id) {
		Optional<Linha> linha = repository.findById(id);
		if (linha.isEmpty()) throw new TargetNotFoundException();
				
		return linha.get();
	}
	
	public List<Linha> list() {
		return repository.findAll();
	}
	
	public Linha insert(Linha linha) {
		return repository.save(linha);
	}
	
	public Linha delete(String id) {
		Optional<Linha> linhaOpt = repository.findById(id);
		if (linhaOpt.isEmpty()) throw new TargetNotFoundException();
		
		Linha linha = linhaOpt.get();
		repository.delete(linha);
		return linha;
	}
	
	public Linha edit(Linha linha) {
		return repository.save(linha);
	}
	
}
