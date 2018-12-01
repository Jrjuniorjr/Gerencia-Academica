
import java.sql.Date;

import model.*;
public class Main {

	
	public static void main(String []args){
		//INSERT INTO `mydb`.`Departamento` (`codigo`, `nome`, `bloco`) VALUES ('CCT', 'Centro de Ciências Tecnológicas', 'D');
		Fachada f = Fachada.getInstance();
		try {
			Departamento d = f.consultarDepartamento("comap");
			System.out.println("Nome do departamento: " + d.getNome());
			Professor p = f.consultarProfessor("502");
			System.out.println("Nome do professor: " + p.getNome());
			Curso curso = f.consultarCurso("edz3531");
			System.out.println("Nome do curso: " + curso.getNomeCurso());
			Disciplina d1 = f.consultarDisciplina("cvc443");
			System.out.println("Nome da disciplina: " + d1.getNomeDisciplina());
		//	Endereco end = new Endereco("15", "20", "ryrtu", "yytuyi");
			Aluno aluno = f.consultarAluno("7");
			System.out.println("Nome do aluno: " + aluno.getNome());
	//		Matricula matricula = new Matricula(aluno, curso, new Date(2018, 12, 12), StatusMatriculaEnum.Ativo);
	//		f.inserirMatricula(matricula);
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
