package br.com.alura.codechella.domain.evento;

import br.com.alura.codechella.domain.ingreco.TipoIngresso;
import lombok.Getter;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Evento {

    private UUID uuid;
    private Categoria categoria;

    private String descricao;

    private LocalDateTime dataCadastro;

    private Endereco endereco;
    //Agregado de evento
    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    public Evento(Categoria categoria, String descricao, LocalDateTime dataCadastro, Endereco endereco) {
        gerarIdentificadorUnico();//gera um identificador unico
        this.categoria = categoria;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
    }

    private void gerarIdentificadorUnico() {
        this.uuid = UUID.randomUUID();
    }

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso) {
        this.tipoIngressos.add(tipoIngresso);
    }

    public void aumentaNumeroDeIngressoPorTipo(){
        // implementar aqui
    }


}
