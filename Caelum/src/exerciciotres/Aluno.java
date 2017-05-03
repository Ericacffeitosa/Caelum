package exerciciotres;
import java.lang.Comparable;

public class Aluno implements Comparable<Aluno> {
	
	private String nome;
	private int problemasResolvidos;
	
	public Aluno (String nome, int problemasResolvidos) {
		this.nome = nome;
		this.problemasResolvidos = problemasResolvidos;
	}
	
//	Método que compara quant. de problemas resolvidos.
	@Override
	public int compareTo(Aluno outroAluno) {
		if (this.problemasResolvidos > outroAluno.problemasResolvidos) {
			return -1;
		}
		if (this.problemasResolvidos < outroAluno.problemasResolvidos) {
			return 1;
		}
		
		return nome.compareTo(outroAluno.nome);
	}
		
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getProblemasResolvidos() {
		return problemasResolvidos;
	}
	public void setProblemasResolvidos(int problemasResolvidos) {
		this.problemasResolvidos = problemasResolvidos;
	}
}	