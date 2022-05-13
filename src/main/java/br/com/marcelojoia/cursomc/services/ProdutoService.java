package br.com.marcelojoia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcelojoia.cursomc.domain.Produto;
import br.com.marcelojoia.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public Produto buscar(Integer id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
