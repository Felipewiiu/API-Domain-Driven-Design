package br.com.alura.codechella.vendas.aplication.evento;

import br.com.alura.codechella.vendas.domain.evento.Endereco;
import br.com.alura.codechella.vendas.domain.evento.Evento;

public interface RepositorioDeEvento {
    // Passa adiante a responsabilidade de implementação
    Evento buscarEventoPorCidade(Endereco cep);
}
