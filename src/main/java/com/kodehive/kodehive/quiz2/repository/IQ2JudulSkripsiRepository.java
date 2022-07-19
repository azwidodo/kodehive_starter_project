package com.kodehive.kodehive.quiz2.repository;

import java.util.List;

import com.kodehive.kodehive.quiz2.model.Q2JudulSkripsiModel;
import com.kodehive.kodehive.quiz2.model.Q2SkripsiMahasiswaByKategori;
import com.kodehive.kodehive.quiz2.model.Q2SkripsiMahasiswa;


public interface IQ2JudulSkripsiRepository {

	public int insert(Q2JudulSkripsiModel model);
	public List<Q2SkripsiMahasiswa> readSkripsiMahasiswa(Q2SkripsiMahasiswa judul);
	public List<Q2SkripsiMahasiswaByKategori> readSkripsiMahasiswaByKategori(Q2SkripsiMahasiswaByKategori judul, String kategori);
}
