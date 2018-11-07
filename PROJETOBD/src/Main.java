
import model.*;
public class Main {

	
	public static void main(String []args){
		//INSERT INTO `mydb`.`Departamento` (`codigo`, `nome`, `bloco`) VALUES ('CCT', 'Centro de Ciências Tecnológicas', 'D');
		Departamento d = new Departamento("EXT", "Centro de ciencias Exatas", 'z');
		Fachada f = Fachada.getInstance();
		
		try {
			f.inserirDepartamento(d);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
