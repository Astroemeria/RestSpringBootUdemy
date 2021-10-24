package br.com.alineavila;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathControler {

	@RequestMapping(value = "/sum/numberOne/numberTwo", method = RequestMethod.GET) // quando não especificado, por
																					// padrao, todos sao get
	public Double sum(@PathVariable("NumberOne") String numberOne, @PathVariable("NumberTwo") String numberTwo)
			throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new Exception();
		}
		Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
		return sum;
	}

	private double convertToDouble(String numberTwo) {
		return 1D;
	}

	private boolean isNumeric(String number) {
		return false;
	}
}
