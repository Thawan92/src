package turma;


import java.util.ArrayList;
import aluno.Aluno;
import prof.Professor;

public class Turma{
	private String nome;
	private ArrayList<Aluno> alunos;
	
	public Turma() {
		alunos = new ArrayList<Aluno>();
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public int quantidadeAlunos() {
		return alunos.size();
	}
	
	public void excluirAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	public Aluno getAluno(int posicao) {
		return alunos.get(posicao);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void add(Turma turma) {
		// TODO Auto-generated method stub
		
	}

	public void adicionarprof(Professor prof) {
		// TODO Auto-generated method stub
		
	}
	
	
}
