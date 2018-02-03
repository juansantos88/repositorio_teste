package br.com.curso.repositories.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.domain.Categoria;
import br.com.curso.repositories.CategoriaRepository;
import br.com.curso.repositories.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer id) {
		Categoria obj = categoriaRepository.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado: " + id);
		}
		return obj;
		
	}
}
