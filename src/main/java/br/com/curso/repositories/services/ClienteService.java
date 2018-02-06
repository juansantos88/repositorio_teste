package br.com.curso.repositories.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.domain.Categoria;
import br.com.curso.domain.Cliente;
import br.com.curso.repositories.CategoriaRepository;
import br.com.curso.repositories.ClienteRepository;
import br.com.curso.repositories.services.exceptions.ErrorInternalException;
import br.com.curso.repositories.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente buscar(Integer id) {
		Cliente obj = null;
		try {
			obj = clienteRepository.findOne(id);
			if(obj == null) {
				throw new ObjectNotFoundException("Objeto não encontrado: " + id);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new ErrorInternalException("Erro Interno.");
		}
		return obj;
	}
}
