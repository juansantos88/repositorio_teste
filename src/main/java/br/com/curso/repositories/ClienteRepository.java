package br.com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.curso.domain.Cliente;
import br.com.curso.domain.Produto;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
