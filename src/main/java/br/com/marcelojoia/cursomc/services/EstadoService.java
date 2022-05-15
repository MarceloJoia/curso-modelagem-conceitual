package br.com.marcelojoia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcelojoia.cursomc.domain.Estado;
import br.com.marcelojoia.cursomc.repositories.EstadoRepository;
import br.com.marcelojoia.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repository;

	public Estado busca(Integer id) {
		Optional<Estado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Ojeto não encontrado! ID :" + id + ", Tipo: " + Estado.class.getName()));
	}
}
