package com.kodehive.kodehive.quiz2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodehive.kodehive.quiz2.model.Q2JudulSkripsiModel;
import com.kodehive.kodehive.quiz2.service.IQ2JudulSkripsiService;

@Controller
@RequestMapping("/quiz2")
public class Q2JudulSkripsiController {
	
	@Autowired
	IQ2JudulSkripsiService judulService;
	
	@PostMapping("/insert")
	@ResponseBody
	public int insert(@RequestBody Q2JudulSkripsiModel judul) {
		return judulService.insert(judul);
	}
	
	@GetMapping("/readSkripsiMahasiswa")
	@ResponseBody
	public List<Q2JudulSkripsiModel> readSkripsiMahasiswa(Q2JudulSkripsiModel judul) {
		return judulService.readSkripsiMahasiswa(judul);
	}
	
	@GetMapping("/readSkripsiMahasiswaByKategori")
	@ResponseBody
	public List<Q2JudulSkripsiModel> readSkripsiMahasiswaByKategori(Q2JudulSkripsiModel judul, @RequestParam int kategori_id) {
		return judulService.readSkripsiMahasiswaByKategori(judul, kategori_id);
	}

}
