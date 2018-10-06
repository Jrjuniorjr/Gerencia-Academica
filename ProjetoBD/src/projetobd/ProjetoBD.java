/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd;

import java.time.Instant;
import java.util.Date;
import java.time.LocalDate;
import projetobd.model.Endereco;
import projetobd.services.FachadaAluno;

/**
 *
 * @author keyalisth
 */
public class ProjetoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FachadaAluno f = FachadaAluno.getInstance();
        f.matricularAluno("123456789", "fulanoA", "ninho", Date.from(Instant.MIN), new Endereco());
        f.matricularAluno("123456788", "fulanoB", "ninho", Date.from(Instant.MIN), new Endereco());
        f.matricularAluno("123456787", "fulanoC", "ninho", Date.from(Instant.MIN), new Endereco());
        f.matricularAluno("123456786", "fulanoD", "ninho", Date.from(Instant.MIN), new Endereco());
        f.matricularAluno("123456785", "fulanoE", "ninho", Date.from(Instant.MIN), new Endereco());

    }
    
    //FALTA FAZER O PROPERTIES ,Testar e evoluir o sistema.
}
