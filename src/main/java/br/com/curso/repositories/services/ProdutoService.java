package br.com.curso.repositories.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.domain.Produto;
import br.com.curso.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoReposito;

	public Produto buscar(Integer id) {
		return produtoReposito.findOne(id);
		
	}
}
