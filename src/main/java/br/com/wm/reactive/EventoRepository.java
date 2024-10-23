package br.com.wm.reactive;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EventoRepository extends ReactiveCrudRepository<Evento, Long> {
}
