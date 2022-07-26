package br.com.sinqia.primeiroprojetoweb.bo;

import br.com.sinqia.primeiroprojetoweb.dao.ClienteDAOI;
import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;

public class ClienteBusinessObjectImpl implements ClienteBusinessObjectI {

    private final ClienteDAOI clienteDAO;

    @Inject
    public ClienteBusinessObjectImpl(ClienteDAOI clienteDAOI) {
       this.clienteDAO = clienteDAOI;
    }

    public Cliente save(Cliente cliente){
        valida(cliente);
        return clienteDAO.save(cliente);
    }

    private void valida(Cliente cliente) {
        if(Objects.isNull(cliente.getNome())){
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public List<Cliente> findAll(){
        return clienteDAO.findAll();
    }
}
