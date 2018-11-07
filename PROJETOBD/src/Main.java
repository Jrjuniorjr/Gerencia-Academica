
import model.*;
public class Main {

	
	public static void main(String []args){
		//INSERT INTO `mydb`.`Departamento` (`codigo`, `nome`, `bloco`) VALUES ('CCT', 'Centro de Ciências Tecnológicas', 'D');
		Fachada f = Fachada.getInstance();
		try {
			Departamento d = f.consultarDepartamento("EXT");
			System.out.println("Nome: " + d.getNome() + "---Bloco" + d.getBloco());
			Curso curso = new Curso("M4", "MATEMATICA", 10, d);
			f.inserirCurso(curso);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
