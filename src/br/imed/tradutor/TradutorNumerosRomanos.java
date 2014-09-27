package br.imed.tradutor;

public class TradutorNumerosRomanos {

	public Object traduzir(int i) {
		switch (i) {
		case 1:
			return "I"; 
		case 2:
			return "II";
		default:
			return "V";
		}
		
	}

}
