package br.com.alura.codechella.aplication.ingresso;

import br.com.alura.codechella.domain.ingreco.Definicao;
import br.com.alura.codechella.domain.ingreco.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}
