package br.com.helpdesk.helpback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.helpdesk.helpback.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
