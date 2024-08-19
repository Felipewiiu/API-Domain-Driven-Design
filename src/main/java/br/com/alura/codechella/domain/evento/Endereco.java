package br.com.alura.codechella.domain.evento;

import lombok.Getter;

@Getter
public class Endereco {
    private String cep;
    private Integer numero;
    private String complemento;

    public Endereco(String cep, Integer numero, String complemento) {
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }



    @Override
    public String toString() {
        return String.format("Cep: %s, número %s - complemento %s",
                cep, numero, complemento);
    }
}
