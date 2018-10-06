/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd.model;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author keyalisth
 */
public class Aluno {
    
    private String cpf;
    private String nome;
    private String sobrenome; 
    private Endereco endereco;
    private Date datanasc;

    
    public Aluno(){
    }

    public Aluno(String cpf, String nome, String sobrenome, Date datanasc, Endereco e) {
        this.cpf=cpf;
        this.nome=nome;
        this.sobrenome = sobrenome;
        this.datanasc = datanasc;
        this.endereco=e;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    
    
}
