package br.com.sinqia.primeiroprojetoweb.injecao.email;

import br.com.sinqia.primeiroprojetoweb.model.Cliente;

import javax.inject.Named;

@Named("servicoGmail")
@ServicoGmailQualifier
public class GmailService implements EmailService {
    public void enviaEmailBoasVindas(Cliente cliente){
        System.out.println("GMAIL SERVICE: Enviando email de boas-vindas para: "
                .concat(cliente.getEmail()));
    }
}
