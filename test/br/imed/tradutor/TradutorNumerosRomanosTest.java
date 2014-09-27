package br.imed.tradutor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TradutorNumerosRomanosTest {

	@Test
	public void deveConverter_numeroArabicoUm_numeroRomanoI() {
		TradutorNumerosRomanos tradutor = new TradutorNumerosRomanos();
		assertEquals("I",tradutor.traduzir(1));
	}
	
	@Test
	public void deveConverter_numeroArabicoDois_numeroRomanoII() {
		TradutorNumerosRomanos tradutor = new TradutorNumerosRomanos();
		assertEquals("II",tradutor.traduzir(2));
	}
	
	@Test
	public void deveConverter_numeroArabicoCinco_numeroRomanoV() {
		TradutorNumerosRomanos tradutor = new TradutorNumerosRomanos();
		assertEquals("V",tradutor.traduzir(5));
	}
}
