package com.proyceto.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Dashboard/admin")
public class Home {
	
	@GetMapping("/categoriaProducto/listar")
	public String irhome() {
		return "Dashboard/categoriaProducto/categoriaProductoListar";
	}
	@GetMapping("/producto/listar")
	public String produ() {
		return "Dashboard/productos/productosListar";
	}
	
	@GetMapping("")
	public String homdos() {
		return "inicioAdmin";
		
	}
	@GetMapping("/categoriaProducto/crear")
	public String irpene() {
		return "Dashboard/categoriaProducto/categoriaProductoCrear";
	}
	
}
