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
		EQUILÁTERO,
		ESCALENO,
		ISÓSCELES
	}
	
	/**
	 * 
	 * @param lado1 Parâmetro assumido como um dos lados para o triângulo
	 * @param lado2 Parâmetro assumido como um dos lados para o triângulo
	 * @param lado3 Parâmetro assumido como um dos lados para o triângulo
	 * @return Retorna o tipo do triângulo como string, ou null em caso de erro
	 */
	public static String verificarTriangulo(int lado1, int lado2, int lado3){
		if ((lado1 > (lado2 + lado3)) || (lado2 > (lado1 + lado3)) || (lado3 > (lado1 + lado2))){
			System.out.println("Não é possível formar um triângulo com os valores fornecidos");
			return null;
		}
		
		if ((lado1 == lado2) && (lado1 == lado3)){
			return tipoTriangulo.EQUILÁTERO.toString();
		}
		
		if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)){
			return tipoTriangulo.ISÓSCELES.toString();
		}
		
		return tipoTriangulo.ESCALENO.toString();
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entrada1, entrada2, entrada3;
		
		System.out.println("Entre com o valor de um lado do triângulo");
		entrada1 = scanner.nextInt();
		
		System.out.println("Entre com o valor de um lado do triângulo");
		entrada2 = scanner.nextInt();
		
		System.out.println("Entre com o valor de um lado do triângulo");
		entrada3 = scanner.nextInt();
		
		
		if(verificarTriangulo(entrada1, entrada2, entrada3) != null){
			System.out.println(verificarTriangulo(entrada1, entrada2, entrada3));
		}
		
	}
	
}
