package com.kodehive.kodehive.quiz2.service;

import java.util.List;

import com.kodehive.kodehive.quiz2.model.Q2JudulSkripsiModel;

public interface IQ2JudulSkripsiService {
	
	public int insert(Q2JudulSkripsiModel model);
	public List<Q2JudulSkripsiModel> readSkripsiMahasiswa(Q2JudulSkripsiModel judul);
	public List<Q2JudulSkripsiModel> readSkripsiMahasiswaByKategori(Q2JudulSkripsiModel judul, int kategori_id);

}
