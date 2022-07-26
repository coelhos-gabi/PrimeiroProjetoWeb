package br.com.sinqia.primeiroprojetoweb.dao;

import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import java.util.ArrayList;
import java.util.List;

/** Classe que representa o acesso a base de dados
        * @author gabrielacoelho
        * @since 22/07/2022
        * @version 1.0.0
        * isso deve ser subsitituido pela nomenclatura repository
        */

public class ClienteDAOImpl implements ClienteDAOI {

    private static final List<Cliente> bancoClientes = new ArrayList<>();
    private static long countCliente = 0;
    @Override
    public Cliente save(Cliente cliente){
        countCliente++;
        cliente.setId(countCliente);
        bancoClientes.add(cliente);
        return cliente;
    }
    @Override
    public List<Cliente> findAll(){
        return bancoClientes;
    }

}
