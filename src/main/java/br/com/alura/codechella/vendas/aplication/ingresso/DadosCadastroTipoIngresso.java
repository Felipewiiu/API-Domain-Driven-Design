package br.com.alura.codechella.vendas.aplication.ingresso;

import br.com.alura.codechella.vendas.domain.ingreco.Definicao;
import br.com.alura.codechella.vendas.domain.ingreco.Setor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record DadosCadastroTipoIngresso(
        @NotNull(message = "O setor do ingresso é obrigatório!")
        Setor setor,
        @NotNull(message = "A definição do tipo de ingresso é obrigatória!")
        Definicao definicao,
        @NotNull
        Double valor,
        @Positive
        int totalDisponivel

) {
}
