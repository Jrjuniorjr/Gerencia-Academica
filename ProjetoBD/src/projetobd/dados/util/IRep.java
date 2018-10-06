/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd.dados.util;

/**
 *
 * @author keyalisth
 */
public interface IRep<E> {
    
    
    public void inserir(E e) throws Exception;
    public void atualzar(E e) throws Exception;
    public void remover(E e) throws Exception;
    public E procurar(String key ) throws Exception; 
}
