package br.com.sinqia.primeiroprojetoweb.injecao.email;

import br.com.sinqia.primeiroprojetoweb.model.Cliente;

public interface EmailService {

    void enviaEmailBoasVindas(Cliente cliente);
}
