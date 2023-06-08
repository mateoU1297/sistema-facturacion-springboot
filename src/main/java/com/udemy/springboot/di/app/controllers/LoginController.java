package com.udemy.springboot.di.app.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login(@RequestParam(required = false) String error, @RequestParam(required = false) String logout,
			Model model, Principal principal, RedirectAttributes flash) {

		if (principal != null) {
			flash.addFlashAttribute("info", "Ya ha iniciado sesión anteriormente");
			return "redirect:/";
		}

		if (error != null) {
			model.addAttribute("error", "Nombre de usuario o contraseña incorrectos");
		}
		
		if(logout != null) {
			model.addAttribute("success", "Ha cerrado sesión con éxito!");
		}

		return "login";
	}

}
