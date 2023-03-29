package com.linuxtips.javaweekapi.core.domain;

import com.linuxtips.javaweekapi.core.exceptions.ValidationException;

public class Curso {
    public final String id;
    public final String nome;
    public final Double preco;
    public final String pessoaInstrutora;

    public Curso(String id, String nome, Double preco, String pessoaInstrutora) throws Exception {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.pessoaInstrutora = pessoaInstrutora;
        this.validate();
    }

    private void validate() throws Exception {
        if (id.isEmpty() || id.isBlank())
            throw new ValidationException("Id não pode ser nulo");
        if (nome.isEmpty() || nome.isBlank())
            throw new ValidationException("Nome não pode ser nulo");
        if (preco <= 0)
            throw new ValidationException("Preço não pode ser negativo");
        if (pessoaInstrutora.isEmpty() || pessoaInstrutora.isBlank())
            throw new ValidationException("Pessoa Instrutora não pode ser nulo");
    }
}
