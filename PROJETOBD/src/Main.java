
import java.sql.Date;

import model.*;
public class Main {

	
	public static void main(String []args){
		//INSERT INTO `mydb`.`Departamento` (`codigo`, `nome`, `bloco`) VALUES ('CCT', 'Centro de Ciências Tecnológicas', 'D');
		Fachada f = Fachada.getInstance();
		try {
			Departamento d = f.consultarDepartamento("EXT");
			System.out.println("Codigo: " + d.getCodigo() + "----Nome: " + d.getNome() + "---Bloco" + d.getBloco());
			Curso curso = f.consultarCurso("M4");
			System.out.println("Nome: " +curso.getNomeCurso());
			Professor p = f.consultarProfessor("4345");
			System.out.println("Matricula: " + p.getMatricula() + "----Nome:" + p.getNome());
			Disciplina disciplina = f.consultarDisciplina("INF0207");
			System.out.println("Nome: " + disciplina.getNomeDisciplina());
			Aluno aluno = f.consultarAluno("4234355"); 
			System.out.println("Nome Aluno: " + aluno.getNome());
			Matricula matricula = f.consultarMatricula("4224343534");
			System.out.println("MAtricula: " + matricula.getMatricula() + "-----Data de inserção: " + matricula.getDataInicio());
			DisciplinasPeriodoAtual dpa = new DisciplinasPeriodoAtual(10.0, 9.0, matricula.getMatricula(), disciplina.getCodigo());
			f.inserirDisciplinasPeriodoAtual(dpa);
			//DisciplinasPeriodoAtual dpa = f.consultarDisciplinasPeriodoAtual("123456888");
			//System.out.println(dpa.getMatriculaAluno() + "---" + dpa.getCodigoDisciplina() + "---" + dpa.getPrimeiroGQ());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
