package com.kodehive.kodehive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodehive.kodehive.model.SkripsiModel;
import com.kodehive.kodehive.service.ISkripsiService;

@Controller
@RequestMapping("/skripsi")
public class SkripsiController {

	@Autowired
	ISkripsiService skripsiService;
	
	@GetMapping("/nomor1/{tahun}")
	@ResponseBody
	public List<SkripsiModel> nomor1(SkripsiModel skripsi, @PathVariable String tahun) {
		System.out.println("Run nomor 1");
		return skripsiService.nomor1(skripsi, Integer.valueOf(tahun));
	}
	
	@GetMapping("/nomor2/{kata}")
	@ResponseBody
	public List<SkripsiModel> nomor2(SkripsiModel skripsi, @PathVariable String kata) {
		System.out.println("Run nomor 2");
		return skripsiService.nomor2(skripsi, kata);
	}
	
	@GetMapping("/nomor3/{tahun}/{nilai}")
	@ResponseBody
	public List<SkripsiModel> nomor3(SkripsiModel skripsi, @PathVariable String tahun, @PathVariable String nilai) {
		System.out.println("Run nomor 3");
		return skripsiService.nomor3(skripsi, Integer.valueOf(tahun), Integer.valueOf(nilai));
	}
	
	@GetMapping("/nomor4/{tahun}")
	@ResponseBody
	public List<SkripsiModel> nomor4(SkripsiModel skripsi, @PathVariable String tahun) {
		System.out.println("Run nomor 4");		
		return skripsiService.nomor4(skripsi, Integer.valueOf(tahun));
	}
	
	@GetMapping("/nomor5/{huruf}")
	@ResponseBody
	public List<SkripsiModel> nomor5(SkripsiModel skripsi, @PathVariable String huruf) {
		System.out.println("Run nomor 5");	
		return skripsiService.nomor5(skripsi, huruf);
	}
	
	@DeleteMapping("/deleteById")
	@ResponseBody
	public String deleteById(@RequestParam int id) {
		return "Successfully deleted: " + skripsiService.deleteById(id);
	}

	@PutMapping("/updateData")
	@ResponseBody
	public String updateData(@RequestParam int id, @RequestParam String judul, @RequestParam int tahun, @RequestParam int nilai) {
		return "Successfully updated: " + skripsiService.updateData(id, judul, tahun, nilai);
	}
	
	@PutMapping("/updateData2")
	@ResponseBody
	public String updateData2(@RequestBody SkripsiModel skripsi, @RequestParam int id) {
		return "Successfully updated: " + skripsiService.updateData2(skripsi, id);
	}
}
