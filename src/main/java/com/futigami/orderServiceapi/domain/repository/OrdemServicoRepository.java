package com.futigami.orderServiceapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futigami.orderServiceapi.domain.model.OrdemServico;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long>{
	
}
