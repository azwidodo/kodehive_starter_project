package com.kodehive.kodehive.service;

import java.util.List;

import com.kodehive.kodehive.model.SkripsiModel;

public interface ISkripsiService {
	
	public List<SkripsiModel> nomor1(SkripsiModel skripsi, int tahun);
	public List<SkripsiModel> nomor2(SkripsiModel skripsi, String kata);
	public List<SkripsiModel> nomor3(SkripsiModel skripsi, int tahun, int nilai);
	public List<SkripsiModel> nomor4(SkripsiModel skripsi, int tahun);
	public List<SkripsiModel> nomor5(SkripsiModel skripsi, String huruf);
	
}
