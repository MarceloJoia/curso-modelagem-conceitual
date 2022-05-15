package br.com.marcelojoia.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelojoia.cursomc.domain.Estado;
import br.com.marcelojoia.cursomc.services.EstadoService;

@RestController
@RequestMapping(value="/estado")
public class EstadoResource {
	
	@Autowired
	private EstadoService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Estado> find(@PathVariable Integer id) {
		
		Estado obj = service.busca(id);
		return ResponseEntity.ok().body(obj);
	}
}
