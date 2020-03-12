package renatospringboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import renatospringboot.domain.Categoria;
import renatospringboot.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
//CommandLineRunner permite um metodo auxiliar quando a aplicacao iniciar
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	Categoria cat1 = new Categoria(null, "Informáticaa");
	Categoria cat2 = new Categoria(null, "Escritorioo");
	
	categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	
}

}
