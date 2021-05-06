package com.university.University.controlador;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.university.University.interfazService.IAlumnoService;
import com.university.University.modelo.Alumno;
import com.university.University.modelo.Subject;
import com.university.University.services.SubjectService;

@Controller
@RequestMapping("/private")
public class PrivateController {

	@Autowired
	private IAlumnoService alumnoService;
	
	@Autowired 
	private SubjectService subjService;
	//@GetMapping("/index")
	//public String index(Authentication auth, HttpSession session) {
		//String dni= auth.getUsername();
		
		
		//if(session.getAttribute("alumno") == null) {
			//Alumno alumno = alumnoService.findByDni(dni);
			//	alumno.setDni(null);
				//session.setAttribute("alumno", alumno);
			//}
			//return "index";
	
//	@GetMapping("/inscripcion")
//	public String listarSubjects(Model model) {
//		List<Subject>subject = subjService.listarSubjects();
//		model.addAttribute("subjects", subject);
//		return "inscripcion";	
//	}
	
	
}
		
	
	
	

