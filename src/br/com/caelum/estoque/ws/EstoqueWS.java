package br.com.caelum.estoque.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ListaItens;

@WebService
public class EstoqueWS {

	private ItemDao dao = new ItemDao();

	@WebMethod(operationName="todosOsItens")
	@WebResult(name="itens")
	public ArrayList<Item> getItens(Filtros filtros) { //cuidado, plural
        System.out.println("Chamando getItens()");
        List<Filtro> lista = filtros.getLista();
        return dao.todosItens(lista);
        //List<Item> itensResultado = dao.todosItens(lista);
        //return new ListaItens(itensResultado);
    }
    
	
	/*
    public List<Item> todosItens() {
        System.out.println("Chamando todosItens()");
        return dao.todosItens();
    }
    */
}
