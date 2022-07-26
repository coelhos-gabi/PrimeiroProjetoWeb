package br.com.sinqia.primeiroprojetoweb.model;

import lombok.Data;

@Data
public class Cliente {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private Integer idade;

    public Cliente(String nome, String cpf, String email, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }
}