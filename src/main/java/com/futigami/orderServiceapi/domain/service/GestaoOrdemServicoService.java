package com.futigami.orderServiceapi.domain.service;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futigami.orderServiceapi.domain.exception.NegocioException;
import com.futigami.orderServiceapi.domain.model.Cliente;
import com.futigami.orderServiceapi.domain.model.OrdemServico;
import com.futigami.orderServiceapi.domain.model.StatusOrdemServico;
import com.futigami.orderServiceapi.domain.repository.ClienteRepository;
import com.futigami.orderServiceapi.domain.repository.OrdemServicoRepository;

@Service
public class GestaoOrdemServicoService {
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public OrdemServico criar(OrdemServico ordemServico) {
		Cliente cliente = clienteRepository.findById(ordemServico.getCliente().getId())
				.orElseThrow(() -> new NegocioException("Cliente não encontrado"));
		
		ordemServico.setCliente(cliente);
		ordemServico.setStatus(StatusOrdemServico.ABERTA);
		ordemServico.setDataAbertura(OffsetDateTime.now());
		
		return ordemServicoRepository.save(ordemServico);
	}
	
}
