package renatospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import renatospringboot.services.S3Service;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

//	@Autowired
//	private S3Service s3Service;
	

	//CommandLineRunner permite um metodo auxiliar quando a aplicacao iniciar
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//s3Service.uploadFile("C:\\Users\\Usuario\\code\\udemy-docker-mastery\\compose-sample-3\\html\\img\\portfolio\\06-full.jpg"); 
	}

}
