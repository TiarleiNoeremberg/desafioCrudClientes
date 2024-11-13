package com.tiarlei.desafioCrudClientes.repositories;

import com.tiarlei.desafioCrudClientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
