package com.cosmeticos.tcc.pgsrcosmeticos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cosmeticos.tcc.pgsrcosmeticos.model.Cliente;
import com.cosmeticos.tcc.pgsrcosmeticos.repository.ClienteRepository;


@Controller
@RequestMapping("/cosmetico/cliente")
public class ClienteController {
	
	
	public ClienteController(ClienteRepository clienteRepository) {
	}
	
	//Carregar o formulario de cadastro
	@GetMapping("/novo-cliente")
	public String novoCliente(Cliente cliente, Model model) {
		model.addAttribute("cliente",cliente);
		return "cadastro_cliente";	
	}
	
	
	
	
	
}
