
import model.*;
public class Main {

	
	public static void main(String []args){
		//INSERT INTO `mydb`.`Departamento` (`codigo`, `nome`, `bloco`) VALUES ('CCT', 'Centro de Ciências Tecnológicas', 'D');
		Fachada f = Fachada.getInstance();
		try {
			Departamento d = f.consultarDepartamento("EXT");
			System.out.println("Codigo: " + d.getCodigo() + "----Nome: " + d.getNome() + "---Bloco" + d.getBloco());
			Curso curso = new Curso("M4", "MATEMATICA", 10, d);
			Professor p = new Professor("4345","31235" , "Eu", "Eu", d);
			f.inserirProfessor(p);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
