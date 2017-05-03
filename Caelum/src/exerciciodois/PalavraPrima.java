package exerciciodois;

import java.util.Scanner;

public class PalavraPrima {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String palavra = "";		
		int quantCaracteres = 0;
		while (quantCaracteres == 0) {
			System.out.println("Consultar palavra prima: ");
			palavra = scan.nextLine();
			quantCaracteres = palavra.length();
			
			if (quantCaracteres < 1 || quantCaracteres > 20) {
				System.out.println("Informe palavra de 1 a 20 caracteres.");
				quantCaracteres = 0;
			}
		}
		scan.close();
		
		int soma= 0;
		for (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);
			if (letra >= 'a' && letra <= 'z') {
				//As letras minusculas começam em 97
				soma = soma + ((int)letra) - 96;
			} else if (letra >='A' && letra <= 'Z') {
				//As letras maiusculas começam em 39
				soma = soma + ((int)letra) - 38; 
			}
			
//			System.out.println("char: "+palavra.charAt(i)+" int: "+((int) palavra.charAt(i)) );			
		} 
		
		int numDivisores = 0;
		for (int i = 1; i <= soma; i++) {
			if (soma % i == 0) {
				numDivisores++;
			}
		}
		
		if (numDivisores == 2){
			System.out.println("It is a prime word.");
		} else {
			System.out.println("It is not a prime word.");
		}
	}
}