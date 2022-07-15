package com.kodehive.kodehive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.kodehive.model.SkripsiModel;
import com.kodehive.kodehive.repository.ISkripsiRepository;
import com.kodehive.kodehive.service.ISkripsiService;

@Service
public class SkripsiService implements ISkripsiService {
	
	@Autowired
	ISkripsiRepository skripsiRepository;

	@Override
	public List<SkripsiModel> nomor1(SkripsiModel skripsi, int tahun) {
		return skripsiRepository.nomor1(skripsi, tahun);
	}

	@Override
	public List<SkripsiModel> nomor2(SkripsiModel skripsi, String kata) {
		return skripsiRepository.nomor2(skripsi, kata);
	}

	@Override
	public List<SkripsiModel> nomor3(SkripsiModel skripsi, int tahun, int nilai) {
		return skripsiRepository.nomor3(skripsi, tahun, nilai);
	}

	@Override
	public List<SkripsiModel> nomor4(SkripsiModel skripsi, int tahun) {
		return skripsiRepository.nomor4(skripsi, tahun);
	}

	@Override
	public List<SkripsiModel> nomor5(SkripsiModel skripsi, String huruf) {
		return skripsiRepository.nomor5(skripsi, huruf);
	}
	
	

}
