package com.kodehive.kodehive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PasienController {
	
	@RequestMapping("/pasien")
	public String viewPasien() {
		return "/pasien/pasien";
	}

}
