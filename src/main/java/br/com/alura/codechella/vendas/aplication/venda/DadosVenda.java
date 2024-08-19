package br.com.alura.codechella.vendas.aplication.venda;

import br.com.alura.codechella.vendas.aplication.ingresso.DadosTipoIngresso;
import br.com.alura.codechella.vendas.aplication.usuario.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
