package com.kodehive.kodehive.quiz2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.kodehive.quiz2.model.Q2JudulSkripsiModel;
import com.kodehive.kodehive.quiz2.model.Q2SkripsiMahasiswaByKategori;
import com.kodehive.kodehive.quiz2.model.Q2SkripsiMahasiswa;
import com.kodehive.kodehive.quiz2.repository.IQ2JudulSkripsiRepository;
import com.kodehive.kodehive.quiz2.service.IQ2JudulSkripsiService;

@Service
public class Q2JudulSkripsiService implements IQ2JudulSkripsiService {
	
	@Autowired
	IQ2JudulSkripsiRepository judulRepo;

	@Override
	public int insert(Q2JudulSkripsiModel model) {
		return judulRepo.insert(model);
	}

	@Override
	public List<Q2SkripsiMahasiswa> readSkripsiMahasiswa(Q2SkripsiMahasiswa judul) {
		return judulRepo.readSkripsiMahasiswa(judul);
	}

	@Override
	public List<Q2SkripsiMahasiswaByKategori> readSkripsiMahasiswaByKategori(Q2SkripsiMahasiswaByKategori judul, String kategori) {
		return judulRepo.readSkripsiMahasiswaByKategori(judul, kategori);
	}

}
