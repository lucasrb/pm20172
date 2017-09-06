package lista1;

import java.util.Scanner;
import java.util.concurrent.locks.StampedLock;

import javax.management.InvalidAttributeValueException;

import org.omg.CORBA.DynAnyPackage.InvalidValue;


/**
 * 
 * @author lucas
 *
 */
public class Exercicio1 {
	
	enum tipoTriangulo{
		EQUIL�TERO,
		ESCALENO,
		IS�SCELES
	}
	
	/**
	 * 
	 * @param lado1 Par�metro assumido como um dos lados para o tri�ngulo
	 * @param lado2 Par�metro assumido como um dos lados para o tri�ngulo
	 * @param lado3 Par�metro assumido como um dos lados para o tri�ngulo
	 * @return Retorna o tipo do tri�ngulo como string, ou null em caso de erro
	 */
	public static String verificarTriangulo(int lado1, int lado2, int lado3){
		if ((lado1 > (lado2 + lado3)) || (lado2 > (lado1 + lado3)) || (lado3 > (lado1 + lado2))){
			System.out.println("N�o � poss�vel formar um tri�ngulo com os valores fornecidos");
			return null;
		}
		
		if ((lado1 == lado2) && (lado1 == lado3)){
			return tipoTriangulo.EQUIL�TERO.toString();
		}
		
		if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)){
			return tipoTriangulo.IS�SCELES.toString();
		}
		
		return tipoTriangulo.ESCALENO.toString();
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entrada1, entrada2, entrada3;
		
		System.out.println("Entre com o valor de um lado do tri�ngulo");
		entrada1 = scanner.nextInt();
		
		System.out.println("Entre com o valor de um lado do tri�ngulo");
		entrada2 = scanner.nextInt();
		
		System.out.println("Entre com o valor de um lado do tri�ngulo");
		entrada3 = scanner.nextInt();
		
		
		if(verificarTriangulo(entrada1, entrada2, entrada3) != null){
			System.out.println(verificarTriangulo(entrada1, entrada2, entrada3));
		}
		
	}
	
}
