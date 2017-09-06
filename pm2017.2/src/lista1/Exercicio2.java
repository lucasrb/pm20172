package lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
	
	
	public static ArrayList<Integer> divisores(Integer entrada){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 1; i <= entrada; i++){
			if ((entrada % i) == 0){
				lista.add(i);
			}
		}
		
		return lista;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int entrada;
		
		System.out.println("Entre com o número a obter seus divisores");
		entrada = scanner.nextInt();
		
		System.out.println(divisores(entrada).toString());
		
	}
	
}


