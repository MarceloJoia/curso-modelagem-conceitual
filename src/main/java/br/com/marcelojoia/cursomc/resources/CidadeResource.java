package br.com.marcelojoia.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelojoia.cursomc.domain.Cidade;
import br.com.marcelojoia.cursomc.services.CidadeService;

@RestController
@RequestMapping(value="/cidade")
public class CidadeResource {
	
	@Autowired
	private CidadeService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Cidade> find(@PathVariable Integer id) {
		Cidade obj = service.busca(id);
		return ResponseEntity.ok().body(obj);
	}

}
