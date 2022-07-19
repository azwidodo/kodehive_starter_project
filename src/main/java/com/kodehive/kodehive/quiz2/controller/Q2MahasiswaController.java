package com.kodehive.kodehive.quiz2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodehive.kodehive.quiz2.model.Q2MahasiswaModel;
import com.kodehive.kodehive.quiz2.service.IQ2MahasiswaService;

@Controller
@RequestMapping("/quiz2")
public class Q2MahasiswaController {
	
	@Autowired
	IQ2MahasiswaService mahasiswaService;
	
	@PostMapping("/insertMahasiswa")
	@ResponseBody
	public int insert(@RequestBody Q2MahasiswaModel model) {
		return mahasiswaService.insert(model);
	}

	@GetMapping("/readMahasiswa")
	@ResponseBody
	public List<Q2MahasiswaModel> readMahasiswa(Q2MahasiswaModel model) {
		return mahasiswaService.readMahasiswa(model);
	}

	@GetMapping("/readMahasiswaById")
	@ResponseBody
	public List<Q2MahasiswaModel> readById(Q2MahasiswaModel model, int id) {
		return mahasiswaService.readById(model, id);
	}

}
