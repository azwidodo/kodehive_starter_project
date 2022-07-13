package com.kodehive.kodehive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/kodehive")
public class MahasiswaController {

	@RequestMapping("/karyawan")
	public String viewKaryawan() {
		return "/company/divisi/karyawan";
	}
	
	@RequestMapping({"/mahasiswa"})
	public String viewMahasiswa() {
		return "/kampus/kelas/mahasiswa";
	}

}
