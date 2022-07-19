package com.kodehive.kodehive.quiz2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodehive.kodehive.quiz2.model.Q2MahasiswaModel;
import com.kodehive.kodehive.quiz2.repository.IQ2MahasiswaRepository;
import com.kodehive.kodehive.quiz2.service.IQ2MahasiswaService;

@Service
public class Q2MahasiswaService implements IQ2MahasiswaService {
	
	@Autowired
	IQ2MahasiswaRepository mahasiswaRepo;

	@Override
	public int insert(Q2MahasiswaModel model) {
		return mahasiswaRepo.insert(model);
	}

	@Override
	public List<Q2MahasiswaModel> readMahasiswa(Q2MahasiswaModel model) {
		return mahasiswaRepo.readMahasiswa(model);
	}

	@Override
	public List<Q2MahasiswaModel> readById(Q2MahasiswaModel model, int id) {
		return mahasiswaRepo.readById(model, id);
	}

}
