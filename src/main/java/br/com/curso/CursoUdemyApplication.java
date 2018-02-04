package br.com.curso;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.curso.domain.Cidade;
import br.com.curso.domain.Estado;
import br.com.curso.repositories.CategoriaRepository;
import br.com.curso.repositories.CidadeRepository;
import br.com.curso.repositories.EstadoRepository;
import br.com.curso.repositories.ProdutoRepository;

@SpringBootApplication
public class CursoUdemyApplication implements CommandLineRunner{

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoUdemyApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		/*Produto p1 = new Produto(null, "Computador", 2000.0);
		Produto p2 = new Produto(null, "Impressora", 800.0);
		Produto p3 = new Produto(null, "Mouse", 80.0);
		
		Categoria categoria1 = categoriaRepository.findOne(1);
		categoria1.setProdutos(Arrays.asList(p1,p2,p3));
		Categoria categoria2 = categoriaRepository.findOne(2);
		categoria2.setProdutos(Arrays.asList(p2));
		
		p1.setCategorias(Arrays.asList(categoria1));
		p2.setCategorias(Arrays.asList(categoria1,categoria2));
		p3.setCategorias(Arrays.asList(categoria1));
		
		//categoriaRepository.save(categoria2);
		//categoriaRepository.save(categoria1);
		
		produtoRepository.save(Arrays.asList(p1,p2,p3));*/
		
		Estado estado1 = new Estado(null,"Minas Gerais");
		Estado estado2 = new Estado(null,"São Paulo");
		
		Cidade cidade1 = new Cidade(null,"Uberlândia",estado1);
		Cidade cidade2 = new Cidade(null,"São Paulo",estado2);
		Cidade cidade3 = new Cidade(null,"Campinas",estado2);
		
		estado1.getCidades().addAll(Arrays.asList(cidade1));
		estado2.getCidades().addAll(Arrays.asList(cidade2,cidade3));
		
		estadoRepository.save(Arrays.asList(estado1,estado2));
		
		cidadeRepository.save(Arrays.asList(cidade1,cidade2,cidade3));
		
		
	}
}
