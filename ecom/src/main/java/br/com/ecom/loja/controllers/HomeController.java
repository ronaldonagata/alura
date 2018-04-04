package br.com.ecom.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/*This attende to a certain path or address*/
	@RequestMapping("/")
	public String index() {
		System.out.println("Entrando na home da CDC");
		
		return "home";
	}
}
