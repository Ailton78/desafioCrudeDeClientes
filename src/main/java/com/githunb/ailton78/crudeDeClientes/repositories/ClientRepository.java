package com.githunb.ailton78.crudeDeClientes.repositories;

import com.githunb.ailton78.crudeDeClientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
