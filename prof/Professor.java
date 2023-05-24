package prof;

import pessoa.Pessoa;
import turma.Turma;
import java.util.ArrayList;

public class Professor extends Pessoa{
	private double salario;
	
	private ArrayList<Turma> turma;
	
	public Professor() {
		turma = new ArrayList<Turma>();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void adicionarTurma(Turma turma) {
		turma.add(turma);
	}
	}
	


