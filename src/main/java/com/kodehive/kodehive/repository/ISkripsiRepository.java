package com.kodehive.kodehive.repository;

import java.util.List;

import com.kodehive.kodehive.model.SkripsiModel;

public interface ISkripsiRepository {
	
	public List<SkripsiModel> nomor1(SkripsiModel skripsi, int tahun);
	public List<SkripsiModel> nomor2(SkripsiModel skripsi, String kata);
	public List<SkripsiModel> nomor3(SkripsiModel skripsi, int tahun, int nilai);
	public List<SkripsiModel> nomor4(SkripsiModel skripsi, int tahun);
	public List<SkripsiModel> nomor5(SkripsiModel skripsi, String huruf);
	public int deleteById(int id);
	public int updateData(int id, String judul, int tahun, int nilai);
	public int updateData2(SkripsiModel skripsi, int id);

	public List<SkripsiModel> readAll(SkripsiModel skripsi);

}
