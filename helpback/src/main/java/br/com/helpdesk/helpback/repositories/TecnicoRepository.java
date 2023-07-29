package br.com.helpdesk.helpback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.helpdesk.helpback.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
