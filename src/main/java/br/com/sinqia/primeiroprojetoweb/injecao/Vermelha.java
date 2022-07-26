package br.com.sinqia.primeiroprojetoweb.injecao;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;

//@Alternative // entende que a amarela é default e vermelha alternativa
//@Named("vermelha")
@VermelhaQualifier
public class Vermelha implements Cor{
    @Override
    public String definirCor() {
        return "Vermelha";
    }
}
