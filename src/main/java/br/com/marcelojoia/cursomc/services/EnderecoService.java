package br.com.marcelojoia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcelojoia.cursomc.domain.Endereco;
import br.com.marcelojoia.cursomc.repositories.EnderecoRepository;
import br.com.marcelojoia.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;

	public Endereco busca(Integer id) {
		Optional<Endereco> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object não encontrado! ID: " + id + ", Tipo: " + Endereco.class.getName()));
	}
}
