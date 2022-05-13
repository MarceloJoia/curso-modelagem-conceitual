package br.com.marcelojoia.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelojoia.cursomc.domain.Produto;
import br.com.marcelojoia.cursomc.services.ProdutoService;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<Produto> find(@PathVariable Integer id) {
		
		Produto obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
