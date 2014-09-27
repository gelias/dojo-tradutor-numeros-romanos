package br.imed.tradutor;

public class TradutorNumerosRomanos {

	public String traduzir(int numeroArabico) {
		StringBuilder result = new StringBuilder();
		traduzirMenorIgualQuatro(numeroArabico, result);
		traduzirCincoAOito(numeroArabico, result);
		traduzirMaiorDez(numeroArabico, result);
		return result.toString();
	}

	private void traduzirMenorIgualQuatro(int numeroArabico,
			StringBuilder result) {
		if (numeroArabico <= 3) {
			for (int j = 0; j < numeroArabico; j++) {
				result.append("I");
			}
		}
	}

	private void traduzirMaiorDez(int numeroArabico, StringBuilder result) {
		if (numeroArabico >= 10){
			result.append("X").append(traduzir(numeroArabico - 10));
		}
	}

	private void traduzirCincoAOito(int numeroArabico, StringBuilder result) {
		if (numeroArabico >= 5 && numeroArabico <= 8) {
			result.append("V").append(traduzir(numeroArabico - 5));
		}
	}
}
