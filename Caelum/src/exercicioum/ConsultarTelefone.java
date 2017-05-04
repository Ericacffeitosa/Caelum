package exercicioum;

import java.util.Scanner;

public class ConsultarTelefone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String palavra = "";		
		int quantCaracteres = 0;
		while (quantCaracteres == 0) {
			System.out.println("Informe a palavra : ");
			palavra = scan.nextLine();
			quantCaracteres = palavra.length();
			
			if (quantCaracteres < 1 || quantCaracteres > 30) {
				System.out.println("Informe palavra de 1 a 30 caracteres.");
				quantCaracteres = 0;
			}
		}
		scan.close();
		
		String telefone = "";
		for (int i = 0; i < quantCaracteres; i++) {
			char letra = palavra.charAt(i);
			
			switch (letra) {
			case 'A':
			case 'B': 
			case 'C':
				telefone += '2';
				break;
			case 'D':
			case 'E': 
			case 'F':
				telefone +='3';
				break;
			case 'G':
			case 'H': 
			case 'I':
				telefone +='4';
				break;
			case 'J':
			case 'K': 
			case 'L':
				telefone +='5';
				break;
			case 'M':
			case 'N': 
			case 'O':
				telefone +='6';
				break;
			case 'P':
			case 'Q': 
			case 'R':
			case 'S': 
				telefone +='7';
				break;
			case 'T':
			case 'U': 
			case 'V':
				telefone +='8';
				break;
			case 'W':
			case 'X': 
			case 'Y':
			case 'Z':
				telefone +='9';
				break;
			case '0':
			case '1':
			//o tracinho copiado do texto não funciona, tem que digitar
			case '-':
				telefone += letra; 
				break;
			default:
				System.out.println("Numero não identificado");
				return;
			}
		}

		System.out.println(telefone);
	}

}
