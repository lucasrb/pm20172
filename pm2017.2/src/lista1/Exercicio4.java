package lista1;

import java.util.Scanner;

/**
 * 
 * @author lucas
 *
 */
public class Exercicio4 {

	private static final String[] RESULTADOS = { 
			"Flamengo", "3", "0", "Volta Redonda", 
			"Volta Redonda", "1", "1", "Botafogo", 
			"Bonsucesso", "5", "0", "Macaé", 
			"Macaé", "3", "4", "Fluminense", 
			"Botafogo", "2", "2", "Flamengo"
			};

	
	/**
	 * 
	 * @param time Nome do time que se deve calcular os pontos conforme a tabela
	 * @return Quantidade de pontos obtidos pelo time
	 */
	public static int calcPontos(String time) {
		int golPro, golContra, pontos = 0;

		for (int i = 0; i < RESULTADOS.length; i++) {
			if ((i % 4) == 0) {
				if (RESULTADOS[i].equalsIgnoreCase(time)) {
					golPro = Integer.parseInt(RESULTADOS[i + 1]);
					golContra = Integer.parseInt(RESULTADOS[i + 2]);
					if (golPro > golContra) {
						pontos = pontos + 3;
					} else if (golPro == golContra) {
						pontos = pontos + 1;
					}
				}
			} else {
				if (RESULTADOS[i].equalsIgnoreCase(time)) {
					golPro = Integer.parseInt(RESULTADOS[i - 1]);
					golContra = Integer.parseInt(RESULTADOS[i - 2]);
					if (golPro > golContra) {
						pontos = pontos + 3;
					} else if (golPro == golContra) {
						pontos = pontos + 1;
					}
				}
			}
		}
		
		return pontos;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String entrada;
		
		System.out.println("Entre com o nome do time");
		entrada = scanner.nextLine();
		
		
		System.out.println("O time inserido fez um total de " + calcPontos(entrada) + " pontos");
	}

}
