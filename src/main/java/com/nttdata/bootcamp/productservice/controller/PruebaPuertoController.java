package com.nttdata.bootcamp.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaPuertoController {
	
	@Autowired
	private Environment enviroment;

	@RequestMapping("/port")
	public String getPort() {

		return "Server port running is: " + enviroment.getProperty("local.server.port");

	}
}