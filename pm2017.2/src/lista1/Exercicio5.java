package lista1;

import java.util.Scanner;

public class Exercicio5 {
	
	public static Integer levenshteinDist(String string1, String string2){
		String maior, menor;
		int matchingPos = 0, levDist = 0;
		
		if (string1.length() > string2.length()){
			maior = string1;
			menor = string2;
		} else {
			maior = string2;
			menor = string1;
		}
		
		if(maior.length() == 0){
			System.out.println("Ambas as strings estão vazias");
			return null;
		} else if (menor.length() == 0){
			System.out.println("A distância de Levenshtein dessas strings é " + maior.length());
			return maior.length();
		}
		
		for (int i = 0; i < menor.length(); i++){
			if (maior.charAt(i) == menor.charAt(i)){
				matchingPos++;
			}
		}
		if ((maior.length() == menor.length()) && (maior.length() == matchingPos)){
			System.out.println("Ambas as strigs são iguais, distância de Levenshtein é igual a 0");
			return 0;
		}
		
		levDist = maior.length() - matchingPos;
		System.out.println("A distância de Levenshtein dessas strings é " + levDist);
		return levDist;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String string1, string2;
		
		System.out.println("Entre a primeira palavra para calcular a distância de Levenshtein");
		string1 = scanner.nextLine();

		
		System.out.println("Entre a segunda palavra para calcular a distância de Levenshtein");
		string2 = scanner.nextLine();
		
		levenshteinDist(string1, string2);
	}
	
}
