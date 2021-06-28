package br.com.lae.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lae.math.SimpleMath;
import br.com.lae.math.ValidateNumber;
import br.com.lae.request.converters.NumberConverter;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, 
		@PathVariable("numberTwo") String numberTwo) throws Exception {
		ValidateNumber.isTwoStrNumberValid(numberOne, numberTwo);
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, 
		@PathVariable("numberTwo") String numberTwo) throws Exception {
		ValidateNumber.isTwoStrNumberValid(numberOne, numberTwo);
		return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, 
		@PathVariable("numberTwo") String numberTwo) throws Exception {
		ValidateNumber.isTwoStrNumberValid(numberOne, numberTwo);
		return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value="/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, 
		@PathVariable("numberTwo") String numberTwo) throws Exception {
		ValidateNumber.isTwoStrNumberValid(numberOne, numberTwo);
		return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value="/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double average(@PathVariable("numberOne") String numberOne, 
		@PathVariable("numberTwo") String numberTwo) throws Exception {
		ValidateNumber.isTwoStrNumberValid(numberOne, numberTwo);
		return math.average(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value="/sqrt/{numberOne}", method = RequestMethod.GET)
	public Double sqrt(@PathVariable("numberOne") String numberOne) throws Exception {
		ValidateNumber.isTwoStrNumberValid(numberOne, "0");
		return math.sqrt(NumberConverter.convertToDouble(numberOne));
	}
	
}
