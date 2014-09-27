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
	
	@Test
	public void deveConverter_numeroArabicoSeis_numeroRomanoVI() {
		TradutorNumerosRomanos tradutor = new TradutorNumerosRomanos();
		assertEquals("VI",tradutor.traduzir(6));
	}
	
	@Test
	public void deveConverter_numeroArabicoSete_numeroRomanoVII() {
		TradutorNumerosRomanos tradutor = new TradutorNumerosRomanos();
		assertEquals("VII",tradutor.traduzir(7));
	}

	@Test
	public void deveConverter_numeroArabicoOito_numeroRomanoVIII() {
		TradutorNumerosRomanos tradutor = new TradutorNumerosRomanos();
		assertEquals("VIII",tradutor.traduzir(8));
	}
	
	@Test
	public void deveConverter_numeroArabicoDez_numeroRomanoX() {
		TradutorNumerosRomanos tradutor = new TradutorNumerosRomanos();
		assertEquals("X",tradutor.traduzir(10));
	}
}
