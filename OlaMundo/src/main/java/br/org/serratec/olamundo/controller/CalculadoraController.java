package br.org.serratec.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@GetMapping("/somar")
	public Double somar(@RequestParam Double num1, @RequestParam Double num2) {
		Double resultado = num1 + num2;
		return resultado;
	}
	
	@GetMapping("/subtrair")
	public Double subtrair(@RequestParam Double num1, @RequestParam Double num2) {
		Double resultado = num1 - num2;
		return resultado;
	}
	
	@GetMapping("/multiplicar")
	public Double multiplicar(@RequestParam Double num1, @RequestParam Double num2) {
		Double resultado = num1 * num2;
		return resultado;
	}
	
	@GetMapping("/dividir")
	public Double dividir(@RequestParam Double num1, @RequestParam Double num2) {
		Double resultado = num1 / num2;
		return resultado;
	}

}
