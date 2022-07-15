package com.kodehive.kodehive.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.kodehive.model.SkripsiModel;
import com.kodehive.kodehive.repository.ISkripsiRepository;

@Repository
public class SkripsiRepository implements ISkripsiRepository {
	
	@Autowired
	JdbcTemplate jdbc;

	// Menampilkan skripsi yang tahun pembuatannya tidak lebih tahun (?)
	@Override
	public List<SkripsiModel> nomor1(SkripsiModel skripsi, int tahun) {
		var query = "SELECT * FROM t_skripsi WHERE tahun <= ?";
	
		List<SkripsiModel> models = jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class), tahun);

		return models;
	}
	
	// Menampilkan skripsi yang mengandung kata (?)
	@Override
	public List<SkripsiModel> nomor2(SkripsiModel skripsi, String kata) {
		var query = "SELECT * FROM t_skripsi WHERE judul LIKE '%" + kata + "%'";
		
		List<SkripsiModel> models = jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));

		return models;
	}

	// Menampilkan skripsi yang dibuat pada tahun (?) dan mendapatkan nilai (?)
	@Override
	public List<SkripsiModel> nomor3(SkripsiModel skripsi, int tahun, int nilai) {
		var query = "SELECT * FROM t_skripsi WHERE tahun = ? AND nilai = ?";
		
		List<SkripsiModel> models = jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class), tahun, nilai);

		return models;
	}

	// Menampilkan semua skripsi kecuali skripsi tahun (?)
	@Override
	public List<SkripsiModel> nomor4(SkripsiModel skripsi, int tahun) {
		var query = "SELECT * FROM t_skripsi WHERE tahun != ?";
		
		List<SkripsiModel> models = jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class), tahun);

		return models;
	}

	// Menampilkan skripsi dari yang terbaru hingga terlawas dan tidak boleh yang judulnya berawalan huruf (?)
	@Override
	public List<SkripsiModel> nomor5(SkripsiModel skripsi, String huruf) {
		var query = "SELECT * FROM t_skripsi WHERE judul NOT LIKE '" + huruf + "%'ORDER BY tahun DESC";
		
		List<SkripsiModel> models = jdbc.query(query, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));

		return models;
	}


}
