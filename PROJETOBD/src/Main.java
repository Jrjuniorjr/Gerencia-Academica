
import java.sql.Date;

import model.*;
public class Main {

	
	public static void main(String []args){
		//INSERT INTO `mydb`.`Departamento` (`codigo`, `nome`, `bloco`) VALUES ('CCT', 'Centro de Ciências Tecnológicas', 'D');
		Fachada f = Fachada.getInstance();
		try {
		/*(	Departamento dep = f.consultarDepartamento("CCT");
			Professor professor = f.consultarProfessor("123");
			Curso curso = f.consultarCurso("123");
			Endereco end = new Endereco("123", "5250", "a", "o");
			Aluno aluno = f.consultarAluno("123");
			*/
			Disciplina disciplina = f.consultarDisciplina("123");
			Matricula matricula = f.consultarMatricula("3381230");
			DisciplinasPeriodoAtual dpa = f.consultarDisciplinasPeriodoAtualPorId(4);
			System.out.println("ID: " + dpa.getId() + "---" + "PRIMEIGQ: " + dpa.getPrimeiroGQ());
			//HistoricoEscolar he = f.consultarHistoricoEscolarPorId(1);
			//he.getMatricula().getId() + "---" + "Id Disciplina: " + he.getDisciplina().getId()
			//System.out.println("Id Matricula: " + "---" + he.getNotaFinal() + "---" + he.getDataCursada());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
