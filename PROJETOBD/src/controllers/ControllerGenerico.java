package controllers;

import interfaces.IRepGenerico;

public abstract class ControllerGenerico <E>{
	private IRepGenerico<E> repository;
	
    protected ControllerGenerico(IRepGenerico<E> e){
        repository = e;
    }
    
    public void inserir(E e) throws Exception{
        repository.inserir(e);   
    }
    public void atualizar(E e) throws Exception{
        repository.atualizar(e);
    }
    public void remover(E e)throws Exception{
        repository.remover(e);
    }
    public E consultar(String s) throws Exception{
    	return repository.procurar(s);
    }
}
