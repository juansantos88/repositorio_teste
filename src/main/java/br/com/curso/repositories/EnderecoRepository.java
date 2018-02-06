package br.com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.curso.domain.Endereco;
import br.com.curso.domain.Produto;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
