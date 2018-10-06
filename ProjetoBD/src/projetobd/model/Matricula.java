/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd.model;

/**
 *
 * @author keyalisth
 */
public class Matricula {
     private Integer numero;
     private Aluno aluno;

     public Matricula(Aluno aluno){
         this.aluno=aluno;
     }
     
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
     
     
    
    
}
