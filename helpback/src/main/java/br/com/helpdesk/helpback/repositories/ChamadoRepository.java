package br.com.helpdesk.helpback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.helpdesk.helpback.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
