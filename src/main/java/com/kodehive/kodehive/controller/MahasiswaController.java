package com.kodehive.kodehive.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	@RequestMapping("/jquery")
	public String jquery() {
		return "/jquery_quiz2_no3";
	}

	@RequestMapping("/servlet")
	public String servlet() {
		return "/servlet";
	}

	@RequestMapping("/readServlet")
	public void readServlet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String text = request.getParameter("input");

		// response.setContentType("text/plain");
		response.setHeader("Content-Type", "text/plain");
		response.setHeader("success", "yes");
		PrintWriter writer = response.getWriter();
		writer.write(text);
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
