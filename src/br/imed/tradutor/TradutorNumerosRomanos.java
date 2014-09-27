package br.imed.tradutor;

public class TradutorNumerosRomanos {

	public String traduzir(int numeroArabico) {
		StringBuilder result = new StringBuilder();
		if (numeroArabico <= 3) {
			for (int j = 0; j < numeroArabico; j++) {
				result.append("I");
			}
		}
		if (numeroArabico >= 5 && numeroArabico <= 8) {
			result.append("V").append(traduzir(numeroArabico - 5));
		}
		if (numeroArabico >= 10){
			result.append("X").append(traduzir(numeroArabico - 10));
		}
		return result.toString();
	}
}
