
import java.sql.Date;

import model.*;
public class Main {

	
	public static void main(String []args){
		//INSERT INTO `mydb`.`Departamento` (`codigo`, `nome`, `bloco`) VALUES ('CCT', 'Centro de Ciências Tecnológicas', 'D');
		Fachada f = Fachada.getInstance();
		try {
			Departamento dep = new Departamento("ComputacaoBloco", "AZX", 'C');
			f.inserirDepartamento(dep);
			/*Professor p = new Professor("123431", "1234", "YT", "ZY", dep);
			f.inserirProfessor(p);
			Disciplina disciplina = new Disciplina("Z1", 10, dep, 60, 5, StatusAtivacao.Ativo, "ZARA1", p);
			f.inserirDisciplina(disciplina);
			/*Matricula m = 
			DisciplinasPeriodoAtual d = new  DisciplinasPeriodoAtual(matricula, disciplina, 9.0, 9.0);
			*/
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
