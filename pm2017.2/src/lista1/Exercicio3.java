package lista1;

import java.util.Scanner;

/**
 * 
 * @author lucas
 *
 */
public class Exercicio3 {

	enum situacaoAluno {
		APROVADO,
		FINAL,
		REPROVADO
	}
	
	
	/**
	 * 
	 * @param nota1 Uma nota de avalia��o do aluno
	 * @param nota2 Uma nota de avalia��o do aluno
	 * @param nota3 Uma nota de avalia��o do aluno
	 * @param notaAprov M�dia de aprova��o, considerando uma nota igual ou maior que
	 * @param notaProvFinal M�dia de prova final, considerando uma nota maior que
	 * @return
	 */
	public static String calcMedia(double nota1, double nota2, double nota3, double notaAprov, double notaProvFinal) {
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= notaAprov){
			return situacaoAluno.APROVADO.toString();
		} else if (media > notaProvFinal){
			return situacaoAluno.FINAL.toString();
		} else {
			return situacaoAluno.REPROVADO.toString();
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota1, nota2, nota3, aprov, pFinal;

		System.out.println("Insira a primeira nota do aluno");
		nota1 = scanner.nextDouble();

		System.out.println("Insira a segunda nota do aluno");
		nota2 = scanner.nextDouble();

		System.out.println("Insira a terceira nota do aluno");
		nota3 = scanner.nextDouble();

		System.out.println("Insira a m�dia de aprova��o");
		aprov = scanner.nextDouble();

		System.out.println("Insira a m�dia de prova final");
		pFinal = scanner.nextDouble();

		System.out.println(calcMedia(nota1, nota2, nota3, aprov, pFinal));

	}

}
