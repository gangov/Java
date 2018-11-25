package com.softuni.controller;

import com.softuni.model.CalculatorModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("operator", "+");
		model.addAttribute("view", "views/calculatorForm");
		return "base-layout";
	}

	@PostMapping("/")
	public String calculateConfirm(@RequestParam("leftOperand") String leftOperandStr,
								   @RequestParam("operator") String operator,
								   @RequestParam("rightOperand") String rightOperandStr,
								   Model model) {
		CalculatorModel calculator = new CalculatorModel();


		Double leftOperand;
		Double rightOperand;

		try {
			leftOperand = Double.parseDouble(leftOperandStr);
		} catch (NumberFormatException nfe) {
			leftOperand = 0d;
		}

		try {
			rightOperand = Double.parseDouble(rightOperandStr);
		} catch (NumberFormatException nfe) {
			rightOperand = 0d;
		}

		calculator.setLeftOperand(leftOperand);
		calculator.setOperator(operator);
		calculator.setRightOperand(rightOperand);

		Double result = calculator.calculate();
		model.addAttribute("leftOperand", calculator.getLeftOperand());
		model.addAttribute("operator", calculator.getOperator());
		model.addAttribute("rightOperand", calculator.getRightOperand());
		model.addAttribute("result", result);
		model.addAttribute("view", "views/calculatorForm");
		return "base-layout";
	}
}
