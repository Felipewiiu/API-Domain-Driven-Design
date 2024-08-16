package br.com.alura.codechella.aplication.venda;

import br.com.alura.codechella.aplication.ingresso.DadosTipoIngresso;
import br.com.alura.codechella.aplication.usuario.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
