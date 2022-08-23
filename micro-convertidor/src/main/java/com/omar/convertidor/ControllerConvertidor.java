package com.omar.convertidor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class ControllerConvertidor {

	@Value("${app.trm}")
	private Integer trm;
	

	@GetMapping("/pesos/{dolar}")
	public Monedas convertirPesos(@PathVariable Double dolar) {
		Monedas mon = new Monedas();
		mon.setPesos(dolar * trm);
		mon.setTrm(trm);
		mon.setDolar(dolar);
		return mon;
	}

	@GetMapping("/dolar/{pesos}")
	public Monedas convertirDolar(@PathVariable Double pesos) {
		Monedas mon = new Monedas();
		mon.setDolar(pesos / trm);
		mon.setTrm(trm);
		mon.setPesos(pesos);
		return mon;
	}

}
