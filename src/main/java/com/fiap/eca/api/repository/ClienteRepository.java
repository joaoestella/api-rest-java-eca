package com.fiap.eca.api.repository;
import com.fiap.eca.api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}