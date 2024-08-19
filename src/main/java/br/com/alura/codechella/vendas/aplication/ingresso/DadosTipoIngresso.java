package br.com.alura.codechella.vendas.aplication.ingresso;

import br.com.alura.codechella.vendas.domain.ingreco.Definicao;
import br.com.alura.codechella.vendas.domain.ingreco.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}
