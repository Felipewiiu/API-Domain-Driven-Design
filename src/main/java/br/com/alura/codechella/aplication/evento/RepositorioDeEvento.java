package br.com.alura.codechella.aplication.evento;

import br.com.alura.codechella.domain.evento.Endereco;
import br.com.alura.codechella.domain.evento.Evento;

public interface RepositorioDeEvento {
    // Passa adiante a responsabilidade de implementação
    Evento buscarEventoPorCidade(Endereco cep);
}
