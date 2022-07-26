package br.com.sinqia.primeiroprojetoweb.dao;

import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import java.util.List;

public interface ClienteDAOI {
    Cliente save(Cliente cliente);
    List<Cliente> findAll();
}
