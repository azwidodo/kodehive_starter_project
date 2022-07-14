package com.kodehive.kodehive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodehive.kodehive.model.SkripsiModel;
import com.kodehive.kodehive.service.ISkripsiService;

@Controller
@RequestMapping("/skripsi")
public class SkripsiController {

	@Autowired
	ISkripsiService skripsiService;
	
//	@RequestMapping("/nomor1/{tahun}")
//	public String nomor1(SkripsiModel skripsi, @PathVariable String tahun) {
//		System.out.println("Run nomor 1");
//		skripsiService.nomor1(skripsi, Integer.valueOf(tahun));
//		return "Select success.";
//	}
	
	@RequestMapping("/nomor1")
	@ResponseBody
	public String nomor1(SkripsiModel skripsi) {
		System.out.println("Run nomor 1");
		skripsiService.nomor1(skripsi, 2019);
		return "Select success.";
	}
	
	@RequestMapping("/nomor2/{kata}")
	public String nomor2(SkripsiModel skripsi, @PathVariable String kata) {
		skripsiService.nomor2(skripsi, kata);
		return "Select success.";
	}
	
	@RequestMapping("/nomor3/{tahun}/{nilai}")
	public String nomor3(SkripsiModel skripsi, @PathVariable String tahun, @PathVariable String nilai) {
		skripsiService.nomor3(skripsi, Integer.valueOf(tahun), Integer.valueOf(nilai));
		return "Select success.";
	}
	
	@RequestMapping("/nomor4/{tahun}")
	public String nomor4(SkripsiModel skripsi, @PathVariable String tahun) {
		skripsiService.nomor4(skripsi, Integer.valueOf(tahun));
		return "Select success.";
	}
	
	@RequestMapping("/nomor5/{tahun}")
	public String nomor5(SkripsiModel skripsi, @PathVariable String huruf) {
		skripsiService.nomor5(skripsi, huruf);
		return "Select success.";
	}
	
}
