package com.kodehive.kodehive.quiz2.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kodehive.kodehive.quiz2.model.Q2JudulSkripsiModel;
import com.kodehive.kodehive.quiz2.repository.IQ2JudulSkripsiRepository;

@Repository
public class JudulSkripsiRepository implements IQ2JudulSkripsiRepository {
	
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public int insert(Q2JudulSkripsiModel model) {
		var query = "INSERT INTO q2_judul_skripsi(judul, tahun, nilai, mahasiswa_id, kategori_id) "
				+ "VALUES (?, ?, ?, ?, ?)";
		
		return jdbc.update(query, new Object[] {model.getJudul(), model.getTahun(),
				model.getNilai(), model.getMahasiswa_id(), model.getKategori_id()});
	}

	@Override
	public List<Q2JudulSkripsiModel> readSkripsiMahasiswa(Q2JudulSkripsiModel judul) {
		var query = "SELECT m.id, m.nama, m.jurusan, j.judul FROM q2_judul_skripsi j LEFT JOIN q2_mahasiswa m ON j.mahasiswa_id = m.id";
		
		return jdbc.query(query, new BeanPropertyRowMapper<Q2JudulSkripsiModel>(Q2JudulSkripsiModel.class));
	}

	@Override
	public List<Q2JudulSkripsiModel> readSkripsiMahasiswaByKategori(Q2JudulSkripsiModel judul, int kategori_id) {
		var query = "SELECT m.nama, m.jurusan, j.judul, k.kategori FROM q2_judul_skripsi j LEFT JOIN q2_mahasiswa m ON j.mahasiswa_id = m.id"
				+ " LEFT JOIN q2_kategori_skripsi k ON j.kategori_id = k.id WHERE k.id = ?";
		
		return jdbc.query(query, new BeanPropertyRowMapper<Q2JudulSkripsiModel>(Q2JudulSkripsiModel.class), kategori_id);
	}

}
