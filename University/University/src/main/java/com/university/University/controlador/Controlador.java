package com.university.University.controlador;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.university.University.interfazService.IAlumnoService;
import com.university.University.interfazService.ISubjectService;
import com.university.University.modelo.Alumno;
import com.university.University.modelo.Subject;

@Controller
@RequestMapping
public class Controlador {
	@Autowired
	private ISubjectService subjService;
	@Autowired
	private IAlumnoService alumnoService;
	
	
	
	@GetMapping("/auth/inscripcion")
	public String listarSubjects(Model model) {
		List<Subject>subject = new ArrayList<>();
		subject = subjService.listarSubjects();
		model.addAttribute("subjects", subject);
		return "inscripcion";	
	}
	
	//Intente hacer que la lista sea ordenada alfabeticamente pero no me funciono este codigo.
//	@GetMapping("/auth/inscripcion")
//	public String listarSubjects(Model model) {
//		List<Subject>subject = new ArrayList();
//		subject = subjService.listarSubjects();
//		model.addAttribute("subjects", subject);
//		Collections.sort(subject,Collections.reverseOrder());
//		return "inscripcion";	
//	}
	@GetMapping("/auth/admin")
	public String listarAlumnos(Model model) {
		List<Alumno>alumno = alumnoService.listarAlumnos();
		model.addAttribute("alumnos", alumno);
		return "admin";
	}
	
	@GetMapping("/auth/gestionMaterias")
	public String listarMateriasAdmin(Model model) {
		List<Subject>subject = subjService.listarSubjects();
		model.addAttribute("subjects", subject);
		return "gestionMaterias";	
	}
	
	
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("subject", new Subject());
		return "form";
	}
	@PostMapping("/save")
	public String save(@Validated Subject s, Model model) {
		subjService.save(s);
		return "redirect:/listarSubjects";
	}
	
	
	@GetMapping("/add")
	public String inscribirMateria(Model model) {
		Subject s = new Subject();
		List<Subject>subjects = subjService.listarSubjects();
		if(s.isDisponible() != false) {
		model.addAttribute("subject", subjects);
		subjects.add(s);
		return "inscripcion";
		}
		return "No se encontro";
	}
	@GetMapping("/disponible")
	public String materiaDisponible(Model model) {
		Subject s = new Subject();
		if(s.isDisponible() == true) {
		
		return "disponible";
	}
		return "Subject [La materia no tiene vacantes disponibles=" + s.isDisponible() + "]";
	}
	@GetMapping("/")
	public String inicio() {
		return "inicio";
	}
	
//	@GetMapping("/legajo")
//	public String legajo(Model model) {
//		List<Alumno>alumno = alumnoService.listarAlumnos();
//		model.addAttribute("alumn", alumno);
//		return "legajo";	
//	}
	

	@GetMapping("/consultar")
	public String consulta(Model model) {
		List<Subject>subject = subjService.listarSubjects();
		model.addAttribute("subjects", subject);
		return "consultar";	
	}
	
	@GetMapping("/legajo")
	public String legajo(Model model) {
		List<Subject>subject = subjService.listarSubjects();
		model.addAttribute("subjects", subject);
		return "consultar";	
	}
	
//	@RequestMapping("/legajo")
//	public String home(Principal principal, Model model) {
//	    if(principal != null) {
//	        model.addAttribute("nombre", principal.getName());
//	        
//	    }
//		return "legajo";
//	}
	
}