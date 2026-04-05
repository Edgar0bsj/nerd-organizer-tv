package com.github.nerdorganizer.nerd_organizer_tv;

import com.github.nerdorganizer.nerd_organizer_tv.model.Serie;
import com.github.nerdorganizer.nerd_organizer_tv.repository.SerieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NerdOrganizerTvApplicationTests {

	@Autowired
	private SerieRepository serieRepository;

	@Test
	void deveSalvarSerie() {
		Serie serie = new Serie();

		serie.setTitulo("Breaking Bad");
		serie.setGenero("Drama");
		serie.setTemporada(5);

		var result = serieRepository.save(serie);

		System.out.println("Resultado>> " + result);
		System.out.println("Tipo de dado>>> " + result.getClass().getName());


		assertEquals(serie,result);
	}


}
