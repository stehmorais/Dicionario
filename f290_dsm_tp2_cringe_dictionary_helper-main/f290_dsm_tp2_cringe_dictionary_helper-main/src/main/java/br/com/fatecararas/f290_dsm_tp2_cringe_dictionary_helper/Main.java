package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.model.Palavra;
import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.services.PalavraService;

@SpringBootApplication
public class Main implements CommandLineRunner{

	//TODO: Criar instancia do PalavraService
	@Autowired
	private PalavraService service;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		// List<Palavra> palavras = service.obterTodas();
		// System.out.println(palavras);

		// Palavra p = new Palavra("Teste", "Teste Cringe");

		// service.adicionar(p);

		// palavras = service.obterTodas();
		// System.out.println(palavras);
	}

}