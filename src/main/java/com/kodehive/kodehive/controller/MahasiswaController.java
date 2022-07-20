package com.kodehive.kodehive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kodehive")
public class MahasiswaController {

	@RequestMapping("/home")
	public String home() {
		return "/home";
	}

	@RequestMapping("/account")
	public String account() {
		return "/account";
	}

	@RequestMapping("/karyawan")
	public String viewKaryawan() {
		return "/company/divisi/karyawan";
	}
	
	@RequestMapping({"/mahasiswa"})
	public String viewMahasiswa() {
		return "/kampus/kelas/mahasiswa";
	}

}
