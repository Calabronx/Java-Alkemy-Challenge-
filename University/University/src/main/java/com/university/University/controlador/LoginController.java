package com.university.University.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.university.University.interfazService.IAlumnoService;
import com.university.University.modelo.Alumno;

@Controller
public class LoginController {

	@Autowired
	private IAlumnoService alumnoService;
	
	@GetMapping("/auth/login")
	public String login(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "login";
	}
	
	@GetMapping("/auth/registro")
	public String registroForm(Model model) {
		model.addAttribute("alumno", new Alumno());
		
		return "registro";
	}
	@PostMapping("/auth/registro")
	public String registro(@Validated @ModelAttribute Alumno alumno, BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			return "redirect:/auth/registro";
		}
		else {
			model.addAttribute("alumno", alumnoService.registrar(alumno));
		}
		
		return "redirect:/auth/login";
	}
	
	@GetMapping("/auth/loginAdmin")
	public String loginAdmin(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "loginAdmin";
	}
}

