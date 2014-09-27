package br.imed.tradutor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TradutorNumerosRomanosTest {

	private TradutorNumerosRomanos tradutor;

	@Before
	public void setUp(){
		this.tradutor = new TradutorNumerosRomanos();
	}
	
	@Test
	public void deveConverter_numeroArabicoUm_numeroRomanoI() {
		assertEquals("I",tradutor.traduzir(1));
	}
	
	@Test
	public void deveConverter_numeroArabicoDois_numeroRomanoII() {
		assertEquals("II",tradutor.traduzir(2));
	}
	
	@Test
	public void deveConverter_numeroArabicoCinco_numeroRomanoV() {
		assertEquals("V",tradutor.traduzir(5));
	}
	
	@Test
	public void deveConverter_numeroArabicoSeis_numeroRomanoVI() {
		assertEquals("VI",tradutor.traduzir(6));
	}
	
	@Test
	public void deveConverter_numeroArabicoSete_numeroRomanoVII() {
		assertEquals("VII",tradutor.traduzir(7));
	}

	@Test
	public void deveConverter_numeroArabicoOito_numeroRomanoVIII() {
		assertEquals("VIII",tradutor.traduzir(8));
	}
	
	@Test
	public void deveConverter_numeroArabicoDez_numeroRomanoX() {
		assertEquals("X",tradutor.traduzir(10));
	}

	@Test
	public void deveConverter_numeroArabicoOnze_numeroRomanoXI() {
		assertEquals("XI",tradutor.traduzir(11));
	}

}
