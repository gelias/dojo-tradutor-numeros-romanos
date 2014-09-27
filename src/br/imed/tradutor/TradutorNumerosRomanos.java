package br.imed.tradutor;

public class TradutorNumerosRomanos {

	public String traduzir(int numeroArabico) {
		StringBuilder result = new StringBuilder();
		if (numeroArabico <= 3) {
			for (int j = 0; j < numeroArabico; j++) {
				result.append("I");
			}
		}
		if (numeroArabico >= 5) {
			result.append("V").append(traduzir(numeroArabico - 5));
		}
		return result.toString();
	}
}
