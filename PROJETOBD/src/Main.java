
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
			Matricula matricula = new Matricula(aluno, curso, "4224343534", new Date(2009, 01, 14),
					StatusMatriculaEnum.Ativo);
			f.atualizarMatricula(matricula);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
