package br.com.sinqia.primeiroprojetoweb.bo;

import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import java.util.List;

public interface ClienteBusinessObjectI {
    Cliente save(Cliente cliente);
    List<Cliente> findAll();

}
