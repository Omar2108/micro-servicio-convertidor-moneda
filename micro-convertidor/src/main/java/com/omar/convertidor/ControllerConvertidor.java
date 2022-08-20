package com.omar.convertidor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class ControllerConvertidor {
	
private int trcDolar = 4231;
	
	@GetMapping("/pesos/{dolar}")
	public Monedas convertirPesos(@PathVariable int dolar) {
		Monedas mon = new Monedas();
		mon.setPesos( dolar * trcDolar);
		mon.setDolar(dolar);
		return  mon;
	}

	@GetMapping("/dolar/{pesos}")
	public Monedas convertirDolar(@PathVariable int pesos) {
		Monedas mon = new Monedas();
		mon.setDolar(pesos / trcDolar);
		mon.setPesos(pesos);
		return mon;
	}

}
