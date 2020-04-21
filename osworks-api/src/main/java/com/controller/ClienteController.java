package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("Lucas Daniel");
		cliente1.setEmail("lucas@gmail.com");
		cliente1.setTelefone("98522-5252");
		
		var cliente2 = new Cliente();		
		cliente2.setId(1L);
		cliente2.setNome("Paulo Gabriel");
		cliente2.setEmail("paulo@gmail.com");
		cliente2.setTelefone("98552-1525");	
		
		return Arrays.asList(cliente1,cliente2);
	}

}
