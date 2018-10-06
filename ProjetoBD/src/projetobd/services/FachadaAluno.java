/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd.services;

import java.util.Date;
import projetobd.dados.RepositorioMatriculas;
import projetobd.model.Aluno;
import projetobd.model.Endereco;

/**
 *
 * @author keyalisth
 */
public class FachadaAluno {
    private AlunoService service;
    private static FachadaAluno instancia=null;
    
 
    
    private void FachadaAluno(){
        this.service= new AlunoService(new RepositorioMatriculas());
    }
    
    public static FachadaAluno getInstance(){
        if(instancia==null){
            instancia= new FachadaAluno();
        }
        return instancia;
    }
    
    public void matricularAluno(String cpf, String nome, String sobrenome, Date datanasc ,Endereco e){
        service.MatricularAluno(service.novoAluno(cpf, nome, sobrenome, datanasc, e));
    }
    
    
}
