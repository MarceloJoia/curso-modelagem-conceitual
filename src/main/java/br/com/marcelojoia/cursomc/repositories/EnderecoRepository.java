package br.com.marcelojoia.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcelojoia.cursomc.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
