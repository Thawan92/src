package teste;

import java.util.ArrayList;
import aluno.Aluno;
import prof.Professor;
import turma.Turma;

public class Principal {
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jão");
		aluno1.setIdade(15);
		aluno1.setNota(5.0);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Zé");
		aluno2.setIdade(14);
		aluno2.setNota(8.0);
		
		Professor prof1 = new Professor();
		prof1.setNome("Paulo");
		prof1.setIdade(58);
		prof1.setSalario(2500);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Jhon");
		aluno3.setIdade(19);
		aluno3.setNota(9.0);
		aluno3.setTurma("A1");
		
		Turma turma1 = new Turma();
		turma1.adicionarAluno(aluno1);
		turma1.adicionarprof(prof1);
		
		System.out.println(turma1.equals(turma1));
		System.out.println("Turma A");
		System.out.println("Aluno1");
		System.out.println(aluno1.getNome());
		System.out.println("Idade");
		System.out.println(aluno1.getIdade());
		System.out.println("Nota");
		System.out.println(aluno1.getNota());
		System.out.println("Aluno2");
		System.out.println(aluno2.getNome());
		System.out.println("Idade");
		System.out.println(aluno2.getIdade());
		System.out.println("Nota");
		System.out.println(aluno2.getNota());
		System.out.println("Aluno3");
		System.out.println(aluno3.getNome());
		System.out.println("Idade");
		System.out.println(aluno3.getIdade());
		System.out.println("Nota");
		System.out.println(aluno3.getNota());
		System.out.println("Professor");
		System.out.println(prof1.getNome());
		System.out.println("Idade");
		System.out.println(prof1.getIdade());
		System.out.println("Salário");
		System.out.println(prof1.getSalario());
		
		

	}
}
