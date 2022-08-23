package com.omar.convertidor;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MicroConvertidorApplicationTests {
	
	@Autowired
	private ControllerConvertidor control;

	@Test
	public void convertirPesos() {
		Monedas moneda = control.convertirPesos(10.00);
		assertThat(moneda.getPesos()).isEqualTo(42310.0);
		
		
	}
	
	@Test
	public void convertirDolar() {
		Monedas moneda = control.convertirPesos(100000.00);
		assertThat(moneda.getDolar()).isEqualTo(23.63507445048452);
	}

}
