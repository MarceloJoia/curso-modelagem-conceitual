package br.com.marcelojoia.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelojoia.cursomc.domain.Cliente;
import br.com.marcelojoia.cursomc.services.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {
	
	@Autowired
	private ClienteService service; 

	@RequestMapping(value="/{id}", method=RequestMethod.GET)	
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		
		Cliente obj = service.busca(id);
		
		return ResponseEntity.ok().body(obj);
	}

}
