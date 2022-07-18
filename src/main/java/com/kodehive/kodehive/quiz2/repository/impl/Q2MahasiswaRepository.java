package com.kodehive.kodehive.quiz2.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.kodehive.quiz2.model.Q2MahasiswaModel;
import com.kodehive.kodehive.quiz2.repository.IQ2MahasiswaRepository;

@Repository
public class Q2MahasiswaRepository implements IQ2MahasiswaRepository {
	
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public int insert(Q2MahasiswaModel model) {
		var query = "INSERT INTO q2_mahasiswa(nama, jurusan) VALUES (?, ?)";
	
		return jdbc.update(query, new Object[] {model.getNama(), model.getJurusan()});
	}

	@Override
	public List<Q2MahasiswaModel> readById(Q2MahasiswaModel model, int id) {
		var query = "SELECT nama FROM q2_mahasiswa WHERE id = ?";
		
		List<Q2MahasiswaModel> models = jdbc.query(query, new BeanPropertyRowMapper<Q2MahasiswaModel>(Q2MahasiswaModel.class), id);
		
		return models;
	}
	
}
