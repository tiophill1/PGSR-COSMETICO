package com.cosmeticos.tcc.pgsrcosmeticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cosmeticos.tcc.pgsrcosmeticos.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
