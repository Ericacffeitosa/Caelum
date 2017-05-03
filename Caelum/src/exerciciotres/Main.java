package exerciciotres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numAlunos = 0;
		while (numAlunos == 0) {
			System.out.print("Informe números de alunos: ");
			numAlunos = scan.nextInt();
			scan.nextLine();
			
			if (numAlunos < 1 || numAlunos > 100) {
				System.out.println("Informe número entre 1 e 100.");
				numAlunos = 0;
			}
		}
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int i = 0; i < numAlunos; i++) {
			System.out.print("Informe nome do Aluno: ");
			String nome = scan.nextLine();
			
			System.out.print("Quantidade de problemas resolvidos: ");
			int problemasResolvidos = 0;
			while (problemasResolvidos == 0) {
				System.out.println();
				problemasResolvidos = scan.nextInt();
				scan.nextLine();
				
				if (problemasResolvidos < 1 || problemasResolvidos > 10) {
					System.out.println("Informe número entre 1 e 10.");
					problemasResolvidos= 0;
				}
			}
					
			alunos.add(new Aluno(nome, problemasResolvidos));
		}
		
		//O método sort usa o metodo compareto da interface Comparator que eu coloquei na classe Aluno e ordena a lista
		Collections.sort(alunos); 
		
		//sempre tem que fechar o scanner para liberar o console
		scan.close();
		
		for (Aluno a : alunos) {
			System.out.println("Instância " + alunos.indexOf(a));
//			System.out.println("Aluno: " +a.getNome()+ " = " +a.getProblemasResolvidos()+ " quantidade de exercícios resolvidos.");
		}
		
		System.out.println();
		
		//O aluno reprovado é o ultimo da lista ordenada.
		Aluno reprovado = alunos.get(alunos.size() - 1);
		System.out.println("Aluno reprovado: "+ reprovado.getNome());
	}
}
