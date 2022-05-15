package br.com.marcelojoia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcelojoia.cursomc.domain.Cidade;
import br.com.marcelojoia.cursomc.repositories.CidadeRepository;
import br.com.marcelojoia.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repository;

	public Cidade busca(Integer id) {
		Optional<Cidade> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Cidade.class.getName()));
	}
}
