
import java.sql.Date;

import model.*;
public class Main {

	
	public static void main(String []args){
		//INSERT INTO `mydb`.`Departamento` (`codigo`, `nome`, `bloco`) VALUES ('CCT', 'Centro de Ciências Tecnológicas', 'D');
		Fachada f = Fachada.getInstance();
		try {
			Departamento d = f.consultarDepartamento("M4");
			System.out.println("Nome do departamento: " + d.getNome());
			Professor p = f.consultarProfessor("101010");
			System.out.println("Nome do professor: " + p.getNome());
			Curso curso = f.consultarCurso("1010");
			System.out.println("Nome do curso: " + curso.getNomeCurso());
			Disciplina d1 = f.consultarDisciplina("10");
			System.out.println("Nome da disciplina: " + d1.getNomeDisciplina());
			Endereco end = new Endereco("15", "20", "ryrtu", "yytuyi");
			Aluno aluno = f.consultarAluno("15");
			System.out.println("Nome do aluno: " + aluno.getNome());
			Matricula matricula = new Matricula("12321", aluno, curso, new Date(2018, 12, 12), StatusMatriculaEnum.Ativo);
			f.inserirMatricula(matricula);
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
