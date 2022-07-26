package br.com.sinqia.primeiroprojetoweb.injecao;

import javax.inject.Named;

//@Named("amarela")
@AmareloQualifier
public class Amarela implements Cor{
    @Override
    public String definirCor() {
        return "Amarela";
    }
}
