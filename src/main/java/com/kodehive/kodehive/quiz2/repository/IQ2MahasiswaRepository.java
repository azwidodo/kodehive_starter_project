package com.kodehive.kodehive.quiz2.repository;

import java.util.List;

import com.kodehive.kodehive.quiz2.model.Q2MahasiswaModel;

public interface IQ2MahasiswaRepository {

	public int insert(Q2MahasiswaModel model);
	public List<Q2MahasiswaModel> readById(Q2MahasiswaModel model, int id);
}
