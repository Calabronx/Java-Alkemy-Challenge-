package com.university.University.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class PublicController {

	public String index() {
		return "logout";
	}
}
