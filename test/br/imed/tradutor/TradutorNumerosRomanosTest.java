package br.imed.tradutor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TradutorNumerosRomanosTest {

	@Test
	public void deveConverter_numeroArabicoUm_numeroRomanoI() {
		TradutorNumerosRomanos tradutor = new TradutorNumerosRomanos();
		assertEquals("I",tradutor.traduzir(1));
	}

}
