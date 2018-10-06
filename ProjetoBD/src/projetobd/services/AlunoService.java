/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd.services;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetobd.dados.util.IRepMatricula;
import projetobd.model.Aluno;
import projetobd.model.Endereco;
import projetobd.model.Matricula;

/**
 *
 * @author keyalisth
 */
public class AlunoService {
    
    IRepMatricula irep;
    
    public AlunoService(IRepMatricula irep){
        this.irep = irep;
    }
    
    public Aluno novoAluno(String cpf, String nome , String sobrenome , Date datanasc , Endereco e){
     return new Aluno(cpf,nome,sobrenome,datanasc,e);
    }
    
    public void MatricularAluno(Aluno aluno){
        try {
            irep.inserir(new Matricula(aluno));
        } catch (Exception ex) {
            Logger.getLogger(AlunoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
