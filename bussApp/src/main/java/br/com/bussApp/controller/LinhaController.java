package br.com.bussApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.bussApp.domain.Linha;
import br.com.bussApp.exception.TargetNotFoundException;
import br.com.bussApp.service.LinhaService;

@RestController
@RequestMapping("/linhas")
public class LinhaController {

	@Autowired
	private LinhaService service;

	@GetMapping
	public List<Linha> list() {
		return service.list();
	}

	@GetMapping("/{id}")
	public Linha findById(@PathVariable String id) {
		try {
			return service.searchById(id);
		} catch (TargetNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Linha não encontrada", e); 
		}
		
	}
	
	@PostMapping
	public Linha insert(@RequestBody Linha linha) {
		return service.insert(linha);
	}
	
	@DeleteMapping("/{id}")
	public Linha remove(@PathVariable String id) {
		try {
			return service.delete(id);
		} catch (TargetNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Linha não encontrada", e);
		}
	}
	
	@PutMapping
	public Linha update(@RequestBody Linha linha) {
		return service.edit(linha);
	}
	
	
}
